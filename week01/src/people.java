
class Person { 
    public void output() {
	System.out.println("Person��s object method");
       }
    }

class Student extends Person { 
      public void output() {
	System.out.println("Student��s object method");
       }
    }

class people 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.output();   // Person Ŭ������ output() ȣ��
		p = new Student();
		p.output();   // Student Ŭ������ output() ȣ��
	}
}