package labbook;

import java.util.Scanner;

public class Oddoreven {
	public static void main(String[] args) {
		int num;
		System.out.println("ENTER AN INTEGER");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
			System.out.println("ENTERED NUMBER IS EVEN");
		else
			System.out.println("ENTERED NUMBER IS ODD");
	}
}
