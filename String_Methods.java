import java.io.*;
import java.util.*;
public class String_Methods
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str="karthik";
		String str1="kArthik";
		System.out.println("charAt() -> "+(str.charAt(1)));
		System.out.println("codePointAt() -> "+(str.codePointAt(1)));
		System.out.println("codePointBefore() -> "+(str.codePointBefore(2)));
		System.out.println("compareTo() -> "+(str.compareTo(str1)));
		System.out.println("compareToIgnoreCase() -> "+(str.compareToIgnoreCase(str1)));
		System.out.println("concat() -> "+(str.concat(str1)));
		System.out.println("contains() -> "+(str.contains("art")));
		System.out.println("toUpperCase() -> "+(str.toUpperCase()));
		System.out.println("toLowerCase() -> "+(str1.toLowerCase()));
		System.out.println("replace() -> "+(str1.replace('A','a')));
		System.out.println("trim() -> "+(str.trim()));
	}
}
