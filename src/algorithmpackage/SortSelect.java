
package algorithmpackage;

public class SortSelect extends Algorithm {
    public SortSelect(){
        super("SortSelect");
    }
    public void Sort(int a[]) {
        int i, j, k, x;
        // i - number of the current step
        for( i = 0; i < a.length; i++) {
            k = i;
            x = a[i];
            // the cycle for selecting the smallest element
            for( j = i+1; j < a.length; j++){
                if (a[j] < x) {
                    // k - index of the smallest element
                    k = j;
                    x = a[j];
                }
            }
            // swap places least
            a[k] = a[i]; 
            a[i] = x;
        }
    }
}
