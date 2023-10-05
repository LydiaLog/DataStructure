
public class PolyTest {
	public static void main(String[] args) {
		CPolyNomial A = new CPolyNomial();
		CPolyNomial B = new CPolyNomial();
		CPolyNomial C = new CPolyNomial();
		CPolyNomial D = new CPolyNomial();
		CPolyNomial E = new CPolyNomial();
		CPolyNomial F = new CPolyNomial();
		
		A.AddTerm(4, 2);
		A.AddTerm(2, 1);
		A.AddTerm(1, 0);

		System.out.print(" 다항식 A(x) = ");
		A.PrintPoly();
		System.out.println();

		B.AddTerm(1, 1);
		B.AddTerm(1, 0);

		System.out.print(" 다항식 B(x) = ");
		B.PrintPoly();
		System.out.println();
		
		
		C.AddTerm(2, 3);
		C.AddTerm(8, 2);
		C.AddTerm(5, 0);
		
		System.out.print(" 다항식 C(x) = ");
		C.PrintPoly();
		System.out.println();
		
		D.AddTerm(9, 4);
		D.AddTerm(6, 2);
		D.AddTerm(3, 1);
		D.AddTerm(1, 0);
		
		System.out.print(" 다항식 D(x) = ");
		D.PrintPoly();
		System.out.println();
		
		
		System.out.print(" E(x) = A(x)* B(x)  = ");
		E = A.PolyMulti(B);
		E.PrintPoly();
		System.out.println();
		
		
		System.out.print(" F(x) = C(x)+ D(x)  = ");
		F=C.PolyAdd(D);
		F.PrintPoly();
		System.out.println();
		
		
		System.out.print(" E(2) = ");
		System.out.println(E.PolyEval(2));
		System.out.println();
		
		System.out.print(" F(1) = ");
		System.out.println(F.PolyEval(1));
		}

}
