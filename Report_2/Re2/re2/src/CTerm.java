
public class CTerm {
	private float m_Coef; // 계수
	private int m_Exponent; // 지수

	public CTerm() {
		m_Coef = 0;
		m_Exponent = 0;
	}

	public CTerm(float Coef, int Exp) {
		m_Coef = Coef;
		m_Exponent = Exp;
	}

	// Access함수
	float GetCoef() {
		return m_Coef;
	} // 접근자

	int GetExp() {
		return m_Exponent;
	} // 접근자

	void SetCoef(float coef) {
		m_Coef = coef;
	} // 수정자

	void SetExp(int Expo) {
		m_Exponent = Expo;
	} // 수정자

};