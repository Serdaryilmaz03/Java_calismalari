package OOP.day36_StaticClassMembers;

public class CampusTest {
    public static void main(String[] args) {
        Campus c1=new Campus("Mclean");
        Campus c2=new Campus("Arlingtin");
        Campus c3=new Campus("newyork");
        System.out.println(Campus.country);
    }
}
