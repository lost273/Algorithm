
package algorithmpackage;

public class SortBubble extends Algorithm{
    public SortBubble(){
        super("SortBubble");
    }
   @Override
    public <T> void Sort(T[] array){
        int b, t;
        //algorithm
        for(a = 1; a < nums.length; a++){
            for(b = nums.length - 1; b >= a; b--){
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
    }
}