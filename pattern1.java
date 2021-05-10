import java.io.*;
import java.util.*;
public class pattern1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=s.nextInt();
		char c='A';
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print(c);
					c++;
				}
			}
			System.out.println("\n");
			c='A';
		}	
	}
}
