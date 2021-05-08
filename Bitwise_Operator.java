import java.io.*;
import java.util.*;
public class Bitwise_Operator
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("&&  : "+(num1&num2));
		System.out.println("||  : "+(num1|num2));
		System.out.println(" ^  : "+(num1^num2));
	}
}
