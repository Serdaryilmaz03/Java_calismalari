package OOP.Day43_Polymorphsim;

public class Square extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a square");
    }
}
