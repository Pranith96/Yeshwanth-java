
public class Addition {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 10;
			int c = 0;

			int d = (a + b) / c;

			System.out.println(d);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("out");
		}
		System.out.println("Hello");
		System.out.println("World");

	}
}
