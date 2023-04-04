package OOP.DAy38_Inheritance_Cont;

public class FullTimeEmloyee extends Employee{
    @Override
    public void caculatePay(int hours, double rate) {
        double totalPay=hours*rate*1.05;
        System.out.println("FullTimeEmployee total pay;" + totalPay);
    }
}
