
package algorithmpackage;

public class SortInsert extends Algorithm {
    public SortInsert(){
        super("SortInsert");
    }
    @Override
    public <T> void Sort(T[] array){
        int i, j;
        T temp;
        
        for ( i = 0; i < array.length; i++) {
            temp = array[i];
            //search for the place of the element in the finished sequence
            for ( j = i-1; j >= 0 && MoreOperator(array[j],temp); j--){
                //move the element to the right
                array[j+1] = array[j];
            }
            // insert the element into the found place
            array[j+1] = temp;
        }
    }
}
