import java.io.*;
import java.util.*;
public class Count_Odd_Even
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of Element : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the Element one by one ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int odd=0,even=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;		
			}
			else
			{
				odd++;
			}	
		}
		System.out.println("Odd : "+odd+" Even "+even);
	}
}
