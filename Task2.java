package myproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static List<String> readUserInput() {
		    List<String> userData = new ArrayList<>();
		    System.out.println("Please enter your data below: (send 'bye' to exit) ");
		    Scanner input = new Scanner(System.in);
		    while (true) {
		        String line = input.nextLine();
		        if ("bye".equalsIgnoreCase(line)) {
		            break;
		        }
		        userData.add(line);
		    }
		    return userData;
		}
		


	}


