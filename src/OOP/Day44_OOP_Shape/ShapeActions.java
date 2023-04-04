package OOP.Day44_OOP_Shape;

import java.util.ArrayList;
import java.util.List;

import static OOP.Day44_OOP_Shape.ShapeManeger.*;

public class ShapeActions {
    public static void main(String[] args) {

        drawSquare((Square) buildShape("square"));

        drawShape(buildShape("shape"));
        System.out.println("-------------");

        List<Shape> mylist = new ArrayList<>();
        mylist.add(new Shape());
        mylist.add(new Square());
        mylist.add(new Shape());
        mylist.add(new Square());
        mylist.add(new Diamond());
        drawShape(mylist);


    }
}
