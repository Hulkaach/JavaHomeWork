package JavaHomeWork.S4.ex2;

import java.util.Arrays;
import java.util.LinkedList;

public class ex2 {
    /**
     * Построить однонаправленный список целых чисел. Найти сумму четных элементов
     * списка.
     * 
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> listL = new LinkedList<>(Arrays.asList(12, 25, 32, 45, 67));

        int sum = 0;
        for (int i = 0; i < listL.size(); i++) {
            if (listL.get(i) % 2 == 0) {
                sum += listL.get(i);
            }
        }
        System.out.println(sum);
    }
}
