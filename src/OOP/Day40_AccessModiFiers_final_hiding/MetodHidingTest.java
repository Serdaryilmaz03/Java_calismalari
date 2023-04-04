package OOP.Day40_AccessModiFiers_final_hiding;

public class MetodHidingTest {
    public static void main(String[] args) {


        class Bear {
            public static void eat() {
                System.out.println("bear is eating");
            }

            public static void sneeze() {
                System.out.println("Bear is sneezing");
            }

            public void hibernate() {
                System.out.println("Bear is hibenating");
            }




            class Panda extends Bear {

               public static void eat() {
                    System.out.println("Panda is eating");
                }

//                   public void sneeze() {
//                      System.out.println("Panda is sneezing");
//
//                }

                public void hibernate() {
                    System.out.println("Panda is hibernating");
                }

            }

        }
    }
}
