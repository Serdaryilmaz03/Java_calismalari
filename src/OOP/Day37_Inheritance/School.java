package OOP.Day37_Inheritance;

public class School {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();


        person.name = "Mike";
        person.age = 35;
        person.gender = 'M';

        student.name = "Smith";
        student.age = 34;
        student.gender = 'M';
        student.studentID=658;

        person.eat("Steak");
        student.eat("Pizza");

    }
}
