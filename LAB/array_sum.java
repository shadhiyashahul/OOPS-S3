import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int sum=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter limit");
		n=s.nextInt();
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum : "+sum);
	}
}
