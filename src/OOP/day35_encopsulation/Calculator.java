package OOP.day35_encopsulation;

public class Calculator {
    double length,width;

    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }

}













