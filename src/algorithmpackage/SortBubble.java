
package algorithmpackage;

public class SortBubble extends Algorithm{
    public SortBubble(){
        super("SortBubble");
    }
   @Override
    public <T> void Sort(T[] array){
        int a, b, t;
        
        //algorithm
        for(a = 1; a < array.length; a++){
            for(b = array.length - 1; b >= a; b--){
                if(temp[b-1] > temp[b]){
                    t = array[b-1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
        }
    }
}