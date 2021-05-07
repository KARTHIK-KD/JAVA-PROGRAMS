import java.io.*;
import java.util.*;
public class Second_Word_Reverse
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=s.nextLine();
		//String str="i love india";
		int first=str.indexOf(' ');
		int second=str.indexOf(' ',first+1);
		for(int i=second-1;i>=first;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}
}

