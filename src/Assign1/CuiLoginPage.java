package Assign1;
import java.util.Scanner;

public class CuiLoginPage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sp = " ";
		System.out.println("Enter the username: ");
		String username = sc.nextLine();
		if((username.contains(sp)) || username.length()<4) {
			System.out.println("Invalid User");
			return;			
		}
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		if((password.contains(sp)) || password.length()<8) {
			System.out.println("Invalid Password");
			return;
		}
		System.out.println(username+"you are Registered Successfully");
		System.out.println("Enter the Username");
		String Iname = sc.nextLine();
		System.out.println("Enter the password");
		String Ipass = sc.nextLine();
		if((username.equals(Iname)) || password.equals(Ipass)) {
			System.out.println("Welcome "+username+" you have logged in successfully");
		}
		else {
			System.out.println("Username or Password Missmatch");
		}
	}

}
