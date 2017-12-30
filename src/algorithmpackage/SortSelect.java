
package algorithmpackage;

import displaypackage.*;

public class SortSelect extends Algorithm {
    public static void Sort(int a[]) {
        int i, j, k;
        int x;
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
