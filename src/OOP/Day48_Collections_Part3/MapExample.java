package OOP.Day48_Collections_Part3;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();
        items.put("apple", 3.89);
        items.put("orange", 8.76);
        items.put("Flowers", 5.65);
        items.put("milk", 7.43);
        items.put("egss", 3.89);
        System.out.println(items.size());

        System.out.println(items);

        System.out.println(items.get("apple"));

        System.out.println(items.get("milk"));

        System.out.println(items.remove("Flowers"));

        System.out.println(items.containsKey("orange"));

        System.out.println(items.containsKey("Flowers"));

        items.replace("egss", 3.5);
        items.put("milk", 8.56);
        System.out.println(items);

        //increase orange by 2$
        items.replace("orange", items.get("orange") + 2);
        System.out.println("price of orange: " + items.get("orange"));

    }
}
