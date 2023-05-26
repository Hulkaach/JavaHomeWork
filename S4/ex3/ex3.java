package JavaHomeWork.S4.ex3;

import java.util.Arrays;
import java.util.LinkedList;

public class ex3 {
    /**
     * Заменить некратные 3 элементы списка, суммой нечетных элементов.
     * 
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<Integer>(Arrays.asList(11, 13, 14, 20, 23, 100, 9, 18, 6, 27));
        int sum = 0;
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) % 2 == 0) {
                sum += newList.get(i);
            }
        }
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) % 3 == 0) {
                newList.set(i, sum);
            }
        }
        System.out.println(newList);
    }
}
