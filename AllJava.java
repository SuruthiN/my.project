
package myproj;

public class AllJava {

	public String name;
	public double monthsalary;
	public long mobile;
	public String email;
	public int nisha;
	public char myletter;
	public boolean javadeveloper;
	public float b;
	public static String s= "jeno";
	public final static String rr= "sruthi";

	public void setname(String yourname) {
		this.name = yourname;
	}

	public String getname() {
		return this.name;
	}

	public void normalmethod() {
	}

	public static void staticmethod() {
	}

	public AllJava(String name, double monthsalary, long mobile, String email,
			int age, char Myletter, boolean Javadeveloper, float A) {
		this.name = name;
		this.monthsalary = monthsalary;
		this.mobile = mobile;
		this.email = email;
		this.nisha = nisha;
		this.myletter = Myletter;
		this.javadeveloper = Javadeveloper;
		this.b = A;
	}

	public AllJava() {

	}

	public static void main(String[] args) {
		AllJava s1 = new AllJava();
		s1.name = "sruthi";
		s1.monthsalary = 10000;
		s1.mobile = 902593922l;
		s1.email = "shruthikanagarajan42@gmail.com";
		s1.nisha = 23;
		s1.myletter = 'S';
		s1.javadeveloper = false;
		s1.b = 3.245f;
		AllJava rr = new AllJava();
		rr.setname("");
		System.out.println(rr.name);
		AllJava mm= new AllJava();
		mm.normalmethod();
		AllJava.staticmethod();
		AllJava s= new AllJava("sruthi", 2354.00, 9025393922l," shruthikanagarajan42@gmail.com", 23, 'S', false, 5.00f);
		System.out.println(s1.name + "  "+ s1.monthsalary + "  " + s1.mobile + "  "
						+ s1.email + "   " + s1.nisha + "  " + s1.myletter + "  " + s1.javadeveloper + "  " + s1.b);
		System.out.println(s1.name + " "  + s1.monthsalary + "  "
				+ s1.mobile + "  " + s1.email + "   " + s1.nisha + "  " + s1.myletter + "  " + s1.javadeveloper
				+ "  " + s1.b);
		System.out.println();
		System.out.println();
	}

}
