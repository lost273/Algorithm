
package algorithmpackage;

public abstract class Algorithm {
    private String algorithmName;
    public int[] arrayInt;
    public abstract <T> void Sort(T[] a);
    public Algorithm(String name){
        algorithmName = name;
    }
    public String GetName(){
        return algorithmName;
    }
}
