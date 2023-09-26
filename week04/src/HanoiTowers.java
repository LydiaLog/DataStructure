
public class HanoiTowers {
  public static void main(String[] args) {
    int numTowers=3;
    if (args.length>0) numTowers = Integer.parseInt(args[0]);
    Hanoi(numTowers,'A','B','C');
  }
  
  static void Hanoi(int n, char x, char y, char z) {
    // move n disks from peg x to peg y using peg z:
    if (n==1) System.out.println(x + " --> " + y);  // base
    else {
    	Hanoi(n-1, x, z, y); // ºóÄ­ 1                            // recursion
    	System.out.println(x + " --> " + y);// ºóÄ­ 2  
    	Hanoi(n-1, z, y, x);     // ºóÄ­ 3                            // recursion
     
    }
  }
}

/* Output:
A --> B
A --> C
B --> C
A --> B
C --> A
C --> B
A --> B
*/
