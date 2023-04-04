package arrays;

import java.util.Arrays;

public class Pizza_2DArray {
    public static void main(String[] args) {
        String[][] pizzas = {{"pineapple", "pepporoni"},
                {"anchovies", "mushrom", "olives"},
                {"4 cheese"},
                { "chicken", "tomatoes", "onions"},
                {"green peppers", "zuccini", "bracoli", "spinach", "shrimp"}
        };
        System.out.println(Arrays.toString(pizzas[0]));
        for (String[] pizza : pizzas) {
            System.out.print(pizza.length + "-");
            System.out.println(Arrays.toString(pizza));
        }
        System.out.println("FOR ITERATOR LOOP");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.print(pizzas[i].length);
            System.out.println(Arrays.toString(pizzas[i]));


        }
        System.out.println("_______________________________________");
        for (String value : pizzas[3]) {
            System.out.println(value);
        }
        int[][] students={
                {4,5,6},
                {12,5,7},
                {23,56,12,55,3}};
        for ( int[] grups:students){
            for (int studentID:grups){
                System.out.println(studentID);
            }
        }

    }
}
