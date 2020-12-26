package day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            double divident = sc.nextDouble();
            double divider = sc.nextDouble();

            if (divider == 0) {
                break;
            }

            System.out.println(divident/divider);

        }
        sc.close();
    }
}
