import java.util.ArrayList;
import java.util.List;

public class GenericsExample1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		List list1 = new ArrayList();
		list1.add(1);
		list1.add("10");

		System.out.println(list1);

	}

}
