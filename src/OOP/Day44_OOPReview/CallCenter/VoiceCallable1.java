package OOP.Day44_OOPReview.CallCenter;

public interface VoiceCallable1 {
    boolean can_Call = true;

    void call(String contact);

    public static void decline() {
        System.out.println("Mike decline voice call...");
    }

    public default void accept() {
        System.out.println("Mike finaly accepdet the voice call");
    }

}
