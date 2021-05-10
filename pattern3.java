import java.io.*;
import java.util.*;
public class pattern3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt();
		int A;
		for(int i=0;i<num;i++)
		{
			if(i%2==0)
				A=1;
			else
				A=0;
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					System.out.print(A);
					if(A==0)
						A=1;
					else if(A==1)
						A=0;
				}
			}
			System.out.println("\n");
		}	
	}
}
