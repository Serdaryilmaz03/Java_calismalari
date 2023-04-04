package OOP.Day40_AccessModiFiers_final_hiding;

public class Kangaroo extends Marsupial{
String name="hasan";

/*
	@Override
	public boolean isBiped() {
		return true;
	}
	*/


    public static boolean isBiped() {
        return true;
    }


    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs:" + isBiped());
    }


}
