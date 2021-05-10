import java.io.*;
import java.util.*;
public class pattern4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print(j+1);
				}
			}
			System.out.println("\n");
		}	
	}
}
