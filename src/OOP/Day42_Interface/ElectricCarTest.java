package OOP.Day42_Interface;

public class ElectricCarTest {
    public static void main(String[] args) {


        Tesla modelS = new Tesla("ModelS", 45000, "grey");
        modelS.charge();
        modelS.start();
        modelS.derive();
        modelS.stop();
        System.out.println();
        Ford focus=new Ford("focus",1000,"black",2018);
        focus.charge();
        focus.start();
        focus.derive();
        focus.start();
        System.out.println();
        TeslaSemi semi=new TeslaSemi("semi",50000,"yellow",3.5);
        semi.charge();
        semi.start();
        semi.load("orange");
        semi.stop();
        System.out.println();
        TeslaTruck tr=new TeslaTruck("truck",100000,"white",6.0);
        tr.charge();
        tr.start();
        tr.load("Java Books");
        tr.derive();
        tr.stop();
        System.out.println("+++++++++++++++++");
        System.out.println(modelS.toString());
        System.out.println(focus.toString());
        System.out.println(semi.toString());
        System.out.println(tr.toString());
    }
}