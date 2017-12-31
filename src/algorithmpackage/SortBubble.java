
package algorithmpackage;

import displaypackage.*;

public class SortBubble extends Algorithm{
    public SortBubble(){
        super("SortBubble");
    }
    public void Sort(int nums[]){
        int a, b, t;
        
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