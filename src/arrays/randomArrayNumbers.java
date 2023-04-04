package arrays;

import java.util.Random;

public class randomArrayNumbers {
    public static void main(String[] args) {
        Random rn = new Random();
        int[] numbers = new int[10];
        numbers[0] = rn.nextInt(100);
        numbers[1] = rn.nextInt(100);
        numbers[2] = rn.nextInt(100);
        numbers[3] = rn.nextInt(100);
        numbers[4] = rn.nextInt(100);
        numbers[5] = rn.nextInt(100);
        numbers[6] = rn.nextInt(100);
        numbers[7] = rn.nextInt(100);
        numbers[8] = rn.nextInt(100);
        numbers[9] = rn.nextInt(100);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}