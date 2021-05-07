import java.io.*;
import java.util.*;
public class Count_Vowels
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=s.nextLine();
		for(int i=0;i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='O' || c=='U' || c=='I')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

