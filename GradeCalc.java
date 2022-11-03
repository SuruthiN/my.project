package myproj;
import java.util.Scanner;
public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		char grade;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the score:");
		score=scanner.nextInt();
		if (score>=90) 
			System.out.println("Grade A");
	    else if(score>=80)
			System.out.println("Grade B");
		else if(score>=70)
			System.out.println("Grade C");
		else if(score>=60)
			System.out.println("Grade D");
		else if(score>=50)
			System.out.println("Grade E");
		else if(score>=40)
			System.out.println("Grade F");
	}
}
		
		

	


