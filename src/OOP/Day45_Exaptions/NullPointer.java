package OOP.Day45_Exaptions;

import java.util.Locale;

public class NullPointer {
    static String name;

    public static void main(String[] args) {

        try {

            System.out.println(name.toUpperCase());
        }catch   (NullPointerException e){
            System.out.println("null pointerexeption happened");
            System.out.println(e.getMessage()+" :here is the massegae");
            System.out.println(e.toString());
        }

    }
}
