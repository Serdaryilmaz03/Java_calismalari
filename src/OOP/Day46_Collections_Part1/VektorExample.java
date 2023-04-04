package OOP.Day46_Collections_Part1;

import java.util.List;
import java.util.Vector;

public class VektorExample {
    public static void main(String[] args) {
        List<String> v=new Vector<>();
        v.add("water");
        v.add("tea");
        v.add("green tea");
        System.out.println(v.size());
        System.out.println(v.toString());
    }
}
