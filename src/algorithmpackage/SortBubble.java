
package algorithmpackage;

public class SortBubble {
    static void bsort(char items[]){
        qs(items, 0, items.length-1);
    }
        int a, b, t;
        int size;
        
        //algorithm
        for(a = 1; a < size; a++){
            for(b = size - 1; b >= a; b--){
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        
    
}
class Start{
    public static void main(String[] args){
        int nums[] = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
        //number of elements
        size = 10;
        
        //display the array
        System.out.print("current array:");
        for(int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
        
        SortBubble.bsort(nums);
        
        //display the array
        System.out.print("sorted array:");
        for(int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}