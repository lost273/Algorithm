
package algorithmpackage;

public class SortHeap  extends Algorithm {
    public SortHeap(){
        super("SortHeap");
    }
    <T> void downHeap(T[] a, int k, int n) {
        //  procedure for sifting the next element
        //  before: a[k+1]...a[n]  - pyramid
        //  after:  a[k]...a[n]  - pyramid
        int child;
        T new_elem;
        new_elem = a[k];
        while(k <= n/2) {
            child = 2*k;
            if( child < n && MoreOperator(a[child+1], a[child])){
                child++;
            }
            if( new_elem.equals(a[child])|| MoreOperator(new_elem, a[child])) break;
            a[k] = a[child];
            k = child;
        }
        a[k] = new_elem;
    }
    @Override
    public <T> void Sort(T[] array) {
        int i;
        T temp;
        //build a pyramid
        for(i = array.length/2 - 1; i >= 0; i--) {
            downHeap(array, i, array.length-1);
        }
        for(i = array.length - 1; i > 0; i--) {
            // change first with last
            temp = array[i]; 
            array[i] = array[0]; 
            array[0] = temp;
            // restore the pyramid a[0]...a[i-1] 
            downHeap(array, 0, i-1); 
        }
    }
}
