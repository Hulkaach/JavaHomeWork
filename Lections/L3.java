package JavaHomeWork.Lections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.SourceDataLine;

public class L3 {

    public static void main(String[] args) {

        StringBuilder day1 = new StringBuilder("29");
        StringBuilder mouth1 = new StringBuilder("03");
        StringBuilder year1 = new StringBuilder("1988");
        StringBuilder[] data1 = new StringBuilder[] { day1, mouth1, year1 };
        List<StringBuilder> d1 = Arrays.asList(data1);
        System.out.println(d1);
        data1[0] = new StringBuilder("09");

        System.out.println(d1);

        List<Integer> qwerty = List.of(1, 12, 14, 15, 123, 1235);
        for (int itemx : qwerty) {System.out.println(itemx);}
        Iterator<Integer> col = qwerty.iterator();
        System.out.println();

        while (col.hasNext()){
            col.remove();
            System.out.println(col.next());
            col.next();            
        }

        Object o = 1;
        GetType(o);
        o = 1.2;
        GetType(o);
        System.out.println(Sum(2, 3));
        System.out.println(Sum(2, 2));

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum("Masha", "Kasha"));
        // createArray();
        int[] array1 = new int[] { 1, 9 };
        for (int i : array1) {
            System.out.printf("%d", i);
        }
        array1 = addItem(array1, 5);
        array1 = addItem(array1, 7);
        System.out.println();
        for (int k : array1) {
            System.out.printf("%d", k);
        }
        ArrayList<Integer> listmazafaka = new ArrayList<Integer>();

        listmazafaka.add(2809);
        listmazafaka.add(123);

        for (Object h : listmazafaka) {
            System.out.println(h);
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> list3 = new ArrayList<>(10);

        ArrayList<Integer> list4 = new ArrayList<>(list3);

        List list12 = new ArrayList<>();

        List<Integer> ls2 = new ArrayList<>();
        ls2.add(1);
        ls2.add(23);
        for (Object x : ls2) {
            System.out.println(x);
        }

        int day = 29;
        int mouth = 03;
        int year = 1988;
        Integer[] date = { day, mouth, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d);

        StringBuilder day1 = new StringBuilder("29");
        StringBuilder mouth1 = new StringBuilder("03");
        StringBuilder year1 = new StringBuilder("1988");
        StringBuilder[] data1 = new StringBuilder[] { day1, mouth1, year1 };
        List<StringBuilder> d1 = Arrays.asList(data1);
        System.out.println(d1);
        data1[0] = new StringBuilder("09");

        System.out.println(d1);

        Character value = null;
        // List<Character> list123 = List.of('s', 'r', 'p', 't', 'g');
        List<Character> list123 = new ArrayList<>();
        list123.add('s');
        list123.add('r');
        list123.add('p');
        list123.add('t');
        System.out.println(list123);
        list123.remove(0);
        List<Character> list222 = List.copyOf(list123);
        System.out.println(list222);

        

    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        } else
            return 0;
    }

    public static int[] addItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    

}
