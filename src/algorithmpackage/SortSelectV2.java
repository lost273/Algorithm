
package algorithmpackage;

public class SortSelectV2 {
    public static void main(String[] args){
        int[] array = new int[] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49}; 
        int passSelect, smallerIndex, buffer;
        for(int pass = 0; pass < array.length; pass++){
            smallerIndex = pass;
            buffer = array[pass];
            for(passSelect = pass+1; passSelect < array.length; passSelect++){
                if(array[passSelect] < buffer){
                    smallerIndex = passSelect;
                    buffer = array[passSelect];
                }
            }
            array[smallerIndex] = array[pass];
            array[pass] = buffer;
        }
        
        for(int a : array){
            System.out.print(a + " ");
        }
    }
}
