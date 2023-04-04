package arrays;

import java.util.Scanner;

public class methodArrays2 {
    public static void main(String[] args) {
        System.out.println(findCar(4, "honda"));


    }

    public static String[] createArray(int carSize) {

        Scanner scan = new Scanner(System.in);
        String[] carArray = new String[carSize];
        for (int i = 0; i < carArray.length; i++) {
            System.out.println("enter your car # " + (1 + i));
            carArray[i] = scan.next();
        }
        return carArray;

    }

    public static boolean findCar(int value, String toFindCar) {

        for (String car : createArray(value)) {
            if (car.equalsIgnoreCase(toFindCar)) {
                return true;
            }
        }
        return false;


    }
}