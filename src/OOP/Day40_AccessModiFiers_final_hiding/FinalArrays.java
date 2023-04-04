package OOP.Day40_AccessModiFiers_final_hiding;

import org.w3c.dom.ls.LSOutput;

public class FinalArrays {
    public static void main(String[] args) {


        final int[] Teams = {11, 11};
        System.out.println(Teams[0]);
        Teams[0] = 14;

       int  nums[] = new int[]{20, 29, 40};

        nums = new int[]{34, 57, 84};

        final int[] finalNums = {23, 55, 30};
        finalNums[0] = 12;
        // finalNums=new int[]{1,2,3,4};

    }
}