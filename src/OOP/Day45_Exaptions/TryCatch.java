package OOP.Day45_Exaptions;

public class TryCatch {

    public static void main(String[] args) {

        try {


            String str = "JAVA";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5));
            System.out.println(str.charAt(1));

        }catch (Exception e){
            System.out.println("Exaption happend in try block was cought");

        }

    }
}
