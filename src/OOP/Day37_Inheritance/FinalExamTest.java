package OOP.Day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int qoustions;
        int missed;
        System.out.println("How many questions in the exam?");
        qoustions=scanner.nextInt();

        System.out.println("how many questions missed");
        missed=scanner.nextInt();
        FinalExam exam=new FinalExam(missed,qoustions);
        System.out.println("The grade of the exam : "+exam.getGrade());

    }
}
