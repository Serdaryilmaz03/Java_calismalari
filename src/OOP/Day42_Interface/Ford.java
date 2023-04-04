package OOP.Day42_Interface;

public class Ford extends ElecticCar{
    private int year;

    public Ford(String model, double price, String color, int year) {
        super(model, price, color);
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("Ford - Push start button to start...");
    }

    @Override
    public void charge() {
        System.out.println("Ford - plugin to electic outlet");
    }

    @Override
    public void derive() {
        System.out.println("For is driving...");
    }

    public int getYear() {
        return year;
    }
}
