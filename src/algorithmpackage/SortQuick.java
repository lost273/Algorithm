
package algorithmpackage;

public class SortQuick extends Algorithm {
    public SortQuick(){
        super("SortQuick");
    }
    @Override
    public <T> void Sort(T[] array){
        qs(array, 0, array.length-1);
    }
    //recursive version
    private <T> void qs(T[] items, int left, int right){
        int i, j;
        T x, y;
        i = left; j = right;
        x = items[(left+right)/2];
        
        do{
            while(MoreOperator(x, items[i]) && (i < right)) {
                i++;
            }
            while(MoreOperator(items[j], x) && (j > left)){
                j--;
            }
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while(i <= j);
        if(left < j) {
            qs(items, left, j);
        }
        if(i < right){
            qs(items, i, right);
        }
    }
}
