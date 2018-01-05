
package algorithmpackage;

public abstract class Algorithm <T> {
    private String algorithmName;
    private T[] algorithmArray;
    public abstract void Sort();
    public Algorithm(String name, T[] array){
        algorithmName = name;
        algorithmArray = array;
    }
    public int GetArrayLength(){
        return algorithmArray.length;
    }
    public String GetName(){
        return algorithmName;
    }
    public boolean MoreOperator(int indexOne, int indexTwo){
        if(algorithmArray.getClass().getName() == "java.lang.Integer"){
        
        }
        int numberOne = algorithmArray[indexOne];
        int numberTwo = algorithmArray[indexTwo];
    }
}
