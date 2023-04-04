package OOP.day36_StaticClassMembers;

public class StudentTest {
    public static void main(String[] args) {


        Student s1 = new Student("mike",  32, 98754);
        Student s2 = new Student("serdar",  34, 635453);
        Student s3 = new Student("Jamal", 24, 87524);
        s1.school="CybertecEU";
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}