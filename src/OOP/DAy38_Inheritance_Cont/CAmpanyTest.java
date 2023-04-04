package OOP.DAy38_Inheritance_Cont;

public class CAmpanyTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        FullTimeEmloyee ft = new FullTimeEmloyee();
        Contractor ct = new Contractor();
        emp.caculatePay(40, 40);
        ft.caculatePay(40, 40);
        ct.caculatePay(40, 40);

    }
}
