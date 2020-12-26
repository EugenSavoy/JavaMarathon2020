package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        long before = System.currentTimeMillis();


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (a++; a < b; ) {
                if (Math.abs(a) % 10 == 5) {
                    System.out.print(a + " ");
                    a += 10;
                } else a++;
            }
        }

        long after = System.currentTimeMillis();
        System.out.println(after-before);

    }
}
