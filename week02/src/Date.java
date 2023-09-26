
public class Date {
	private int month;
	private int day;
	private int year;
	public Date() {
		month = 1;
		day = 1;
		year = 2003;
	}
	public Date (int theMonth, int theDay, int theYear) {
		month = theMonth;
		day = theDay;
		year = theYear;
	}
	
	public boolean equals(Object a) {
		if (!(a instanceof Date)) {
			return false;
		}
		Date d = (Date) a;
		return d.month == month && d.day == day && d.year == year; // ��ĭ�� ä��ÿ� 
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(4, 15, 2003);
		
		if (d1.equals(d2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		d1.month = 4;
		d1.day = 15;
		d1.year = 2003;
		
		if (d1.equals(d2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if (d1 == d2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		System.out.println("toString �� ��� �� " + d1.toString());
	}
	

}
