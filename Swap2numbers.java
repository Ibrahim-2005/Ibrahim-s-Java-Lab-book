package labbook;

public class Swap2numbers {
	public static void main(String[] args) {
		float first=2.50f;
		float second=4.50f;
		float temp;
		System.out.println("---BEFORE SWAPPING---");
		System.out.println("FIRST NUMBER= "+first);
		System.out.println("SECOND NUMBER= "+second);
		temp=first;
		first=second;
		second=temp;
		System.out.println("---AFTER SWAPPING---");
		System.out.println("FIRST NUMBER= "+first);
		System.out.println("SECOND NUMBER= "+second);
	}
}
