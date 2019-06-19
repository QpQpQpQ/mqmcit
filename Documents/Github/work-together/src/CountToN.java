import java.util.Scanner;

public class CountToN {
	public static int n;

	public CountToN(int Number) {
		n = Number;

	}

public static void main(String[] args) {
	System.out.println("Please enter a value for n: ");
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	for(int i = 1; i <= n; i++) {
		System.out.println(i);
	}
}
}
