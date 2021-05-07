import java.io.*;
import java.util.*;
public class Biggest_Three_Number
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the First Value  : ");
		int num1=s.nextInt();
		System.out.print("Enter the Second Value : ");
		int num2=s.nextInt();
		System.out.print("Enter the Third Value  : ");
		int num3=s.nextInt();
		System.out.println((num1>num2)?((num1>num3)?num1:num3):(num2>num3)?num2:num3);
		
	}
}

