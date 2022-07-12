package Assign1;

public class ArmStrongRange {
	public static void main(String[] args) {
		for(int i = 100;i <=1000;i++)
		{
			int n=i;
			int d=0;
			int s=0;
			while(n>0)
			{
				d=n%10;
				s=s+(d*d*d);
				n=n/10;
			}
			if(i==s)
			{
				System.out.println(i +" is Armstrong number");
			}
		}

	}

}
