
public class RecursiveFibonacci {
  public static void main(String[] args) {
    for (int i=0; i<13; i++)
      System.out.println(i + "\t" + f(i));
  }
  
  public static long f(int n) {
    if (n < 1) return 0;       // base
    if (n == 1) return 1; // ��ĭ 1                  // base
    return f(n - 1) + f(n - 2); // ��ĭ 2                  // recursion
  }    
}

/* Output:
0       0
1       1
2       1
3       2
4       3
5       5
6       8
7       13
8       21
9       34
10      55
11      89
12      144
*/
