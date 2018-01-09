
package algorithmpackage;


public class SortBubbleV2 {
    public static void main(String[] args){
        int[] array = new int[] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49}; 
        for(int pass = 0; pass < array.length; pass++){
            for(int bubble = array.length - 1; bubble > pass; bubble--){
                if(array[bubble] < array[bubble-1]){
                    int temp = array[bubble-1];
                    array[bubble-1] = array[bubble];
                    array[bubble] = temp;
                }
            }
        }
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
