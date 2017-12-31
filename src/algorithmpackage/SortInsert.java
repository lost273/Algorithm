
package algorithmpackage;

public class SortInsert extends Algorithm {
    public SortInsert(){
        super("SortInsert");
    }
    public void Sort(int a[]){
        int i, j, x;
        for ( i = 0; i < a.length; i++) {
            x = a[i];
            //search for the place of the element in the finished sequence
            for ( j = i-1; j >= 0 && a[j] > x; j--){
                //move the element to the right
                a[j+1] = a[j];
            }
            // insert the element into the found place
            a[j+1] = x;
        }
    }
}
