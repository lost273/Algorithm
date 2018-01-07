
package modelpackage;

import algorithmpackage.*;
import displaypackage.*;
import java.util.*;

enum TypeOfArray {
    I,
    C,
    D
}

public class TestModel {
    private static Object[][] commonArray = {
        {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49},
        {'b','a','t','g','e','m','r','q','c'}
    };
    private static Object[][] testArray = {
        {-978, -10, -9, 18, 49, 99, 287, 463, 5623, 100123},
        {'a','b','c','e','g','m','q','r','t'}
    };
    
    private static <T> String IntCompare(T[] unsorted, T[] sorted){
        for(int i = 0; i < unsorted.length; i++){
            if(!unsorted[i].equals(sorted[i])){
                return "FAIL";
            }
        }
        return "SUCCESS";
    }
    public static <T> void StartTest(Algorithm algorithm){
        System.out.println("Enter - I for Integet/ C for Char / D for Double:");
        Scanner in = new Scanner(System.in);
        String param = in.next();
        
        int arrayNumber = TypeOfArray.valueOf(param).ordinal();
        Object[] a = commonArray[arrayNumber];
        Object[] aTest = testArray[arrayNumber];
        
        System.out.println("Current algorithm - <" + algorithm.GetName() + ">");
        
        Display.ConDisplay("Current array:", a);
        
        System.out.println("Before sort. Test is " + IntCompare(a, aTest));
        
        algorithm.Sort(a);
      
        Display.ConDisplay("Sorted array:", a);
        
        System.out.println("After sort. Test is " + IntCompare(a, aTest));
    } 
}
