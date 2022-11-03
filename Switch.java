package myproj;
import java.util.Scanner;
public class Switch {
 //A=90-100
 //B=80-90
 //C=70-80
 //D=60-70
 //E=50-60
 //F=below 50
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
	    switch(score/10)
	    {
		 case 9://90-100
			System.out.println("Value between 90-100");
			System.out.println("Grade A");
			break;
		case 8://80-90
			System.out.println("Value between 80-90");
			System.out.println("Grade B");
			break;
		case 7://70-80
			System.out.println("Value between 70-80");
			System.out.println("Grade C");
			break;
		case 6://60-70
			System.out.println("Value between 60-70");
			System.out.println("Grade D");
			break;
		case 5://50-60
			System.out.println("Value between 50-60");
			System.out.println("Grade E");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Value between 50-0");
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Grade F");
		}
		
			
			
	 
	 

	}

}
