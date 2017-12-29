package displaypackage;

public class Display {
    //display the array
    public static void IntDisplay(String msg, int nums[]){
        System.out.print(msg);
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
    public static void CharDisplay(String msg, char nums[]){
        System.out.print(msg);
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
