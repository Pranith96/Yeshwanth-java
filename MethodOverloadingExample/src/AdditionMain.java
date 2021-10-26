import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		Addition addition = new Addition();
		addition.add(a, b);
		addition.add(a, b, c);
		sc.close();
	}
}
