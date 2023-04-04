package OOP.Day40_AccessModiFiers_final_hiding;

public class Marsupial {
    String name="ali";
    /*
	public boolean isBiped() {
		return false;
	}
	*/



    public static boolean isBiped() {
        return false;
    }


    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on the two legs:" + isBiped());
    }
}
