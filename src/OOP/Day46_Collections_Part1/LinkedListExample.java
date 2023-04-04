package OOP.Day46_Collections_Part1;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(67);
        list.add(10);
        list.add(5000);
        list.add(500);
        System.out.println(list.getFirst());
        list.addFirst(2);
        list.addLast(99) ;
    }
}
