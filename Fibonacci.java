import java.io.*;
import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		int n1=0,n2=1,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt();
		if(num==1)
		{
			System.out.println(n1);
		}
		else if(num==2)
		{
			System.out.println(n1+" "+n2);
		}
		else
		{
			System.out.print(n1+" "+n2);
			for(int i=0;i<num-2;i++)
			{
				//System.out.println(" "+(n1+n2));
				temp=n2;
				n2=n1+n2;
				n1=temp;
				System.out.print(" "+n2);
			}
		}
	}
}
