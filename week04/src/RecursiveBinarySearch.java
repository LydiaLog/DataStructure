

public class RecursiveBinarySearch {
	
 public static void main(String[] args) {
	  int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
	  int n = a.length - 1;
	  System.out.println("search(" + 55 + "): " + search(a, 0, n, 55));
	  System.out.println("search(" + 50 + "): " + search(a, 0, n, 50));
  }

  static int search(int[] a, int left, int right, int x) {
	  
    if (right <= left) return -1;  // base
    int middle = (left + right)/2;
    if(a[middle] == x) return middle; // ºóÄ­ 1  
    if(a [middle] < x) return search(a, middle + 1, right, x); // ºóÄ­ 2   
    				   return search(a, left, middle - 1, x); // ºóÄ­ 3  
    
  }
}

/*  Output:
search(55): 3
search(50): -1
*/
