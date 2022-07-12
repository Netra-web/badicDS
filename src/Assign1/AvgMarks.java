package Assign1;

public class AvgMarks {
	public static void main(String[] args) {
		int n=3,avg=0;
		int a,b,c;
		a=10;
		b=20;
		c=30;
		for(int i=0;i<n;i++)
			avg=avg+a+b+c;
		System.out.println("average of ("+a+","+b+","+c+") is="+avg/n);
	}

}
