package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxIndex = 0;
        int sum1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (sum >= sum1) {
                   sum1 = sum;
                   maxIndex = i;
                }
            }

            System.out.println("Сумма элементов " + i + "-й строки: " + sum); // для визуализации
        }
        System.out.println("Индекс максимальной суммы строки = " + maxIndex);
    }
}
