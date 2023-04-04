package OOP.Day48_Collections_Part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {
    public static void main(String[] args) {
        List<Map<String,String>>emplooyees=new ArrayList<>();

        Map<String,String> emp1Data=new HashMap<>();
        emp1Data.put("EmpID","123");
        emp1Data.put("EmpName","John");
        emp1Data.put("JobTitle","SDEt");
        emp1Data.put("Salary","10000");

        Map<String,String> emp2Data=new HashMap<>();
        emp2Data.put("EmpID","124");
        emp2Data.put("EmpName","Mike");
        emp2Data.put("JobTitle","Devoloper");
        emp2Data.put("Salary","12000");

        Map<String,String> emp3Data=new HashMap<>();
        emp3Data.put("EmpID","125");
        emp3Data.put("EmpName","Jane");
        emp3Data.put("JobTitle","SDEt");
        emp3Data.put("Salary","10000");

        emplooyees.add(emp1Data);
        emplooyees.add(emp2Data);
        emplooyees.add(emp3Data);

        System.out.println(emplooyees.toString());
        System.out.println(emplooyees.get(2));
        System.out.println(emplooyees.get(1).get("EmpName"));
        System.out.println("------------------------------------");

        for (Map<String ,String >emp : emplooyees) {
            System.out.println(emp.get("JobTitle"));

        }
        int totalSAlary=0;
        for (Map<String ,String >emp : emplooyees) {
           totalSAlary+=Integer.parseInt(emp.get("Salary"));

        }
        System.out.println("Total Salary: "+totalSAlary);


    }
}
