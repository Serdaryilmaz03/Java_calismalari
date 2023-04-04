package OOP.day36_StaticClassMembers;

public class SataticInit {

    static final int NUMS_SECOND_PER_HOURS;

    static {
        System.out.println("static init");
        int numSecondPerMinute = 60;
        int numSecondPerhour = 60;
        NUMS_SECOND_PER_HOURS = numSecondPerMinute * numSecondPerhour;
    }

    private static int one;
    private static final int two;
    private static final int three = 3;
    //private static final int four;

    static {
        one = 1;
        two = 2;
       // three = 4;
        //two = 4;
    }
}
