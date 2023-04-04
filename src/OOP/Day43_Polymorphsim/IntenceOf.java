package OOP.Day43_Polymorphsim;

public class IntenceOf {

    public static void main(String[] args) {


        Shape sh = new Triangle();

        if (sh instanceof Circle){
            System.out.println("Triangle");
        }else if (sh instanceof Circle){
            System.out.println("Circle");
        }else
            System.out.println("Square");
    }


}