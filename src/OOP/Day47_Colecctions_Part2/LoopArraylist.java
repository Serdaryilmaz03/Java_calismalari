package OOP.Day47_Colecctions_Part2;

import java.util.ArrayList;
import java.util.List;

public class LoopArraylist {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(564);
        nums.add(4567);
        nums.add(523230);
        nums.add(978);
        nums.add(9088);
        nums.add(768);
        nums.add(7000);
        for (int n : nums) {

            System.out.print(n + " | ");

        }
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " / ");

        }

        System.out.println();
        nums.forEach(n -> System.out.print(n + "|"));

        System.out.println();

        nums.removeIf(n-> n<500);
    }
}
