package OOP.Day44_OOP_Shape;

public class Square extends Shape{
    public Square(){
        type="square";
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a square");
    }
    public void squareMethod(){
        System.out.println("Square method");
    }
}
