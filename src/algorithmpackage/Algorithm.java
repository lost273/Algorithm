
package algorithmpackage;

public abstract class Algorithm {
    private String algorithmName;
    public Algorithm(String name){
        algorithmName = name;
    }
    public String GetName(){
        return algorithmName;
    }
    public abstract void Sort(int a[]);
}
