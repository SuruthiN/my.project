package myproj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("start from:");
		n=sc.nextInt();
		System.out.println("End to:");
        num=sc.nextInt();
   
		ArrayList<Integer> arrli=new ArrayList<>();
	for(int i=n;i<=num;i++) {
			 arrli.add(i);
	}
	System.out.println("Main list:"+arrli);
	   for(int i  :arrli) {
		System.out.println(i);
	   }
		ArrayList<Integer> even=new ArrayList<>();
		for(int j=n;j<=num;j++) {
			if(j%2==0) {
				even.add(j);
			}
			}
	    System.out.println("Even Number:"+even);
	
  
	   ArrayList<Integer>odd=new ArrayList<>();
	   for(int j=n;j<=num;j++) {
		   if(j%2!=0) {
			   odd.add(j);
		   }
	   }
	   
	   System.out.println("Odd Number:"+odd);
	   
	   HashSet<Integer> m=new HashSet<Integer>();
	   for(int j1=n;j1<=num;j1++) {
		  m.add(j1);
	   }
	
		  System.out.println("Main Set:"+m);
	   
	
       HashSet<Integer> even1=new HashSet<>();
       for(int j=n;j<=num;j++) {
	   if(j%2==0) {
		even1.add(j);
	}
	}
       System.out.println("Even Number:"+even);


       HashSet<Integer>odd1=new HashSet<>();
       for(int j2=n;j2<=num;j2++) {
       if(j2%2!=0) {
	   odd1.add(j2);
   }
       }
       
       System.out.println("Odd Number:"+odd1);
       

      HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
      hm.put(n,num);
      System.out.println("Hash Map:"+hm);
      
      System.out.println("Finally completed");{
      
	 
      }
	}
}
   
	   

	   
	  
	   
	    
	


	


	



