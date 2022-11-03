package myproj;
	class Bird{
		public void sing() {
			System.out.println("tweet tweet");
		}
	}
	class cuckoo extends Bird{
		public void sing() {
			System.out.println("cuckoo cuckoo");
		}
	}
	class robin extends Bird{
		public void sing() {
			System.out.println("kee kee");
		}
	}
	public class polymorphismExtend{
		public static void main(String[] args) {
			robin r=new robin();
			r.sing();
			cuckoo c=new cuckoo();
			c.sing();
			
		}
	}
