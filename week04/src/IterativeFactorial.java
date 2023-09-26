
public class IterativeFactorial {
	
  public static void main(String[] args) {
    for (int i=0; i<30; i++) // 범위를 30으로 설정했을 때 음수값이 나오는 이유는 오버플로우 때문 
      System.out.println(i + "\t" + factorial(i));
  }
  static long factorial(int n) {
    if (n <= 1) return 1;
    long fact = 1;  
    for (int i=1; i<= n; i++)
       fact *= i;// 빈칸을 채우시오
    return fact;
  }    
}

/* Output
0       1
1       1
2       2
3       6
4       24
5       120
6       720
7       5040
8       40320
9       362880
*/


