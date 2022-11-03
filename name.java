package myproj;
import java.util.Scanner;
public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
        System.out.println("user name");
        String username=s.nextLine();
        System.out.println("username:"+username);
        int age;
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        System.out.println(sc.nextInt()+"It is Integer");
        else
        	System.out.println(sc.nextLine()+"It is not a Integer");
	}
}



