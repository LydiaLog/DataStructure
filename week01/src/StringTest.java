
class StringTest 
{
	public static void main(String[] args) 
	{
		String empty = "";
		String name = "Seoul";
		String CityName = name; 

// p26�� ��
		System.out.println("data" + "structure");  // ��data structure��
		System.out.println("abc" + 5);                // ��abc5��
		System.out.println(5 + "abc");                // ��5abc��
		System.out.println("a" + "b" + "c");       // ��abc��
		System.out.println("a" + 1 + 2);             // ��a12��
		System.out.println(1 + 2 + "a");             //  ��3a��
		System.out.println(1 + (2 + "a"));           // ��12a��
	 
// p27�� ��
		
		
//		String name = "Seoul";
		// ��ĭ�� ä����
		int len = name.length(); 		//len�� 5
		System.out.println("length = "+ len);
		
		// ��ĭ�� ä����
		char ch = name.charAt(1); // ch�� ��e��
		System.out.println("The 1st charater of name is " + ch);
		
		// ��ĭ�� ä����	
		String sub = name.substring(2, 4); // sub�� ��ou��
		System.out.println("The 1st charater of name is " + sub);

		int count = 78;
		System.out.println("The string of integer count is " + count );
		System.out.println("The string of integer count is " + Integer.toString(count) );
	  	  
	  } // End of main
} // End of Class StringTest
