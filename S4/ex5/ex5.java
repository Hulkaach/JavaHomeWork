package JavaHomeWork.S4.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ex5 {
    /**
     * https://leetcode.com/problems/simplify-path/
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(simplifyPath(".."));
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo"));

    }

    public static String simplifyPath(String path) {
        String[] arrayStrings = path.split("/");
        System.out.println(Arrays.asList(arrayStrings));

        Stack<String> result = new Stack<>();
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].equals("..")) {
                if (!result.isEmpty()) {
                    result.pop();
                }
            } else if (!arrayStrings[i].isEmpty() && !arrayStrings[i].equals(".")) {
                result.add(arrayStrings[i]);
            }

        }

        String resultString = "/";
        for (int i = 0; i < result.size(); i++) {
            resultString += result.get(i) + "/";

        }
        if (resultString.length() > 1) {
            return resultString.substring(0, resultString.length() - 1);
        }
        return resultString;

    }

}
