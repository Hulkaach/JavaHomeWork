package HomeWork.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи количество чисел: ");
        int num = scanner.nextInt();
        System.out.println(countDiff(num, scanner));

    }

    /**
     *
     * @param n количество чисел
     * @param scanner
     * @return сумма чисел перед отричательным числом
     */
    public static int countDiff(int n, Scanner scanner) {
        int count = 0;
        System.out.println("Введи число: ");
        int a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                count +=a;
            }
            a = b;

        }
        return count;
    }
}

