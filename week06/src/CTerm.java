
public class CTerm {
	private float m_Coef; // ���
	private int m_Exponent; // ����

	public CTerm() {
		m_Coef = 0;
		m_Exponent = 0;
	}
//������ ������. ����� ������ ���� 0���� �ʱ�ȭ
	public CTerm(float Coef, int Exp) {
		m_Coef = Coef;
		m_Exponent = Exp;
	}
//2���� ������. ����� ������ �Ű������� �޾� ����� ���� �ʱ�ȭ
	float GetCoef() {
		return m_Coef;
	} // ��� ������

	int GetExp() {
		return m_Exponent;
	} // ���� ������

	void SetCoef(float coef) {
		m_Coef = coef;
	} // ��� ������

	void SetExp(int Expo) {
		m_Exponent = Expo;
	} // ���� ������

}
