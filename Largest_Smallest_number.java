import java.io.*;
import java.util.*;
public class Largest_Smallest_number
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number of Elements : ");
		int arr_len=s.nextInt();
		int[] arr=new int[arr_len];
		System.out.println("Enter the Element one by one ");
		for(int i=0;i<arr_len;i++)
		{
			arr[i]=s.nextInt();
		}
		int big=arr[0],small=arr[0];
		for(int i=1;i<arr_len;i++)
		{
			if(big<arr[i])
			{
				big=arr[i];
			}
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("Small-> "+small+" Big-> "+big);
	}
}
