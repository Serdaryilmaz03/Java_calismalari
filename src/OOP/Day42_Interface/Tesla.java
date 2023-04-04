package OOP.Day42_Interface;

public class Tesla extends ElecticCar{
    public Tesla(String model, double price, String color) {
        super(model, price, color);
    }

    @Override
    public void start() {
        System.out.println("Tesla - starts by push button");
        System.out.println("Change to derive mod");
    }

    @Override
    public void charge() {
        System.out.println("Tesla cahrging - plugin to Electric outlet...");

    }

    @Override
    public void derive() {
        System.out.println("Tesla is driving");

    }
}
