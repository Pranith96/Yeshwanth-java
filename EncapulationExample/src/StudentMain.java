
public class StudentMain {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setAddressId(1);
		address.setCity("hyd");
		address.setPlotNo("10");
		address.setStreetno("19");
		
		College college = new College();
		college.setCollegeId(1);
		college.setCollegeName("qwerty");
		college.setAddress(address);

		Student s = new Student();
		s.setStudentId(1);
		s.setStudentMobileNum("123456789");
		s.setStudentName("ABC");
		s.setCollege(college);
		
		
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentMobileNum());
		
		Student s1 = new Student();
		s1.setStudentId(2);
		s1.setStudentMobileNum("1234567890");
		s1.setStudentName("ABCD");
		s1.setCollege(college);
		
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentMobileNum());
		
		System.out.println(s1);

	}
}
