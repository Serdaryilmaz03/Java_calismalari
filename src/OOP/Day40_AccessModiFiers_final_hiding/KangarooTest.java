package OOP.Day40_AccessModiFiers_final_hiding;

public class KangarooTest {

    public static void main(String[] args) {

        Kangaroo k = new Kangaroo();
        Marsupial kan=new Kangaroo();
        Marsupial m=new Marsupial();
        System.out.println(kan.name);
        System.out.println(m.name);
        k.getMarsupialDescription();

        k.getKangarooDescription();
    }
}
