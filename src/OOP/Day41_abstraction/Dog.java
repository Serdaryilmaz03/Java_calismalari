package OOP.Day41_abstraction;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public void breathe() {
        System.out.println("dog is bratingh");
    }
}
