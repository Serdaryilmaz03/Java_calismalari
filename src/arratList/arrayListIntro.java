package arratList;

import java.util.ArrayList;

public class arrayListIntro {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        ArrayList<Integer> nums=new ArrayList<>();

        names.add("mike");
        names.add("smith");
        names.add("mike");
        names.add("emmy");
        names.add("99");
        names.add("19");
        names.add("19");
        names.add("99");
        nums.add(99);
        nums.add(656);
        nums.add(100);
        System.out.println(names.get(1));
        System.out.println(nums.get(2));
        System.out.println("names count: "+names.size());
        System.out.println("nums count: "+nums.size());

        System.out.println(names);
        System.out.println(nums);
    }
}
