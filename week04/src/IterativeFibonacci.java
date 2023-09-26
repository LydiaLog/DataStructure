
public class IterativeFibonacci {

	 public static void main(String[] args) {
		    for (int n=30; n<=100; n++) {
		      long m=fibb(n);
		      System.out.println("fibb(" + n + ") = " + m );
		    }
	  } // end of main
		  
	  public static long fibb(int n) {
		    if (n<2) return n;
		    long f0=0, f1=1, f2=1;
		    for (int i=2; i<n; i++) {
		      f0 = f1;// ºóÄ­ 1   
		      f1 = f2;// ºóÄ­ 2   
		      f2 = f0 + f1;// ºóÄ­ 3   
		    }
		    return f2;
	  }  // end of fibb
		  
}
