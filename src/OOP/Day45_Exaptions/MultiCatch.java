package OOP.Day45_Exaptions;

import java.util.Locale;

public class MultiCatch {
    public static void main(String[] args)  {

        try {
            System.out.println(4/0);
            String str=null;
            System.out.println(str.toUpperCase());
            int[] n={1,6};
            System.out.println(n[4 ]);
        }catch (ArithmeticException e){
            System.out.println("aritmatik exeption happened");

        }catch (NullPointerException e){

            System.out.println("NullPointerException exeption happened");


        }catch (RuntimeException e){
           e.printStackTrace();


        }
    }

}
