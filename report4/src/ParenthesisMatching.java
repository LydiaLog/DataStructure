import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParenthesisMatching {
	/** output the matched parenthesis pairs in the string expr */
	public static void printMatchedPairs(String expr) {
		ArrayStack s = new ArrayStack();
		int length = expr.length();

		// scan expression expr for ( and )
		for (int i = 0; i < length; i++) {
			if (expr.charAt(i) == '(' || expr.charAt(i) == '{') { // expr�� i��° ���ڰ� '(' �Ǵ� '{' �̸�
				s.push(i); // ���� i�� ���ÿ� push
			} else if (expr.charAt(i) == ')' || expr.charAt(i) == '}') {
				if (s.empty()) { // remove location of matching '('or '{'from stack
					System.out.println(i + "��° ��ȣ�� ��Ī�Ǵ� ���� ��ȣ�� �����ϴ�");
				} else {
					if (expr.charAt((int) s.peek()) == '{' && expr.charAt(i) != '}') {
						System.out.println("�ùٸ��� ���� ��ȣ�� �Դϴ�. " + expr.charAt((int) s.peek()) + expr.charAt(i));
						// return;
					} else if (expr.charAt((int) s.peek()) == '(' && expr.charAt(i) != ')') {
						System.out.println("�ùٸ��� ���� ��ȣ�� �Դϴ�. " + expr.charAt((int) s.peek()) + expr.charAt(i));
						// return;
					} else {
						System.out.println(s.pop() + " " + i); // ������ top�� pop�ϰ� ���, i�� ���
					}
				}
			}
		}

		// remaining '('or'{' in stack are unmatched
		while (!s.empty()) { // ������ ������� ������ ���ʰ�ȣ '('�Ǵ� '{'�� ¦�� ���� ���� -> ������ ��ȣ ')'�Ǵ� '{'�� ����
			System.out.println(s.pop() + "��° ��ȣ�� ��Ī�Ǵ� ������ ��ȣ�� �����ϴ�");
		}
	}
	   private static InputStreamReader isReader;
	   private static BufferedReader bufReader;

	/** test program */
	 public static void main(String [] args) throws IOException {
		
		 // define the input stream to be the standard input stream
		  isReader = new InputStreamReader(System.in);
		  bufReader = new BufferedReader(isReader);


	      // input the expression
	      System.out.println("���� ���� ��ȣ�� �Է� : ");
	      String expression = bufReader.readLine();

		// output the pairs of matched parentheses
		System.out.println();
		System.out.println("�Էµ� ��ȣ�� '" + expression + "' �� ���� ��ȣ�� �˻� ��� (��, Index�� 0���� ����) : ");
		printMatchedPairs(expression);
	}
}
