package displaypackage;

public class Display {
    //display the array
    public static <T> void ConDisplay(String msg, T[] a){
        System.out.print(msg);
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
    public static void ConDisplayInt(String msg, int[] nums){
        System.out.print(msg);
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
