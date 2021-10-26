import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String args[]) {
		Set<Integer> set = new LinkedHashSet<>();
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
