
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
            if (++s % 2) {
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

template<class T>
void shellSort(T a[], long size) {
  long inc, i, j, seq[40];
  int s;

 
  s = increment(seq, size);
  while (s >= 0) {
	
	inc = seq[s--];

    for (i = inc; i < size; i++) {
      T temp = a[i];
      for (j = i-inc; (j >= 0) && (a[j] > temp); j -= inc)
        a[j+inc] = a[j];
      a[j+inc] = temp;
    }
  }
}
}
