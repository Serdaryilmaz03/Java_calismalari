package OOP.Day48_Collections_Part3;

import OOP.Day46_Collections_Part1.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {

        Map<String, String> dataMap = new HashMap<>();

        dataMap.put("url", "qa3.vaytrack.com");
        dataMap.put("username", "user666");
        dataMap.put("password", "abc123");
        dataMap.put("browser", "safari");
        dataMap.put("trackdriver", "Bob");
        dataMap.put("storemanager", "John");
        System.out.println("******keys*****");

        for (String key : dataMap.keySet()) {
            System.out.println(key);

        }
        System.out.println("******values*****");

        for (String value : dataMap.values()) {
            System.out.println(value);

        }
        System.out.println("******key | values*****");
        for (String key : dataMap.keySet()) {
            System.out.println(key+" | "+dataMap.get(key));

        }
        dataMap.forEach((k,v ) -> System.out.println(k + "|" + v));

        Map<Integer, Product> studentMap = new HashMap<>();
        Map<String,String[]> data = new HashMap<>();
        Map<Integer, List<String>> data2 = new HashMap<>();
        Map<Integer,List<String[]>> data3 = new HashMap<>();
        Map<String,Map<Integer,Integer>> data4 = new HashMap<>();
        Map<String,Map<Integer,Product>> data5 = new HashMap<>();

    }
}
