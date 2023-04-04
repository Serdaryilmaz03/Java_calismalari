package OOP.Day46_Collections_Part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingArraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("javascrpit");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");


        System.out.println(list.toString());

        Collections.sort(list);

        System.out.println(list.toString());

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Spoon", 13.99));
        productList.add(new Product("bog", 100));
        productList.add(new Product("shoes", 59.99));
        productList.add(new Product("computer", 2100.90));

        System.out.println(productList.toString());
        Collections.sort(productList);
        System.out.println("after sorting");
        System.out.println(productList);

        Product p1 = new Product("spoon", 4.64);
        Product p2 = new Product("chair", 7.89);

        System.out.println(p1.compareTo(p2));


    }
}
