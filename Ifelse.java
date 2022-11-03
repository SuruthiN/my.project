package myproj;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int n;
		  System.out.println("Enter the mark:");
		  n=Sc.nextInt();
		if(n<=50)
		{
			System.out.println("student is fail");
		}
		else
			if(n<=60)
			{
			System.out.println("Student is D grade");
			}
			else
			{
				if(n<=70)
				{
				System.out.println("Student is C grade");
			}
				else
				{
					if(n<=80)
					{
						System.out.println("Student is B grade");
				}
					else
					{
						if(n<=90)
							System.out.println("Student is A grade");
						
		}
	}

			}	}
	}
