
public class no2 {
	
	static long Sum(int N) {
		
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int a = 1;
		for(int j = 1; j < 9; j++) {
			a *= 10;
			System.out.println(Sum(a));
		}
		
	}

}
