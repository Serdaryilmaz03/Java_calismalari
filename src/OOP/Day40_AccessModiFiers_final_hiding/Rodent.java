package OOP.Day40_AccessModiFiers_final_hiding;

public class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("parentTail:" + tailLength);
    }
}
