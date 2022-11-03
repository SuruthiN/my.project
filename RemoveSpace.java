package myproj;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.println("Initial string:");
		String str1=sc.nextLine();
		String str2=str1.replaceAll("\\s","");
		System.out.println("concatenated string="+str2);
		String s;  
		int i, len;  
		int counter[] = new int[500];      
		len = str2.length();    
		for (i = 0; i < len; i++)   
		{  
		counter[(int)str2.charAt(i)]++;  
		}  
	
		for (i = 0; i < 500; i++)   
		{  
		if (counter[i] != 0)   
		{  
	    
		System.out.println((char) i + " = " + counter[i]);  
		}  
		}  
		}  

		
}