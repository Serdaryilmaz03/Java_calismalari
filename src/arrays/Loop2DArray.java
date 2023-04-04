package arrays;

public class Loop2DArray {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},{4,5},{7,8,9}};
        for (int row=0;row<numbers.length;row++){
            for (int colums=0;colums<numbers[row].length;colums++){
                System.out.println(numbers[row][colums]);
            }

        }

    }
}
