package OOP.Day37_Inheritance;

public class  Employee extends Person{
    String jobTitle;
    public void work(){
        System.out.println(name+" is working as "+jobTitle);
    }


}
