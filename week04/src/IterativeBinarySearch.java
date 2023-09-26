
public class IterativeBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {22, 33, 44, 55, 66, 77, 88, 99};
		 int n = a.length - 1;
		 System.out.println("search(" + 55 + "): " + isearch(a, 0, n, 55));
		 System.out.println("search(" + 50 + "): " + isearch(a, 0, n, 50));
	}

	static int isearch(int[] a, int left, int right, int x) {
	    int middle;
	   
	    while (left <= right) {
	    	middle = (left + right)/2;
	    	if(x == a[middle]) return middle; //后沫 1
	    	if(x <= a[middle]) right = middle - 1;//后沫 2
	    	else left = middle + 1;//后沫 3	    	
	    }
	    return -1;  // 后沫 4
   }
}
