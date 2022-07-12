package Assign1;
import java.util.Scanner;

public class SimpleInterestAndCompoundInterest{
	
	public static void main(String[] args) {
		double SI,CI;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle amount: ");
		double p = sc.nextDouble();
		System.out.print("Enter the Rate of Interest: ");
		double r = sc.nextDouble();
		System.out.print("Emter the year: ");
		double t = sc.nextDouble();
		
		SI=(p*r*t)/100;
		
		CI=p*Math.pow(1+r/100, t)-p;
		
		System.out.println("Simple Interest: "+SI);
		System.out.println("Compound Interest: "+CI);
		

		
	}
	
}
	