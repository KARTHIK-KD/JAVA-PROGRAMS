import java.io.*;
import java.util.*;
public class Assignment_operator
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("Addition  : "+(num1+num2));
		System.out.println("Subraction: "+(num1-num2));
		System.out.println("Multipile : "+(num1*num2));
		System.out.println("Divition  : "+(num1/num2));
		System.out.println("Modulo    : "+(num1%num2));
	}
}
