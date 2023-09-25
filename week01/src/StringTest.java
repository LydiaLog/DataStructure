
class StringTest 
{
	public static void main(String[] args) 
	{
		String empty = "";
		String name = "Seoul";
		String CityName = name; 

// p26ÀÇ ¿¹
		System.out.println("data" + "structure");  // ¡°data structure¡±
		System.out.println("abc" + 5);                // ¡°abc5¡±
		System.out.println(5 + "abc");                // ¡°5abc¡±
		System.out.println("a" + "b" + "c");       // ¡°abc¡±
		System.out.println("a" + 1 + 2);             // ¡°a12¡±
		System.out.println(1 + 2 + "a");             //  ¡°3a¡±
		System.out.println(1 + (2 + "a"));           // ¡°12a¡±
	 
// p27ÀÇ ¿¹
		
		
//		String name = "Seoul";
		// ºóÄ­À» Ã¤¿ö¶ó
		int len = name.length(); 		//lenÀº 5
		System.out.println("length = "+ len);
		
		// ºóÄ­À» Ã¤¿ö¶ó
		char ch = name.charAt(1); // ch´Â ¡®e¡¯
		System.out.println("The 1st charater of name is " + ch);
		
		// ºóÄ­À» Ã¤¿ö¶ó	
		String sub = name.substring(2, 4); // subÀº ¡°ou¡±
		System.out.println("The 1st charater of name is " + sub);

		int count = 78;
		System.out.println("The string of integer count is " + count );
		System.out.println("The string of integer count is " + Integer.toString(count) );
	  	  
	  } // End of main
} // End of Class StringTest
