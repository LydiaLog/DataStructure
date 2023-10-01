import java.util.Scanner;

public class no1 {
	
	static int Sum(int N) {
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int Factorial(int N) {
		if(N <= 1)
			return 1;
		else 
			return N * Factorial(N - 1);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1보다 큰 N의 값을 입력하세요 : ");
		int N = s.nextInt();
		
		System.out.println("1부터 " + N + "까지의 합은 " + Sum(N) + "입니다.");
		System.out.println(N + "!의 값은 " + Factorial(N) + "입니다.");

	}

}
