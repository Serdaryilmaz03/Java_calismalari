package arrays.ArraysLab;

import java.util.Arrays;

public class Questin14 {
    public static void main(String[] args) {
        /*Write a method that accepts 2 arrays and prints a new array containing all their
elements
int[] x = {1,2}    int[] y = {3,4}  = > [1,2,3,4]
int[] x = {4,4}    int[] y = {2,2}  = > [4,4,2,2]
int[] x = {9,2}    int[] y = {3,4}  = > [9,2,3,4]*/
        int[] x = {1,2,3};

        int[] y = {3,4,1,1,1,1,1,6,7,8,9};

        int[] k = new int[x.length+y.length];

        for(int i=0;i<x.length;i++) {

            k[i]=x[i];

        }

        int a = 0;
        for(int j = x.length;j<k.length;j++) {

            k[j]=y[a];
            a++;
        }

        System.out.println(Arrays.toString(k));



    }

}
