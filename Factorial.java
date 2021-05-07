import java.io.*;
import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Value  : ");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

