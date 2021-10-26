import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ABC");
		map.put(2, "DEF");
		map.put(3, "ABC");
		map.put(4, "HJHJK");
		map.put(5, "qwerty");

		System.out.println(map);
		System.out.println(map.get(4));

		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + " " + data.getValue());
		}

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("ABC");
		student.setStudentMobileNum("1234567890");

		Student student1 = new Student();
		student1.setStudentId(2);
		student1.setStudentName("ABCDE");
		student1.setStudentMobileNum("12345678");

		Map<Integer, Student> mapdata = new HashMap<>();
		mapdata.put(1, student);
		mapdata.put(2, student1);

		System.out.println(mapdata);
	}
}
