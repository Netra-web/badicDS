package Assign1;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CTC: ");
		int a= sc.nextInt();
		
		
		if(a>0 && a<180000)
		{
			System.out.println("Tax Payable Amount is :"+a);
		}
		else if (a>180001 && a<300000)
		{
			 System.out.println("Tax Payable Amount is :"+(a+(0.1*a)));
		}
		else if (a<300000 && a>500000)
		{
			 System.out.println("Tax Payable Amount is :"+(a+(0.2*a)));
		}
		if ( a>500001 && a<1000000)
		{
			 System.out.println("Tax Payable Amount is :"+(a+(0.3*a)));
		}
	}

}
