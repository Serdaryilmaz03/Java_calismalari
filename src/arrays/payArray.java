package arrays;

import java.util.Scanner;

public class payArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int emplyees=5;
        double payRate;
        double Grosspay;

        int[] hours=new int[emplyees];
        System.out.println("enter the hours worked by "+emplyees+" employees who all earn the same hpurly wage");
        for (int i=0;i<emplyees;i++){
            hours[i]= scan.nextInt();
        }
        System.out.println("Enter the hourly rate for each employee");
        payRate= scan.nextDouble();
        for (int i=0;i<emplyees;i++){
            Grosspay=hours[i]*payRate;
            System.out.println("employee #"+(i+1)+":$"+Grosspay);
        }
        for (int i=5;i>0;i--)
        System.out.println("serdar#"+i);
    }

}
