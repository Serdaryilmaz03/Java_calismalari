package OOP.Day44_OOP_Shape;

public class ShapeTest {
    public static void main(String[] args) {

        Shape square = new Square();
        Shape diamond = new Diamond();
       Object shapeObj = new Shape();

        square.draw();
        diamond.draw();
        ((Square)square).squareMethod();



    }
}
