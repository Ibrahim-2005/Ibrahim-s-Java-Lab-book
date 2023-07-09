package labbook;

import java.util.Scanner;

public class Asciivalue
{
	public static void main(String args []) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		ch=sc.next().charAt(0);
		int ascii = ch;
		int castAscii = (int)ch;
		System.out.println("The ASCII value of "+ch+" is "+ascii);
		System.out.println("The ASCII value of "+ch+" is "+castAscii);
	}
}