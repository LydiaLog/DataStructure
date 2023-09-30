

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParenthesisMatching
{
   /** output the matched parenthesis pairs in the string expr */
   public static void printMatchedPairs(String expr)
   {
      ArrayStack s = new ArrayStack();
      int length = expr.length();
   
      // scan expression expr for ( and )
      for (int i = 0; i < length; i++)
         if (expr.charAt(i) == '(') // expr�� i��° ���ڰ� '('�̸�
            s.push(new Integer(i)); // ���� i�� ���ÿ� push
         else
        	 if (expr.charAt(i) == ')')
           	    try
                 {// remove location of matching '(' from stack
                    // ��ĭ 1
           	    	System.out.println(s.pop()+" "+i); 
                 }
                 catch (Exception e)
                 {// stack was empty, no match exists
                  //  ��ĭ 2
                	 System.out.println("No match for left parenthesis at "
                            + "at" + i);
                 };
        
      // remaining '(' in stack are unmatched
      while (!s.empty()) // ������ ������� ������ ���ʰ�ȣ '('�� ¦�� ���� ���� -> ������ ��ȣ ')'�� ����
         System.out.println("No match for left parenthesis at "
                            + s.pop());
   }
   
   private static InputStreamReader isReader;
   private static BufferedReader bufReader;
   
   /** test program */
   public static void main(String [] args) throws IOException
   {
      // define the input stream to be the standard input stream
	  isReader = new InputStreamReader(System.in);
	  bufReader = new BufferedReader(isReader);

      // input the expression
      System.out.println("Type an expression with no spaces");
      String expression = bufReader.readLine();

      // output the pairs of matched parentheses
      System.out.println("The pairs of matching parentheses in");
      System.out.println(expression);
      System.out.println("are (indexing begins at 0)");
      printMatchedPairs(expression);
   }
}
