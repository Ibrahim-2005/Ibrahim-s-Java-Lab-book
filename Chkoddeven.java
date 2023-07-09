package labbook;

import java.util.Scanner;

public class Chkoddeven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER A NUMBER:");
		int num=s.nextInt();
		if (num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	}
}
