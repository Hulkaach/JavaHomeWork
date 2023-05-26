package JavaHomeWork.S5.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ex1 {
    /**
     * Посчитать количество вхождений каждого символа в текст
     * 
     * @param args
     */
    public static void main(String[] args) {
        Map<Character, Integer> listMap = new HashMap<Character, Integer>();
        String text = "qwertyyupms";
        for (int i = 0; i < text.length(); i++) {
            listMap.putIfAbsent(text.charAt(i), 0);
            listMap.put(text.charAt(i), listMap.get(text.charAt(i)) + 1);
        }
        for (var entry : listMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
