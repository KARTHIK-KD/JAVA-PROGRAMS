import java.io.*;
import java.util.*;
public class Remove_Braces
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=s.nextLine();
		int i=str.indexOf('(');
		int j=str.indexOf(')');
		System.out.println(str.substring(++i,j));
	}
}
