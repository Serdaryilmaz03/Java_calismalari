package OOP.day35_encopsulation;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee e1 = new Employee();
        Employee e2 = new Employee("mark", 9756);
        Employee e3 = new Employee("Tedd", 97465, "Sales", "Sales person");
        System.out.println(e1.getName() + "|" + e1.getIdnumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
        System.out.println(e2.getName() + "|" + e2.getIdnumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
        System.out.println(e3.getName() + "|" + e3.getIdnumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());
        e1.setName("mike");
        e1.setDepartment("Accounting");
        e1.setPosition("VP");
        e1.setIdnumber(905709);
        System.out.println(e1.getName() + "|" + e1.getIdnumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
        System.out.println(e1.toString());
    }
}