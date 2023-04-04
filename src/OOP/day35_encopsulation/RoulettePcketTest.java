package OOP.day35_encopsulation;

import java.util.Scanner;

public class RoulettePcketTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your pocket number:");

        RoulletPocket rp = new RoulletPocket(sc.nextInt());

        while(rp.getPocketColor().equalsIgnoreCase("invalid")) {
            System.out.println("Enter your pocket number:");
            rp.setPocketNumber(sc.nextInt());
        }

        System.out.println(rp.getPocketColor());

    }

}
