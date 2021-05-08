import java.io.*;
import java.util.*;

class A
{
	public int Addition(int a,int b)
	{
		return a+b;
	}
	public int Subraction(int a,int b)
	{
		return a-b;
	}
	public int Multiple(int a,int b)
	{
		return a*b;
	}
	public int Divition(int a,int b)
	{
		return a/b;
	}
}

public class Methods
{
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1.Addition(5,4));
		System.out.println(a1.Subraction(5,4));
		System.out.println(a1.Multiple(5,4));
		System.out.println(a1.Divition(5,4));		
	}
}
