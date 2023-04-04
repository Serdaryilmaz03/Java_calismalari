package OOP.Day44_OOP_Shape;

public class Diamond extends Shape{

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a diamond");
    }

    public Diamond(){
        type="diamond";

    }
}
