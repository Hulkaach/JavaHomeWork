package JavaHomeWork.S6;
import java.util.*;

public class Main { 
    public static void main(String[] args) {
        createNotebook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("По какому критерию отфильтровать ноутбуки?");
        System.out.println("1 - Объем ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int userChoice = scanner.nextInt();
        filter(createNotebook(), criterion1(userChoice));
    }

    public static Set<Notebook> createNotebook() {
        Set<Notebook> notebook = new HashSet<Notebook>();
        notebook.add(new Notebook(16, 256, "Win10", "black"));
        notebook.add(new Notebook(16, 512, "Win11", "black"));
        notebook.add(new Notebook(12, 256, "Win10", "grey"));
        notebook.add(new Notebook(8, 512, "Win11", "black"));
        return notebook;
    }

    public static Map<Integer, Object> criterion1(int x) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Object> criterion1Map = new HashMap<>();
        if (x == 1) {
            System.out.println("Какой объем?");
            int ozy = sc.nextInt();
            criterion1Map.put(1, ozy);
        } else if (x == 2) {
            System.out.println("Какой объем?");
            int hdd = sc.nextInt();
            criterion1Map.put(2, hdd);
        } else if (x == 3) {
            System.out.println("Win10 или Win11 ?");
            String win = sc.nextLine();
            criterion1Map.put(3, win);
        } else if (x == 4) {
            System.out.println("Grey или Black ?");
            String color = sc.nextLine();
            criterion1Map.put(4, color);
        }
        return criterion1Map;
    }

    public static void filter(Set<Notebook> notebooks, Map<Integer, Object> criterion) {
        Set<Notebook> filtred = new HashSet<>();
        for (Notebook item : notebooks) {
            boolean filter = true;
            for (Map.Entry<Integer, Object> item2 : criterion.entrySet()) {
                int key = item2.getKey();
                Object value = item2.getValue();

                if (!checkMatch(item, key, value)) {
                    filter = false;
                    break;
                }
            }
            if (filter) {
                filtred.add(item);
            }
        }
        for (Notebook notebook : filtred) {
            System.out.println(notebook);
        }
    }

    public static boolean checkMatch(Notebook notebook, int key, Object value) {
        if (key == 1) {
            int ozy = (int) value;
            return notebook.ozy >= ozy;
        } else if (key == 2) {
            int hdd = (int) value;
            return notebook.volumeHD >= hdd;
        } else if (key == 3) {
            String os = (String) value;
            return notebook.operationSystem.equals(os);
        } else if (key == 4) {
            String color = (String) value;
            return notebook.color.equals(color);
        }
        return false;
    }
    
}
