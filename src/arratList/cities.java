package arratList;

import java.util.ArrayList;
import java.util.Random;

public class cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Virginia");
        cities.add("DC");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");
        cities.add("Istanbul");
        System.out.println(cities);
        System.out.println(cities.toString());
        for (String value : cities) {
            System.out.print(value + " ");

        }
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));

        }
        Random rn=new Random(90);
        int age= rn.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(98);
        nums.add(45);
        nums.add(56);
        nums.add(75);
        nums.add(3);
        nums.add(rn.nextInt(110));

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(17);
        nums2.add(90);

        nums2.addAll(nums);
        System.out.println(nums.toString());
        System.out.println(nums2.toString());
    }
}
