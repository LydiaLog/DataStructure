
public class CTerm {
	private float m_Coef; // 계수
	private int m_Exponent; // 지수

	public CTerm() {
		m_Coef = 0;
		m_Exponent = 0;
	}
//무인자 생성자. 계수와 지수를 각각 0으로 초기화
	public CTerm(float Coef, int Exp) {
		m_Coef = Coef;
		m_Exponent = Exp;
	}
//2인자 생성자. 계수와 지수를 매개변수로 받아 계수와 지수 초기화
	float GetCoef() {
		return m_Coef;
	} // 계수 접근자

	int GetExp() {
		return m_Exponent;
	} // 지수 접근자

	void SetCoef(float coef) {
		m_Coef = coef;
	} // 계수 수정자

	void SetExp(int Expo) {
		m_Exponent = Expo;
	} // 지수 수정자

}
