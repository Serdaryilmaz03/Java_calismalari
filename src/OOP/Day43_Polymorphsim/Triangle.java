package OOP.Day43_Polymorphsim;

public class Triangle extends Shape {

    @Override
    public void draw() {
        super.draw();
        System.out.println("drawing a triangle");
    }
}
