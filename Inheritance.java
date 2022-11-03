package myproj;
 class Human {
		public void eat() {
			System.out.println("Human can eat");}
    }
   class male extends Human{
    	public void eat() {
    	  super.eat();
    	  System.out.println("Male can eat");
    	}
    
        public void speak() {
        	System.out.println("Male can speak");
        }
    }
    class female extends Human{
    	public void eat(){
    		super.eat();
    		System.out.println("Female can eat");
    		
    	}
    	public void cook() {
    	   System.out.println("Female can cook");}
    }
public class Inheritance{
	public static void main(String[] args) {
		male m=new male();
		m.eat();
		m.speak();
		female f=new female();
		f.eat();
		f.cook();

		
		
	}
}
         
		