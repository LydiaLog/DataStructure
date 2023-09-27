
public class CPolyNomial {
	public int element_Num;
	public CTerm TermArray[];
	public int MAX;


	public CPolyNomial() {
		element_Num = 0; // 항의 수
		MAX = 50;//최대 항의 갯수
		TermArray = new CTerm[MAX];//max개의 항 배열 생성
	}//다항식을 만드는 메소드
	
	
	public void copyPoly(CPolyNomial B) {   // A(x) = B(x) 복사 
		for (int i = 0; i < B.element_Num; i++) 
		{
			TermArray[i] = B.TermArray[i];// (1) 빈칸을 채우세요 
		}
		element_Num = B.element_Num;
	}
	
		
	public boolean isEmpty() {
		if (element_Num == 0) {
			return true;
		}
		return false;
	}//다항식이 비었는지 아닌지 판단하는 메소드

	
	
	public void AddTerm(float Coef, int Exp) {  // A(X) = A(X) + Coef * x^Exp
		CTerm el = new CTerm(Coef, Exp);
		if (isEmpty() == true) 
		{
			TermArray[element_Num] = el;
			element_Num++;
		} //다항식이 비었으면 덧셈을 함
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
				else if (TermArray[i].GetExp() == Exp) // 차수가 같을 때
				{
					TermArray[i].SetCoef(TermArray[i].GetCoef() + Coef);
					return;
				} // end if 
			} // end for
			TermArray[element_Num++] = el; //TermArray[0].GetExp() > Exp 경우 제일 오른쪽에 추가
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
			  Total = Total.PolyAdd(C); // (9) 빈칸을 채우세요
	      }
	      return Total;
	   }
	
	
	
	public CPolyNomial PolyAdd(CPolyNomial B) {  // C(x) = A(x) + B(x)
		CPolyNomial C = new CPolyNomial();       // C(x) = 0  
		if (isEmpty() == true) {                 // A(X) = 0이라면, C(X) = B(x) 
			for (int i = 0; i < B.element_Num; i++) {
				C.TermArray[i] = B.TermArray[i];
			}
			C.element_Num = B.element_Num;
			return C;
		}
		if (B.isEmpty() == true) {              // B(x) = 0이라면 , C(X) = A(X)
			// (2) 빈칸을 채우세요 
			for(int i = 0; i < element_Num; i++) {
				C.TermArray[i] = TermArray[i];
			}
			
			C.element_Num = element_Num; 
			return C;
		}
		int i = 0, j = 0;
		while (true) {                         // (A(X)!= 0 이고  B(x)!= 0 라면 
			if (TermArray[i].GetExp() > B.TermArray[j].GetExp()) {     // 다항식 A(x)의 현재 차수가 B(x)의 현재 차수 보다 클때, 
				// (3) 빈칸을 채우세요 
				C.AddTerm(TermArray[i].GetCoef(), TermArray[i].GetExp()); // TermArray의 i번째 지수, 계수 넣기
				i++; //i 증가
				
			} else if (TermArray[i].GetExp() == B.TermArray[j].GetExp()) {   // 다항식 A(x)의 현재 차수가 B(x)의 현재 차수 와 같을때, 
				// (4)빈칸을 채우세요 
				C.AddTerm(TermArray[i].GetCoef() + B.TermArray[j].GetCoef(), TermArray[i].GetExp()); //계수끼리 더해서 계수 지수는 그대로
				i++;
				j++;
				
			} else if (TermArray[i].GetExp() < B.TermArray[j].GetExp()) {   // 다항식 A(x)의 현재 차수가 B(x)의 현재 차수 보다 작을때,  
				C.AddTerm(B.TermArray[j].GetCoef(), B.TermArray[j].GetExp());
				j++;
			}
			if (element_Num == i && B.element_Num == j) {   // A(X), B(x)가 나머지 항이 없는 경우 
				return C;
			}
			if (element_Num == i || B.element_Num == j) {  // A(X), B(x)의 둘 중에 한 다항식의  나머지 항이 없는 경우 
				break;
			}
		}

		if (element_Num == i) {    // B(x)가 나머지 항을 갖고 있는 경우 
			for (int k = j; k < B.element_Num; k++) { 
				// (5) 빈칸을 채우세요 
				C.AddTerm(B.TermArray[k].GetCoef(), B.TermArray[k].GetExp()); // 

			}
		} else if (B.element_Num == j) {   // A(x)가 나머지 항을 갖고 있는 경우 
			for (int k = i; k < element_Num; k++) {
				// (6)빈칸을 채우세요 
				C.AddTerm(TermArray[k].GetCoef(), TermArray[k].GetExp());
			}
		}
		return C;
	}
	
	
	public void PrintPoly() {
		if (isEmpty() == true) {
			System.out.println("아무것도 없습니다.");
		} else {
			for (int i = 0; i < element_Num; i++) {
				if (TermArray[i].GetExp() == 0) {   // 상수차항에 대한 처리
					if (TermArray[i].GetCoef() > 0)  // 상수가 양수인 경우
						System.out.println("+" + TermArray[i].GetCoef());	// (2) 빈칸을 채우세요.																 System.out.print(TermArray[i].GetCoef());  
					else                      // 상수가 음수인 경우 
						System.out.println(TermArray[i].GetCoef() + "x^" + TermArray[i].GetExp());		// (3) 빈칸을 채우세요.															 System.out.print(TermArray[i].GetCoef()+" X^ "+TermArray[i].GetExp()+" + " );
				} else {
					if(i==0){                // 최고차항의 처리 
						System.out.print(TermArray[i].GetCoef()+"X^"+TermArray[i].GetExp());
						}
					else if(TermArray[i].GetCoef() > 0) {      // 중간차항의 계수가 양수인 경우
					    System.out.print("+" + TermArray[i].GetCoef()+"X^"+TermArray[i].GetExp());
				        }
					else{                                      // 중간차 항의 계수가 음수인 경우
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
