 
class callByValueTest 
{	

	public static void main(String[] args) 
	{
		int i=99;
		System.out.println("before : i= " + i );
		changeValue(i);
		System.out.println("after : i= " + i );
	}  // end of main

	static void changeValue(int j) {
		j=88;
	}  // end of ChangeValue

}
