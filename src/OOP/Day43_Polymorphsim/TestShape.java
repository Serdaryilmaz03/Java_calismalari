package OOP.Day43_Polymorphsim;

public class TestShape {

    public static void main(String[] args) {
     //   Shape s1=new Shape();
      //  s1.draw();
        Shape s2=new Circle();
        s2.draw();
        Shape s3=new Square();
        s3.draw();

        Shape s4=new Triangle();
        s4.draw();
    }
}
