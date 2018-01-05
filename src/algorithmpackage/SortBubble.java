
package algorithmpackage;

public class SortBubble <T> extends Algorithm{
    public SortBubble(T[] array){
        super("SortBubble", array);
    }
   @Override
    public void Sort(){
        int a, b, t;
        int size = GetArrayLength();
        
        //algorithm
        for(a = 1; a < size; a++){
            for(b = size - 1; b >= a; b--){
                if(temp[b-1] > temp[b]){
                    t = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
        }
    }
}