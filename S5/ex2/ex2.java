package JavaHomeWork.S5.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ex2 {
    /**
     * 2) Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на
     * экран (true),
     * В противном случае (false).
     * 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> array = fillArray();
        System.out.println(test(array));
    }

    private static ArrayList<Integer> fillArray() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        // array.add(2);
        // array.add(5);
        return array;
    }

    public static boolean test(ArrayList<Integer> array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.size(); i++) {
            map.putIfAbsent(array.get(i), 0);
            map.put(array.get(i), map.get(array.get(i)) + 1);
            if (map.get(array.get(i)) > 1) {
                return false;
            }
        }
        return true;
    }

}
