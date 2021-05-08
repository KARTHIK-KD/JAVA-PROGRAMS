import java.io.*;
import java.util.*;
public class Second_highest_Element
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
		int f=arr[0],sec=0;
		for(int i=1;i<n;i++)
		{
			if(f<arr[i])
			{
				sec=f;
				f=arr[i];		
			}	
		}
		System.out.println("Second Elements : "+sec);
	}
}
