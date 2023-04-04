package OOP.DAy38_Inheritance_Cont;

public class Car extends Vehicle {

    int maxSpeed = 180;

    public void display() {
        System.out.println("Maximum Speed:" + super.maxSpeed);
        System.out.println("Maximum Speed:" + maxSpeed);
    }
}
