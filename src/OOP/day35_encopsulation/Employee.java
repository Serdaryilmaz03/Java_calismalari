package OOP.day35_encopsulation;

public class Employee {
    private String name;
    private int idnumber;
    private String department;
    private String position;

    public Employee() {
        name = "";
        idnumber = 0;
        department = "";
        position = "";
    }

    public Employee(String name, int idnumber) {
        this.name = name;
        this.position = "";
        this.idnumber = idnumber;
        this.department = "";
    }

    public Employee(String name, int idnumber, String department, String position) {
        this.name = name;
        this.idnumber = idnumber;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", idnumber=" + idnumber +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
