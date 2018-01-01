
package algorithmpackage;

public class SortShell extends Algorithm {
    public SortShell(){
        super("SortShell");
    }
    int increment(int inc[], int size) {
        int p1, p2, p3, s;
        p1 = p2 = p3 = 1;
        s = -1;
        
        do {
            if ((++s % 2) != 0) {
                inc[s] = 8*p1 - 6*p2 + 1;
            } else {
                inc[s] = 9*p1 - 9*p3 + 1;
                p2 *= 2;
                p3 *= 2;
            }
            p1 *= 2;
        } while(3*inc[s] < size);
        return s > 0 ? --s : 0;
    }
    
    @Override
    public void Sort(int a[]) {
        int inc, i, j, s;
        int seq[] = new int[40];
        s = increment(seq, a.length);
        while (s >= 0) {
            inc = seq[s--];
            for (i = inc; i < a.length; i++) {
                int temp = a[i];
                for (j = i - inc; (j >= 0) && (a[j] > temp); j -= inc){
                    a[j+inc] = a[j];
                }
                a[j+inc] = temp;
            }
        }
    }
}
