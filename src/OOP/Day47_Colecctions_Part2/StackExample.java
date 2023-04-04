package OOP.Day47_Colecctions_Part2;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //LIFO last in first out


        Stack<Integer> numsStack = new Stack<>();
        numsStack.add(50);
        numsStack.add(70);
        numsStack.add(500);
        numsStack.add(90);
        System.out.println(numsStack.toString());
        //check value on the top
        System.out.println(numsStack.peek());

        //read value onthe top the remove
        System.out.println(numsStack.pop());

        System.out.println(numsStack.toString());
        System.out.println(numsStack.peek());
    }
}