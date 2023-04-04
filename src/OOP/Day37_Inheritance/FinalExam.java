package OOP.Day37_Inheritance;

public class FinalExam extends GradeAktivity {
    private int numQuestions;
    private int pointsEach;
    private int numMissed;

    public FinalExam(int numMissed, int numQuestions) {
        double numericScore;
        this.numQuestions=numQuestions;
        this.numMissed=numMissed;
        pointsEach=100/numQuestions;
        numericScore=100-(numMissed*pointsEach);

        setScore(numericScore);
        System.out.println(getGrade());
    }

}
