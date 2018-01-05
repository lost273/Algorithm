
package modelpackage;

import algorithmpackage.*;
import displaypackage.*;

public class TestModel {
    
    
    private static <T> String IntCompare(T[] unsorted, T[] sorted){
        for(int i = 0; i < unsorted.length; i++){
            if(unsorted[i] != sorted[i]){
                return "FAIL";
            }
        }
        return "SUCCESS";
    }
    public static void StartIntTest(Algorithm algorithm){
        Integer[] nums = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
        
        Integer[] numsOK = {-978, -10, -9, 18, 49,
                     99, 287, 463, 5623, 100123};
        
        System.out.println("Current algorithm - <" + algorithm.GetName() + ">");
        
        Display.ConDisplay("Current array:", nums);
        
        System.out.println("Before sort. Test is " + IntCompare(nums, numsOK));
        
        algorithm.Sort(nums);
      
        Display.ConDisplay("Sorted array:", algorithm.arrayInt);
        
        System.out.println("After sort. Test is " + IntCompare(nums, numsOK));
    } 
}
