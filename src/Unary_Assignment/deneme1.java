package Unary_Assignment;

public class deneme1 {
    public static void main(String[] args) {


        int toplamciftsayi = 0;
        int toplamteksayi = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                toplamciftsayi = toplamciftsayi + i;
            } else if (i % 2 == 1) {
                toplamteksayi = toplamteksayi + i;
            }
        }
        System.out.println(toplamciftsayi + " =toplamciftsayi");
        System.out.println(toplamteksayi + " =toplamctektsayi");

        int rows = 6;
        int colums = 6;
        for (int i = 1; i <=rows; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");

        }
    }
}
