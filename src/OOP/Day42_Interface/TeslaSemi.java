package OOP.Day42_Interface;

public class TeslaSemi extends ElectricTruck {
    private double engineSize;



    public TeslaSemi(String model, double price, String color, double engineSize) {
        super(model, price, color);
        this.engineSize= this.engineSize;
    }

    @Override
    public void start() {
        System.out.println("TeslaSemi - start truck by pressing button");

    }

    @Override
    public void charge() {
        System.out.println("TeslaSemi - pulug in charge for 30 mins...");
    }

    @Override
    public void derive() {
        System.out.println("TeslaSemi - truck is driving with load");
    }

    @Override
    public void load(String item) {
        System.out.println("TeslSemi - load "+ item+ " by lowering the truck and opening door");
    }

    public double getEngineSize() {
        return engineSize;
    }
}
