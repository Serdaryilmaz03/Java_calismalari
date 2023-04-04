package OOP.DAy38_Inheritance_Cont;

public class Student extends Person{
    @Override
    public void message() {
        System.out.println("This is student class");
    }
    public void display(){
        message();
        super.message();
    }
}
