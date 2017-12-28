
package algorithmpackage;

import displaypackage.*;

public class SortBubble {
    static void Sort(int nums[]){
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
class StartSortBubble{
    public static void main(String[] args){
        int nums[] = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
        Display.IntDisplay("Current array:", nums);
        
        SortBubble.Sort(nums);
      
        Display.IntDisplay("Sorted array:", nums);
    }
}