
package algorithmpackage;

public class SortSelect extends Algorithm {
    public SortSelect(){
        super("SortSelect");
    }
    @Override
    public <T> void Sort(T[] array) {
        int i, j, k;
        T x;
        // i - number of the current step
        for( i = 0; i < array.length; i++) {
            k = i;
            x = array[i];
            // the cycle for selecting the smallest element
            for( j = i+1; j < array.length; j++){
                if (MoreOperator(x, array[j])) {
                    // k - index of the smallest element
                    k = j;
                    x = array[j];
                }
            }
            // swap places least
            array[k] = array[i]; 
            array[i] = x;
        }
    }
}
