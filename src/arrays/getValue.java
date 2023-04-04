package arrays;

import java.util.Scanner;

public class getValue {
    public static void main(String[] args) {
        //create an array
        int [] number=new int[4];
        //pas array to getvalues method
        getValues(number);
        System.out.println("Here Are the numbers that you entred");
        //pass the array to shoewArray method
        showArray(number);

    }

        public static void getValues ( int[] array){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter a series of " + array.length + " numbers");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter number " + (i + 1) + ":");
                array[i] = scn.nextInt();
            }

        }
        public static void showArray ( int[] array){
        for (int value:array){
            System.out.println(value);
        }

        }
    }



