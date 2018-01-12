
package algorithmpackage;


public class SortInsertV2 {
    public static void main(String[] args){
        int[] array = new int[] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49}; 
        int leftIndex, buffer;
        for(int passIndex = 0; passIndex < array.length; passIndex++){
            buffer = array[passIndex];
            for(leftIndex = passIndex - 1; (leftIndex >= 0) && (array[leftIndex] > buffer); leftIndex--){
                array[leftIndex + 1] = array[leftIndex];
            }
            array[leftIndex + 1] = buffer;
        }
        
        for(int a : array){
            System.out.print(a + " ");
        }
    }
}
