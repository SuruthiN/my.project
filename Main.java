package myproj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraylist");
		n=sc.nextInt();
		ArrayList<Integer> arrli=new ArrayList<>();
	for(int i=1;i<=n;i++) {
			 arrli.add(i);
	}
	System.out.println(arrli);
	
	for(int num:arrli) {
		System.out.println(num);
		
	}
          System.out.println("Enter the LinkedList");
      //  n=sc.nextInt() ;
          LinkedList<Integer> linkli=new LinkedList<Integer>();
      
	 for(int i1=1;i1<=n;i1++) {
    	      linkli.add(i1);
	 }
      System.out.println(linkli);
	
      for(int num1:linkli) {
    	  System.out.println(num1);
      }
        }
}



