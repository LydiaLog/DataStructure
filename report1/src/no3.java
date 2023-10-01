
public class no3 {

	public static int Factorial(int N) {
		if(N <= 1) {
			return N;
		}
		
		return N * Factorial(N - 1);
	}
		
		
	public static void main(String[] args) {
		
		for(int i = 1; i <= 15; i++) {
			System.out.println(Factorial(i));
		}

	}

}
