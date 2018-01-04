
package algorithmpackage;

public class SortBubble extends Algorithm{
    public SortBubble(){
        super("SortBubble");
    }
   @Override
    public <T> void Sort(T[] array){
        int a, b, t;
        if(<T> is Integer) {}
        Class<?> temp[] = array.getClass();
        //algorithm
        for(a = 1; a < temp.length; a++){
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