package OOP.day36_StaticClassMembers;

public class AllBlocks {
    public AllBlocks(int x) {
        System.out.println("One Argument constructor");
    }

    public AllBlocks() {
        System.out.println("no argument constuctor");
    }

    static {
        System.out.println("First satatic init");
    }

    {
        System.out.println("First intance init");
    }

    {
        System.out.println("Second intance init");
    }

    static {
        System.out.println("Second static init");
    }
}
