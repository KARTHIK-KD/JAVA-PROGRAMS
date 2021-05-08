import java.io.*;
import java.util.*;

public class Split
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] st=str.split("k",2);
		for(String x:st)
		{
			System.out.println(x);
		}		
	}
}
