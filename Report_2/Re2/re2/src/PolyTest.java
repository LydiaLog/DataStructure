public class PolyTest {
	public static void main(String[] args) {
		CPolyNomial A = new CPolyNomial();
		

		A.AddTerm(10, 2);
		A.AddTerm(10, 1);
		A.AddTerm(10, 0);
		
		System.out.print(" ´ÙÇ×½Ä A(x) = ");
		A.PrintPoly();
		A.PrintPoly2();
		A.PrintPoly3();
		System.out.println();

	}

}
