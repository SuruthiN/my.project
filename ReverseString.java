package myproj;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string to reverse");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());
		}

	}


