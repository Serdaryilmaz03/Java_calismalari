package OOP.Day44_OOP_Shape;

import java.util.List;

public class ShapeManeger {
    public static Shape buildShape(String type) {
        Shape shape=null;
        switch (type.toLowerCase()){
            case "shape":
                shape =new Shape();
                break;
            case "diamond":
                shape =new Diamond();
                break;
            case "square":
                shape =new Square();
                break;
        }
        return shape;

    }
    public static void drawSquare(Square squareObject) {

        squareObject.draw();
    }
    public static void drawShape(Shape shape){
        shape.draw();
    }
    public static void drawShape(List<Shape> shapeList){
        for (Shape each:shapeList){
            each.draw();
        }

    }
}

