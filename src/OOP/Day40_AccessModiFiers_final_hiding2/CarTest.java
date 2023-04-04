package OOP.Day40_AccessModiFiers_final_hiding2;

import OOP.Day40_AccessModiFiers_final_hiding.Car;

public class CarTest {
    public static void main(String[] args) {


        Car c = new Car();
        Car2 c2=new Car2();
        c2.year=2009;
        System.out.println(c2.year);
    }
}