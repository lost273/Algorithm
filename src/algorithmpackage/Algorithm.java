
package algorithmpackage;

import java.util.Arrays;

public abstract class Algorithm {
    private String algorithmName;
    public abstract <T> void Sort(T[] a);
    public Algorithm(String name){
        algorithmName = name;
    }
    public String GetName(){
        return algorithmName;
    }
    //objectOne > objectTwo;
    public <T> boolean MoreOperator(T objectOne, T objectTwo){
        if(objectOne.getClass().getName().equals("java.lang.Integer")){
           int one = (Integer)objectOne;
           int two = (Integer)objectTwo;
           if(one > two) return true;
        }
        if(objectOne.getClass().getName().equals("java.lang.Character")){
           char one = (Character)objectOne;
           char two = (Character)objectTwo;
           if(one > two) return true;
        }
        if(objectOne.getClass().getName().equals("java.lang.Double")){
           double one = (Double)objectOne;
           double two = (Double)objectTwo;
           if(one > two) return true;
        }
        return false;
    }
    
    
}
