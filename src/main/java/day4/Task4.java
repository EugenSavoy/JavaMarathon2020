package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        for(int i=0; i<numbers.length-2; i++){
            int currentSum = numbers[i] + numbers[i+1]+numbers[i+2];
            if(currentSum > maxSum) {
                maxSum = currentSum;
                index = i;
            }
        }

        if(index >= 0){
            System.out.println(maxSum);
            System.out.println(index);
        }else{
            System.out.println("not found");
        }

    }
}
