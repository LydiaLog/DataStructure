
public class SparseTrans {

	public static void main(String[] args) {
		test01();
		test02();
	}
	
	public static void test01() {
		SparseMatrix a = new SparseMatrix(500); //매개변수의 사이즈 만큼의 크기를 가진 정방 tridiagonal matrix를 생성 합니다.
		//displayMatrixAll()은 0을 포함한 전체 행렬의 모습을 보여 줍니다.
		a.displayMemoryAll(); 
		//displayMatrix()은 0을 제외한 희소 행렬의 모습을 보여 줍니다.
		a.displayMemory(); 
		
		long startTime = System.currentTimeMillis();
		SparseMatrix b = a.transposeS(); //transpose()은 책에 제안 된 빠르게 진행 되는 전치 방법입니다.
		long endTime = System.currentTimeMillis();
		long finalTime = endTime - startTime;
		System.out.println("1st method_전치 종료, 소요 시간 : " + finalTime + " ms");
		System.out.println("--------------------------------");
	}

	public static void test02() {
		SparseMatrix c = new SparseMatrix(500); //매개변수의 사이즈 만큼의 크기를 가진 정방 tridiagonal matrix를 생성 합니다.
		//displayMatrixAll()은 0을 포함한 전체 행렬의 모습을 보여 줍니다.
		c.displayMemoryAll(); 
		//displayMatrix()은 0을 제외한 희소 행렬의 모습을 보여 줍니다.
		c.displayMemory(); 
		
		long startTime = System.currentTimeMillis();
		SparseMatrix d = c.transpose(); //transpose()은 책에 제안 된 빠르게 진행 되는 전치 방법입니다.
		long endTime = System.currentTimeMillis();
		long finalTime = endTime - startTime;
		System.out.println("2nd method_전치 종료, 소요 시간 : " + finalTime + " ms");
	}
}
