package JavaHomeWork.Lections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class L5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db);
        System.out.println(db.get(44));

        System.out.println(db);
        System.out.println(db.containsValue("один"));
        System.out.println(db.containsKey(1));
        System.out.println(db.containsValue(1));
        System.out.println(db.keySet());
        System.out.println(db.values());

        for (var x : db.entrySet()) {
            System.out.printf("[%d: %s]\n", x.getKey(), x.getValue());
        }

        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        tMap.put(1, "one");
        tMap.put(2, "two");
        tMap.put(4, "four");
        tMap.put(3, "three");
        tMap.put(2, "two");

        System.out.println(tMap);

        Map<Integer, String> linkmap = new LinkedHashMap<Integer, String>();
        linkmap.put(11, "one by one");
        linkmap.put(1, "one");
        linkmap.put(2, "two");
        System.out.println(linkmap);

        Map<Integer, String> list2 = new HashMap<Integer, String>();
        list2.put(11, "one by one");
        list2.put(2, "two");
        list2.put(1, "one");
        System.out.println(list2);


        Map<Integer, String> table = new Hashtable<>();
        table.put(1,"one");
        table.put(11, "one by one");
        table.put(2,"two");
        // table.put(null,"Tttwo");
        System.out.println(table);
    }

}
