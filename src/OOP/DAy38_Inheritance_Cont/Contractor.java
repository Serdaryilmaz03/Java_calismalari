package OOP.DAy38_Inheritance_Cont;

public class Contractor extends Employee {
    @Override
    public void caculatePay(int hours, double rate) {
        double totalPay = hours * rate + 200;
        System.out.println("Contractor total pay;" + totalPay);

    }
}
