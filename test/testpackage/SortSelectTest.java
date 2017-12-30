
package testpackage;

import algorithmpackage.SortSelect;
import displaypackage.Display;

public class SortSelectTest {
    
}
class StartTestSortSelect{
    public static void main(String[] args){
        int nums[] = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
       
        Display.IntDisplay("Current array:", nums);
        
        SortSelect.Sort(nums);
        
        Display.IntDisplay("Sorted array:", nums);
        
    }
}