
package testpackage;

import algorithmpackage.*;
import displaypackage.*;

public class SortQuickTest {
    public static String Compare(char unsorted[], char sorted[]){
        for(int i = 0; i < unsorted.length; i++){
            if(unsorted[i] != sorted[i]){
                return "FAIL";
            }
        }
        return "SUCCESS";
    }
}
class StartTestSortQuick {
    public static void main(String[] args){
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        char aOK[] = {'a', 'd', 'i', 'j', 'p', 'r', 'x'};
        
        Display.CharDisplay("Current array:", a);
        
        System.out.println("Before sort. Test is " + SortQuickTest.Compare(a, aOK));
        
        SortQuick.Sort(a);
      
        Display.CharDisplay("Sorted array:", a);
        
        System.out.println("After sort. Test is " + SortQuickTest.Compare(a, aOK));
    }
}
