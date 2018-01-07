
package algorithmpackage;

public class SortBubble <T> extends Algorithm{
    public SortBubble(){
        super("SortBubble");
    }
   @Override
    public <T> void Sort(T[] array){
        int i, j;
        T temp;
        //algorithm
        for(i = 1; i < array.length; i++){
            for(j = array.length - 1; j >= i; j--){
                if(MoreOperator(array[j-1], array[j])){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}