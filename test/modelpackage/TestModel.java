
package modelpackage;

import algorithmpackage.SortSelect;
import displaypackage.Display;

public class TestModel {
    private static String IntCompare(int unsorted[], int sorted[]){
        for(int i = 0; i < unsorted.length; i++){
            if(unsorted[i] != sorted[i]){
                return "FAIL";
            }
        }
        return "SUCCESS";
    }
    public static void StartIntTest(){
        int nums[] = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
        int numsOK[] = {-978, -10, -9, 18, 49,
                     99, 287, 463, 5623, 100123};
        
        Display.IntDisplay("Current array:", nums);
        
        System.out.println("Before sort. Test is " + IntCompare(nums, numsOK));
        
        SortSelect.Sort(nums);
      
        Display.IntDisplay("Sorted array:", nums);
        
        System.out.println("After sort. Test is " + IntCompare(nums, numsOK));
    } 
}
