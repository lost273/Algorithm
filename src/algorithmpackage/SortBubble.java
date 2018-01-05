
package algorithmpackage;

public class SortBubble <T> extends Algorithm{
    public SortBubble(){
        super("SortBubble");
    }
   @Override
    public <T> void Sort(T[] array){
        int a, b, t;
        
        if(array.getClass().getName() == "java.lang.Integer"){
            arrayInt = new int[array.length];        
            for(int i = 0; i < array.length; i++){
                arrayInt[i] = (Integer)array[i];
            }
        }
        
        //algorithm
        for(a = 1; a < arrayInt.length; a++){
            for(b = arrayInt.length - 1; b >= a; b--){
                if(arrayInt[b-1] > arrayInt[b]){
                    t = arrayInt[b-1];
                    arrayInt[b-1] = arrayInt[b];
                    arrayInt[b] = t;
                }
            }
        }
    }
}