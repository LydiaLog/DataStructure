
public class MinTest {

	public static void main(String[] args) {

		int a = 3;
		int b = 7;
		System.out.println(min(a,b));
	}
	
	public static int min(int x, int y) {
		// ºóÄ­À» Ã¤¿ö¶ó
		/*int m = 0;
		if (x > y) {
			m = y;
		}else if (x < y) {
			m = x;
		}
		return m;*/
		
		return x < y ? x : y;
			
	}

}

//fin