package OOP.RomanNumsConvert;

import java.util.Map;

public class RomanNums {




    public static int convertNumber(String romanNum) {
        int num=0;
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000

        );
        for (int i = 0; i < romanNum.length(); i+=2) {

            int firstNum= map.get(romanNum.charAt(i));
            if (i==romanNum.length()-1){
                num+=firstNum;
                break;
            }

            int secondNum= map.get(romanNum.charAt(i+1));
            if (firstNum<secondNum){
                num+=secondNum-firstNum;

            }else {
                num+=firstNum+secondNum;
            }

        }
        return num;

    }

    public static void main(String[] args) {
        System.out.println(convertNumber("CXXXIV"));
    }
}


