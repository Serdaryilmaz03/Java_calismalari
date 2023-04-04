package OOP.Day39_InheritanceReview_;

public class Toyata extends Car {
    private int raodService;

    public Toyata(int currenyGear, int raodService) {
        super("toyata", "4WD", 4, 4, 6, false);
        this.raodService = raodService;

    }

    public void acclelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 0 && newVelocity <= 30) {
            changeGear(3);
        } else  {
            changeGear(4);
        }if (newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());
        }

    }
}