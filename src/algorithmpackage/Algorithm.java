
package algorithmpackage;

public abstract class Algorithm <T> {
    private String algorithmName;
    private T[] algorithmArray;
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
    public abstract void Sort();
}
