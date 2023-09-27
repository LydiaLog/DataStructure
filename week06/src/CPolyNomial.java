
public class CPolyNomial {
	public int element_Num;
	public CTerm TermArray[];
	public int MAX;


	public CPolyNomial() {
		element_Num = 0; // ���� ��
		MAX = 50;//�ִ� ���� ����
		TermArray = new CTerm[MAX];//max���� �� �迭 ����
	}//���׽��� ����� �޼ҵ�
	
	
	public void copyPoly(CPolyNomial B) {   // A(x) = B(x) ���� 
		for (int i = 0; i < B.element_Num; i++) 
		{
			TermArray[i] = B.TermArray[i];// (1) ��ĭ�� ä�켼�� 
		}
		element_Num = B.element_Num;
	}
	
		
	public boolean isEmpty() {
		if (element_Num == 0) {
			return true;
		}
		return false;
	}//���׽��� ������� �ƴ��� �Ǵ��ϴ� �޼ҵ�

	
	
	public void AddTerm(float Coef, int Exp) {  // A(X) = A(X) + Coef * x^Exp
		CTerm el = new CTerm(Coef, Exp);
		if (isEmpty() == true) 
		{
			TermArray[element_Num] = el;
			element_Num++;
		} //���׽��� ������� ������ ��
		else 
		{
			for (int i = 0; i < element_Num; i++) 
			{
				if (TermArray[i].GetExp() < Exp) 
				{
					for (int j = element_Num/*-1*/; i <= j; j--) 
					{
						TermArray[j + 1] = TermArray[j];
					}
					TermArray[i] = el;
					
					element_Num++;
					return;
				} 
				else if (TermArray[i].GetExp() == Exp) // ������ ���� ��
				{
					TermArray[i].SetCoef(TermArray[i].GetCoef() + Coef);
					return;
				} // end if 
			} // end for
			TermArray[element_Num++] = el; //TermArray[0].GetExp() > Exp ��� ���� �����ʿ� �߰�
		}
	}
	
	
	
	public void MultiTerm(float Coef, int Exp) {     // A(X) = A(X) * Coef * x^Exp
		if (isEmpty() == true) {
			return;
		} else {
			for (int i = 0; i < element_Num; i++) {
				CTerm tm = new CTerm(TermArray[i].GetCoef()*Coef,TermArray[i].GetExp()+Exp);
				TermArray[i] = tm;
			}
		}
	}
	
	
	public CPolyNomial PolyMulti(CPolyNomial B) {    // Total(x) = A(x) * B(x)
	      CPolyNomial C = new CPolyNomial();
	      CPolyNomial Total = new CPolyNomial();

	      for (int i = 0; i < element_Num; i++) {
	   
	    	  C.copyPoly(B);
			  C.MultiTerm(TermArray[i].GetCoef(),TermArray[i].GetExp());
			  Total = Total.PolyAdd(C); // (9) ��ĭ�� ä�켼��
	      }
	      return Total;
	   }
	
	
	
