package OOP.Day42_Interface;

public abstract class ElecticCar {
    private String model;
    private double price;
    private String color;

    public ElecticCar(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public abstract void start();
    public abstract void charge();
    public abstract void derive();
    public void stop(){
        System.out.println("Electric car is stopping by pushing the break");
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ElecticCar{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
