package Unary_Assignment;

public class methods {

    public static void main(String[] args) {
        String str="98hdgdty nbvgg2";
        System.out.println(numconvert(str)+98);

    }
    public static  int numconvert(String word){

String num="";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
              num=num+word.charAt(i);
            }


        }
        int newnum=Integer.parseInt(num);

        return newnum;
    }


}

