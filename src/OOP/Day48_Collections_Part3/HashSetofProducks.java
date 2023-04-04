package OOP.Day48_Collections_Part3;

import OOP.Day46_Collections_Part1.Product;

import java.util.Set;
import java.util.TreeSet;

public class HashSetofProducks {
    public static void main(String[] args) {


        Set<Product> prodSet = new TreeSet<>();

        prodSet.add(new Product("book", 25.99));
        prodSet.add(new Product("book", 19.99));
        prodSet.add(new Product("magazine", 7.99));

        System.out.println(prodSet.toString());

        for (Product product : prodSet) {
            System.out.println(product.getPrice());

        }

        //print each product by using forEach method
        prodSet.forEach(x -> System.out.println(x.getName()));
    }
}
