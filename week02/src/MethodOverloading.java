
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test(1,2);
		test(3.14);
	}
	static void test() {
		System.out.println("�Ű� ������ ����");
	}
	static void test( double d) {
		System.out.println("�Ű� ����: " + d );
	}
	static void test( int a, int b) {
		System.out.println("�Ű� ����: "+ a +" and " + b);
	}

}
