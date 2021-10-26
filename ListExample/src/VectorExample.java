import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> list1 = new Vector<>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(2);
		list1.add(1);
		list1.add(2);

		System.out.println(list1);

		System.out.println(list1.get(5));

		System.out.println(list1.remove(5));
		System.out.println(list1);
		System.out.println(list1.size());

		for (Integer i : list1) {
			System.out.println(i);
		}
	}

}
