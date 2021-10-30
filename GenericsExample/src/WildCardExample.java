import java.util.Arrays;
import java.util.List;

public class WildCardExample {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		List<Double> list2 = Arrays.asList(2.1, 3.1, 4.1, 5.1);

		print(list1);
		print(list2);
	}

	private static void print(List<? extends Number> list2) {

		System.out.println(list2);

	}

}
