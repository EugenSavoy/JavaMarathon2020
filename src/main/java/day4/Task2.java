package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        int max = numbers[0];
        int min = numbers[0];
        int count0 = 0;
        int summ0 = 0;


        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }

            if (i % 10 == 0) {
                count0++;
                summ0 += i;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + summ0);

    }


}
