import java.io.*;
import java.util.*;
import java.lang.Math;
public class pattern8
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt();
		int a=1;
		for(int i=num-1;i>-num;i--)
		{
			for(int j=num-1;j>=0;j--)
			{
				if(Math.abs(i)>=j)
				{
					System.out.print(a);
					a++;
				}
			}
			System.out.println("\n");
			a=1;
		}	
	}
}
