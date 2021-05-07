import java.io.*;
import java.util.*;
public class Reverse_String
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=s.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
	}
}
