package arrays;

public class task95_ScoreCalc {
    public static void main(String[] args) {
        int[][] scores={
                {68,75,54,80},
                {100,64,20,50},
                {10,35,40,90}};
        //calcukate the avg scores of student1
        // calculate total math scores
        int sum=0;
        for (int colum=0;colum<scores[0].length;colum++){
            sum+=scores[0][colum];

        }
        System.out.println(sum/scores[0].length);
        int mathsum=0;
        for ( int rows=0;rows<scores.length;rows++){
            mathsum+=scores[rows][0];
        }
        System.out.println(mathsum);




    }
}
