
public class PolyTest {
	public static void main(String[] args) {
		CPolyNomial A = new CPolyNomial();
		CPolyNomial B = new CPolyNomial();
		CPolyNomial C = new CPolyNomial();
		CPolyNomial D = new CPolyNomial();
		CPolyNomial E = new CPolyNomial();
		CPolyNomial F = new CPolyNomial();
		
		A.AddTerm(2, 2);
		A.AddTerm(4, 1);
		A.AddTerm(6, 0);

		System.out.print(" ���׽� A(x) = ");
		A.PrintPoly();
		System.out.println();

		B.AddTerm(3, 1);
		B.AddTerm(4, 0);

		System.out.print(" ���׽� B(x) = ");
		B.PrintPoly();
		System.out.println();
		
		
		C.AddTerm(6, 3);
		C.AddTerm(2, 2);
		C.AddTerm(3, 1);
		
		System.out.print(" ���׽� C(x) = ");
		C.PrintPoly();
		System.out.println();
		
		D.AddTerm(2, 4);
		D.AddTerm(3, 2);
		D.AddTerm(6, 1);
		D.AddTerm(7, 0);
		
		System.out.print(" ���׽� D(x) = ");
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
		
		
		System.out.print(" E(1) = ");
		System.out.println(E.PolyEval(1));
		System.out.println();
		
		System.out.print(" F(2) = ");
		System.out.println(F.PolyEval(2));
		}

}
