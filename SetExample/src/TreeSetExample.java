import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String args[]) {
		Set<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(2);
		System.out.println(set);
	}
}
