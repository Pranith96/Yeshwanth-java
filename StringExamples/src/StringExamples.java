
public class StringExamples {

	public static void main(String[] args) {

		String s = "Hi"; ///6789j
		String s1 = "Hi";
		String s3 = new String("HI");
		s.concat("Hello");
		System.out.println(s);
		s.toLowerCase();
		s.toUpperCase();
		if (s == s1) {
			System.out.println("123456");
		} else {
			System.out.println("1234");
		}
		
		if (s == s3) {
			System.out.println("qwerty");
		} else {
			System.out.println("asdfg");
		}
		
		if (s.equalsIgnoreCase(s3)) {
			System.out.println("qwerty");
		} else {
			System.out.println("asdfg");
		}
		
		if (s.equals(s3)) {
			System.out.println("qwerty");
		} else {
			System.out.println("asdfg");
		}
		
		s.toCharArray();
		s.charAt(0);
	}

}
