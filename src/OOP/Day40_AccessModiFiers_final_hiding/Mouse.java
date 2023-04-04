package OOP.Day40_AccessModiFiers_final_hiding;

public class Mouse extends Rodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
    }


}

