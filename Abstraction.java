package myproj;

abstract class Abstraction {
	abstract void name();
	int speed(int a) {
		return a;
	}
	
}
   class Pulsar extends Abstraction{
	   void name() {
		   System.out.println("Bike name:Pulsar");
	   }
   }
   class yamaha extends Abstraction{
	   void name() {
		   System.out.println("Bike name:yamaha");
	   }
   }
  class vehicle{
	public static void main(String[] args) {
		   Pulsar p=new Pulsar();
		   yamaha y=new yamaha();
		   p.name();
		   System.out.println("speed of pulsar is " + p.speed(180));
		   y.name();
		   System.out.println("speed of yamaha is " + y.speed(200));
		   
   }
}