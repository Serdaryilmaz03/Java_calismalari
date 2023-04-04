package OOP.Day40_AccessModiFiers_final_hiding;

public class FinalVeriables {
    public final int RADSTER_MAX_RANGE =877;
    public final int MODEL_3_MAX_SPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME;

    public FinalVeriables() {
        MODEL_3_MAX_SPEED = 200;

    }



    {
        MODEL_X_PASSENGERS = 7;

    }

    static {
        ADMIN_USERNAME = "frenk";
    }

    public static void main(String[] args) {
        final int MAX_PERSSENGER_COUNT=6;
        final int SSN;

    }

    @Override
    public String toString() {
        return "FinalVeriables{" +
                "RADSTER_MAX_RANGE=" + RADSTER_MAX_RANGE +
                ", MODEL_3_MAX_SPEED=" + MODEL_3_MAX_SPEED +
                ", MODEL_X_PASSENGERS=" + MODEL_X_PASSENGERS +
                '}';
    }
}