	public CPolyNomial PolyAdd(CPolyNomial B) {  // C(x) = A(x) + B(x)
		CPolyNomial C = new CPolyNomial();       // C(x) = 0  
		if (isEmpty() == true) {                 // A(X) = 0�̶��, C(X) = B(x) 
			for (int i = 0; i < B.element_Num; i++) {
				C.TermArray[i] = B.TermArray[i];
			}
			C.element_Num = B.element_Num;
			return C;
		}
		if (B.isEmpty() == true) {              // B(x) = 0�̶�� , C(X) = A(X)
			// (2) ��ĭ�� ä�켼�� 
			for(int i = 0; i < element_Num; i++) {
				C.TermArray[i] = TermArray[i];
			}
			
			C.element_Num = element_Num; 
			return C;
		}
		int i = 0, j = 0;
		while (true) {                         // (A(X)!= 0 �̰�  B(x)!= 0 ��� 
			if (TermArray[i].GetExp() > B.TermArray[j].GetExp()) {     // ���׽� A(x)�� ���� ������ B(x)�� ���� ���� ���� Ŭ��, 
				// (3) ��ĭ�� ä�켼�� 
				C.AddTerm(TermArray[i].GetCoef(), TermArray[i].GetExp()); // TermArray�� i��° ����, ��� �ֱ�
				i++; //i ����
				
			} else if (TermArray[i].GetExp() == B.TermArray[j].GetExp()) {   // ���׽� A(x)�� ���� ������ B(x)�� ���� ���� �� ������, 
				// (4)��ĭ�� ä�켼�� 
				C.AddTerm(TermArray[i].GetCoef() + B.TermArray[j].GetCoef(), TermArray[i].GetExp()); //������� ���ؼ� ��� ������ �״��
				i++;
				j++;
				
			} else if (TermArray[i].GetExp() < B.TermArray[j].GetExp()) {   // ���׽� A(x)�� ���� ������ B(x)�� ���� ���� ���� ������,  
				C.AddTerm(B.TermArray[j].GetCoef(), B.TermArray[j].GetExp());
				j++;
			}
			if (element_Num == i && B.element_Num == j) {   // A(X), B(x)�� ������ ���� ���� ��� 
				return C;
			}
			if (element_Num == i || B.element_Num == j) {  // A(X), B(x)�� �� �߿� �� ���׽���  ������ ���� ���� ��� 
				break;
			}
		}

		if (element_Num == i) {    // B(x)�� ������ ���� ���� �ִ� ��� 
			for (int k = j; k < B.element_Num; k++) { 
				// (5) ��ĭ�� ä�켼�� 
				C.AddTerm(B.TermArray[k].GetCoef(), B.TermArray[k].GetExp()); // 

			}
		} else if (B.element_Num == j) {   // A(x)�� ������ ���� ���� �ִ� ��� 
			for (int k = i; k < element_Num; k++) {
				// (6)��ĭ�� ä�켼�� 
				C.AddTerm(TermArray[k].GetCoef(), TermArray[k].GetExp());
			}
		}
		return C;
	}
	
	
	public void PrintPoly() {
		if (isEmpty() == true) {
			System.out.println("�ƹ��͵� �����ϴ�.");
		} else {
			for (int i = 0; i < element_Num; i++) {
				if (TermArray[i].GetExp() == 0) {   // ������׿� ���� ó��
					if (TermArray[i].GetCoef() > 0)  // ����� ����� ���
						System.out.println("+" + TermArray[i].GetCoef());	// (2) ��ĭ�� ä�켼��.																 System.out.print(TermArray[i].GetCoef());  
					else                      // ����� ������ ��� 
						System.out.println(TermArray[i].GetCoef() + "x^" + TermArray[i].GetExp());		// (3) ��ĭ�� ä�켼��.															 System.out.print(TermArray[i].GetCoef()+" X^ "+TermArray[i].GetExp()+" + " );
				} else {
					if(i==0){                // �ְ������� ó�� 
						System.out.print(TermArray[i].GetCoef()+"X^"+TermArray[i].GetExp());
						}
					else if(TermArray[i].GetCoef() > 0) {      // �߰������� ����� ����� ���
					    System.out.print("+" + TermArray[i].GetCoef()+"X^"+TermArray[i].GetExp());
				        }
					else{                                      // �߰��� ���� ����� ������ ���
						System.out.print(TermArray[i].GetCoef()+"X^"+TermArray[i].GetExp());
					   }
			} 
		  } System.out.println();
		}
	}

	
	public float PolyEval(int k) {
		float arr[] = new float[element_Num];
		float result = 0;

		for (int i = 0; i < element_Num; i++) {
			if (TermArray[i].GetExp() > 0) {
				arr[i] = TermArray[i].GetCoef();
				for (int j = 0; j < TermArray[i].GetExp(); j++) {
					arr[i] *= k;
				}
				result += arr[i];
			} else {
				arr[i] = TermArray[i].GetCoef();
				result += arr[i];
			}
		}return result;
	}
}
