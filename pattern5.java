import java.io.*;
import java.util.*;
public class pattern5
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=num-1;j>=0;j--)
			{
				if(i<=j)
				{
					System.out.print(j+1);
				}
			}
			System.out.println("\n");
		}	
	}
}
