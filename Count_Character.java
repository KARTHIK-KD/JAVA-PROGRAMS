import java.io.*;
import java.util.*;
public class Count_Character
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String  : ");
		String str=s.nextLine();
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}		
		}
		System.out.println(count);
	}
}

