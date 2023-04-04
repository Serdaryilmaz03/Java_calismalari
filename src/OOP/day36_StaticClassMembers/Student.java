package OOP.day36_StaticClassMembers;

public class Student {
    String name;
    static String school = "Cybertec";
    int age;
    int idnumber;

    public Student(String name, int age, int idnumber) {
        this.name = name;

        this.age = age;
        this.idnumber = idnumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", age=" + age +
                ", idnumber=" + idnumber +
                '}';
    }
}
