package OOP.day36_StaticClassMembers;

public class Campus {
    private String city;
    static String country;
    static {
        System.out.println("Static Block-1");
        country="USA";
    }
    public Campus(String city){
        System.out.println("Constractor");
    this.city=city;
    }
    static {
        System.out.println("Static Block-2");
        country="UK";
    }

}
