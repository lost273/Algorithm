
package testpackage;

import algorithmpackage.SortBubble;
import displaypackage.Display;

public class SortBubbleTest {
    public static String Compare(int unsorted[], int sorted[]){
        for(int i = 0; i < unsorted.length; i++){
            if(unsorted[i] != sorted[i]){
                return "FAIL";
            }
        }
        return "SUCCESS";
    }
}
class StartTestSortBubble{
    public static void main(String[] args){
        int nums[] = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
        int numsOK[] = {-978, -10, -9, 18, 49,
                     99, 287, 463, 5623, 100123};
        Display.IntDisplay("Current array:", nums);
        
        SortBubble.Sort(nums);
      
        Display.IntDisplay("Sorted array:", nums);
        
        System.out.println("Test is " + SortBubbleTest.Compare(nums, numsOK));
    }
}