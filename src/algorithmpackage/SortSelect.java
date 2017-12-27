
package algorithmpackage;

public class SortSelect {
    template<class T>
void selectSort(T a[], long size) {
  long i, j, k; 
  T x;

     	// i - number of the current step
  for( i=0; i < size; i++) {
    k=i; x=a[i];
// the cycle for selecting the smallest element
    for( j=i+1; j < size; j++)	
      if (  a[j] < x ) {
          // k - index of the smallest element
        k=j; x=a[j];	        
      }
// меняем местами наименьший с a[i]
    a[k] = a[i]; a[i] = x;   	
  }
}
}
class StartSortSelect{
    public static void main(String[] args){
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;
        
        System.out.print("current array:");
        for(i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        SortQuick.qsort(a);
        
        System.out.print("sorted array:");
        for(i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
    }
}
