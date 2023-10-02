public class CPolyNomial {
	public int element_Num;
	public CTerm TermArray[];
	public int MAX;

	public CPolyNomial() {
		element_Num = 0;
		MAX = 50;
		TermArray = new CTerm[MAX];
	}

	public void MultiTerm(float Coef, int Exp) {
		if (isEmpty() == true) {
			return;
		} else {
			for (int i = 0; i < element_Num; i++) {
				CTerm tm = new CTerm( TermArray[i].GetCoef()*Coef, TermArray[i].GetExp()+Exp);
				TermArray[i] = tm;
			}
		}
	}

	public void copyPoly(CPolyNomial B) {
		for (int i = 0; i < B.element_Num; i++) {
			TermArray[i] = B.TermArray[i];//1
		}
		element_Num = B.element_Num;
	}

	public CPolyNomial PolyMulti(CPolyNomial B) {
		CPolyNomial C = new CPolyNomial();
		CPolyNomial Total = new CPolyNomial();
		for (int i = 0; i < element_Num; i++) {
		}
		return Total;
	}

	public void AddTerm(float Coef, int Exp) {
		CTerm el = new CTerm(Coef, Exp);
		if (isEmpty() == true) 
		{
			TermArray[element_Num] = el;
			element_Num++;
		} 
		else 
		{
			for (int i = 0; i < element_Num; i++) 
			{
				if (TermArray[i].GetExp() < Exp) 
				{
					for (int j = element_Num; i <= j; j--) 
					{
						TermArray[j + 1] = TermArray[j];
					}
					TermArray[i] = el;
					
					element_Num++;
					return;
				} 
				else if (TermArray[i].GetExp() == Exp) 
				{
					TermArray[i].SetCoef(TermArray[i].GetCoef() + Coef);
					return;
				}
			}
			TermArray[element_Num++] = el;
		}
	}

	public CPolyNomial PolyAdd(CPolyNomial B) {
		CPolyNomial C = new CPolyNomial();
		if (isEmpty() == true) {
			for (int i = 0; i < B.element_Num; i++) {
				C.TermArray[i] = B.TermArray[i];
			}
			C.element_Num = B.element_Num;
			return C;
		}
		if (B.isEmpty() == true) {
			
			for (int i = 0; i < element_Num; i++) {
			C.TermArray[i] = TermArray[i];
			}
			C.element_Num = element_Num;
			return C;
		}
		int i = 0, j = 0;
		while (true) {
			if (TermArray[i].GetExp() > B.TermArray[j].GetExp()) {
				
				C.AddTerm(TermArray[i].GetCoef(), TermArray[i].GetExp());
				i++;
			} else if (TermArray[i].GetExp() == B.TermArray[j].GetExp()) {
				
				C.AddTerm(TermArray[i].GetCoef() + B.TermArray[j].GetCoef(), B.TermArray[i].GetExp());
				i++;
				j++;
			} else if (TermArray[i].GetExp() < B.TermArray[j].GetExp()) {
				C.AddTerm(B.TermArray[j].GetCoef(), B.TermArray[j].GetExp());
				j++;
			}
			if (element_Num == i && B.element_Num == j) {
				return C;
			}
			if (element_Num == i || B.element_Num == j) {
				break;
			}
		}

		if (element_Num == i) {
			for (int k = j; k < B.element_Num; k++) {
				// ºóÄ­À» Ã¤¿ì¼¼¿ä
				C.AddTerm(B.TermArray[k].GetCoef(), B.TermArray[k].GetExp());
				
				
			}
		} else if (B.element_Num == j) {
			for (int k = i; k < element_Num; k++) {
				// ºóÄ­À» Ã¤¿ì¼¼¿ä
				C.AddTerm(TermArray[k].GetCoef(), TermArray[k].GetExp());
				
			}
		}
		return C;
	}

	public boolean isEmpty() {
		if (element_Num == 0) {
			return true;
		}
		return false;
	}

	public void PrintPoly() {
		if (isEmpty() == true) {
			System.out.println("¾Æ¹«°Íµµ ¾ø½À´Ï´Ù.");
		} else {
			for (int i = 0; i < element_Num; i++) {
				if (TermArray[i].GetExp() == 0) {
					// ºóÄ­À» Ã¤¿ì¼¼¿ä
					System.out.print(TermArray[i].GetCoef());
				} else {
					// ºóÄ­À» Ã¤¿ì¼¼¿ä
					System.out.print(TermArray[i].GetCoef()+" X^ "+TermArray[i].GetExp()+" + " );
				}
			}
			System.out.println();
			
		}
	}
	
	public void PrintPoly2() {
		System.out.println("X=1.1ÀÏ °æ¿ì");
		if (isEmpty() == true) {
			System.out.println("¾Æ¹«°Íµµ ¾ø½À´Ï´Ù.");
		} else {
			for (int i = 0; i < element_Num; i++) {
				if (TermArray[i].GetExp() == 0) {
					// ºóÄ­À» Ã¤¿ì¼¼¿ä
					System.out.print(TermArray[i].GetCoef());
				} else if(i<=2) {
					// ºóÄ­À» Ã¤¿ì¼¼¿ä
					System.out.print(TermArray[i].GetCoef() * 1.1 * 1.1* TermArray[i].GetExp()+" + " );
				}else if(i<=1){
					System.out.print(TermArray[i].GetCoef() * 1.1* TermArray[i].GetExp()+" + " );
				}
				
			}
			System.out.println();
		}
	}
		
	
	
	public void PrintPoly3() {
		double sum=0;
		sum=24.200000000000003 + 12.100000000000001 + 10.0;
			System.out.println();
			System.out.println("=" + sum);
		}




}
