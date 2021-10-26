import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);

		System.out.println(list);

		System.out.println(list.get(5));

		System.out.println(list.remove(5));
		System.out.println(list);
		System.out.println(list.size());

		for (Integer i : list) {
			System.out.println(i);
		}

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("ABC");
		student.setStudentMobileNum("1234567890");

		Student student1 = new Student();
		student1.setStudentId(2);
		student1.setStudentName("ABCDE");
		student1.setStudentMobileNum("12345678");

		List<Student> studentList = new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);

		System.out.println(studentList);

	}

}
