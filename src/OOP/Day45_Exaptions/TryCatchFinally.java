package OOP.Day45_Exaptions;

public class TryCatchFinally {

    public static void main(String[] args) {

        String str="selenium";


        try {
            System.out.println(str.length());
            System.out.println(str.charAt(98));
        }catch (Exception e){
            System.out.println("enter correct index");
            e.printStackTrace();
            return;
        }finally {
            System.out.println("finally block");

        }


    }
}
