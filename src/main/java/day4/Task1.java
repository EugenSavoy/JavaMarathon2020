package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arrayLength = scanner.nextInt();

        if(arrayLength <=0 ){
                System.out.println("Введена неверная длина массива.");
            }
        else {
            int[] numbers = new int[arrayLength];
            int numberGreaterThan8 = 0;
            int numberGreaterThan1 = 0;
            int even = 0;
            int odd = 0;
            int summ=0;

            for (int i = 0; i < numbers.length; i++){
                numbers[i] = random.nextInt(10);
            }

            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] > 8){
                    numberGreaterThan8++;
                }
                if (numbers[i] > 1){
                    numberGreaterThan1++;
                }

                if (numbers[i] % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
                summ += numbers[i];
            }

            System.out.println("Длина массива: " + numbers.length);
            System.out.println("Количество чисел больше 8: " + numberGreaterThan8);
            System.out.println("Количество чисел больше 1: " + numberGreaterThan1);
            System.out.println("Количество четных чисел: " + even);
            System.out.println("Количество нечетных чисел: " + odd);
            System.out.println("Сумма всех элементов массива: " + summ);


        }

    }
 }


