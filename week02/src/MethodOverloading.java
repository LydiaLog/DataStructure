
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test(1,2);
		test(3.14);
	}
	static void test() {
		System.out.println("매개 변수가 없음");
	}
	static void test( double d) {
		System.out.println("매개 변수: " + d );
	}
	static void test( int a, int b) {
		System.out.println("매개 변수: "+ a +" and " + b);
	}

}
