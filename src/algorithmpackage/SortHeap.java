
package algorithmpackage;

public class SortHeap  extends Algorithm {
    public SortHeap(){
        super("SortHeap");
    }
    void downHeap(int a[], int k, int n) {
        //  procedure for sifting the next element
        //  before: a[k+1]...a[n]  - pyramid
        //  after:  a[k]...a[n]  - pyramid
        int new_elem, child;
        new_elem = a[k];
        while(k <= n/2) {
            child = 2*k;
            if( child < n && a[child] < a[child+1] ){
                child++;
            }
            if( new_elem >= a[child] ) break;
            a[k] = a[child];
            k = child;
        }
        a[k] = new_elem;
    }
    @Override
    public void Sort(int a[]) {
        int i, temp;
        //build a pyramid
        for(i = a.length/2 - 1; i >= 0; i--) {
            downHeap(a, i, a.length-1);
        }
        for(i = a.length - 1; i > 0; i--) {
            // change first with last
            temp = a[i]; 
            a[i] = a[0]; 
            a[0] = temp;
            // restore the pyramid a[0]...a[i-1] 
            downHeap(a, 0, i-1); 
        }
    }
}
