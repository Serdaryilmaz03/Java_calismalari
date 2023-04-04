package arrays;

import java.util.Random;

public class methoidArray {
    public static void main(String[] args) {
printArray(5);
//createArray(4);
//printArray(9);
    }
    public static int[] createArray(int arraySize){
        Random rn = new Random();
        int[] myArray= new int[arraySize];
        for (int i=0;i<myArray.length;i++){
            myArray[i]=rn.nextInt(10);
        }
            return myArray;
    }
    public static void printArray(int number){

        for (int value:createArray(number)){
            System.out.println(value);
        }

    }


}

