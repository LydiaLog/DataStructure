class Test
{
	public int value;
};  // end of class Test

class callByReference
{

	public static void main(String[] args)
	{
		Test t = new Test();
		t.value=99;
		System.out.println("before : i= " + t.value );
		changeValue(t);
		System.out.println("after : i= " + t.value );
	} // end of main
	
	static void changeValue(Test j) {
		j.value=88;
	} // end of changeValue


	
} // End of class

