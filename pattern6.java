import java.io.*;
import java.util.*;
public class pattern6
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt();
		int A=1;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i<=j)
				{
					System.out.print(A);
					A++;
				}
			}
			System.out.println("\n");
			A=1;
		}	
	}
}
