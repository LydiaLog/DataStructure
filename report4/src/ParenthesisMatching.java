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
			if (expr.charAt(i) == '(' || expr.charAt(i) == '{') { // expr의 i번째 문자가 '(' 또는 '{' 이면
				s.push(i); // 정수 i를 스택에 push
			} else if (expr.charAt(i) == ')' || expr.charAt(i) == '}') {
				if (s.empty()) { // remove location of matching '('or '{'from stack
					System.out.println(i + "번째 괄호에 매칭되는 왼쪽 괄호가 없습니다");
				} else {
					if (expr.charAt((int) s.peek()) == '{' && expr.charAt(i) != '}') {
						System.out.println("올바르지 않은 괄호쌍 입니다. " + expr.charAt((int) s.peek()) + expr.charAt(i));
						// return;
					} else if (expr.charAt((int) s.peek()) == '(' && expr.charAt(i) != ')') {
						System.out.println("올바르지 않은 괄호쌍 입니다. " + expr.charAt((int) s.peek()) + expr.charAt(i));
						// return;
					} else {
						System.out.println(s.pop() + " " + i); // 스택의 top을 pop하고 출력, i를 출력
					}
				}
			}
		}

		// remaining '('or'{' in stack are unmatched
		while (!s.empty()) { // 스택이 비어있지 않으면 왼쪽괄호 '('또는 '{'가 짝이 맞지 않음 -> 오른쪽 괄호 ')'또는 '{'가 부족
			System.out.println(s.pop() + "번째 괄호에 매칭되는 오른쪽 괄호가 없습니다");
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
	      System.out.println("공백 없이 괄호쌍 입력 : ");
	      String expression = bufReader.readLine();

		// output the pairs of matched parentheses
		System.out.println();
		System.out.println("입력된 괄호쌍 '" + expression + "' 에 대한 괄호쌍 검사 결과 (단, Index는 0부터 시작) : ");
		printMatchedPairs(expression);
	}
}
