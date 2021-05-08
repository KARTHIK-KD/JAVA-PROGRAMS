import java.io.*;
import java.util.*;

public class Upper_Lower
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=s.nextLine();
		String ss=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
		System.out.println(ss);		
	}
}
