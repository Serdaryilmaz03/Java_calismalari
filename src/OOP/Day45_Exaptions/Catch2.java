package OOP.Day45_Exaptions;

public class Catch2 {
    public static void main(String[] args) {

        int[] nums={34,6,90,54};

        try {
            System.out.println(nums[0]);
            System.out.println(nums[9]);
        }catch (Exception exception){
          exception.printStackTrace();
            exception.getMessage();

        }
    }
}
