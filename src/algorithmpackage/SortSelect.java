
package algorithmpackage;

public class SortSelect {
static void selectSort(int a[]) {
  long i, j, k; 
  int x[];
  // i - number of the current step
  for( i=0; i < size; i++) {
    k=i; x=a[i];
    // the cycle for selecting the smallest element
    for( j=i+1; j < size; j++)	
      if (  a[j] < x ) {
          // k - index of the smallest element
        k=j; x=a[j];	        
      }
    // swap places least
    a[k] = a[i]; a[i] = x;   	
  }
}
}
class StartSortSelect{
    public static void main(String[] args){
        int nums[] = {99, -10, 100123, 18, -978,
                     5623, 463, -9, 287, 49};
        int i;
        
        System.out.print("current array:");
        for(i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        SortSelect.selectSort(nums);
        
        System.out.print("sorted array:");
        for(i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
        }
    }
}
