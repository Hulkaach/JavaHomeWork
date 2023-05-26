package JavaHomeWork.S4.ex4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ex4 {
    /**
     * Построить однонаправленный список целых чисел. Удалить отрицательные элементы
     * списка.
     * 
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, -23, 45, -56, -67, 12, 87, -79, 12, -32));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i --;
            }
        }
        System.out.println(list);
    }
}
