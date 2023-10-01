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
		
		System.out.println("1���� ū N�� ���� �Է��ϼ��� : ");
		int N = s.nextInt();
		
		System.out.println("1���� " + N + "������ ���� " + Sum(N) + "�Դϴ�.");
		System.out.println(N + "!�� ���� " + Factorial(N) + "�Դϴ�.");

	}

}
