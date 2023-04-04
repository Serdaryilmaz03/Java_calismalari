package OOP.day36_StaticClassMembers;

public class DinnerTest {
    public static void main(String[] args) {


        Dinner mom = new Dinner();
        Dinner kid = new Dinner();
        Dinner dad = new Dinner();
        System.out.println("Total slices  " + Dinner.pizzaSlice);
        dad.takeASlice();
        mom.takeASlice();
        kid.takeASlice();
        System.out.println(Dinner.pizzaSlice);
        kid.takeASlice(2);
        dad.takeASlice(3);
        System.out.println(Dinner.pizzaSlice);
    }
}