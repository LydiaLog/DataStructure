
public class SparseTrans {

	public static void main(String[] args) {
		test01();
		test02();
	}
	
	public static void test01() {
		SparseMatrix a = new SparseMatrix(500); //�Ű������� ������ ��ŭ�� ũ�⸦ ���� ���� tridiagonal matrix�� ���� �մϴ�.
		//displayMatrixAll()�� 0�� ������ ��ü ����� ����� ���� �ݴϴ�.
		a.displayMemoryAll(); 
		//displayMatrix()�� 0�� ������ ��� ����� ����� ���� �ݴϴ�.
		a.displayMemory(); 
		
		long startTime = System.currentTimeMillis();
		SparseMatrix b = a.transposeS(); //transpose()�� å�� ���� �� ������ ���� �Ǵ� ��ġ ����Դϴ�.
		long endTime = System.currentTimeMillis();
		long finalTime = endTime - startTime;
		System.out.println("1st method_��ġ ����, �ҿ� �ð� : " + finalTime + " ms");
		System.out.println("--------------------------------");
	}

	public static void test02() {
		SparseMatrix c = new SparseMatrix(500); //�Ű������� ������ ��ŭ�� ũ�⸦ ���� ���� tridiagonal matrix�� ���� �մϴ�.
		//displayMatrixAll()�� 0�� ������ ��ü ����� ����� ���� �ݴϴ�.
		c.displayMemoryAll(); 
		//displayMatrix()�� 0�� ������ ��� ����� ����� ���� �ݴϴ�.
		c.displayMemory(); 
		
		long startTime = System.currentTimeMillis();
		SparseMatrix d = c.transpose(); //transpose()�� å�� ���� �� ������ ���� �Ǵ� ��ġ ����Դϴ�.
		long endTime = System.currentTimeMillis();
		long finalTime = endTime - startTime;
		System.out.println("2nd method_��ġ ����, �ҿ� �ð� : " + finalTime + " ms");
	}
}
