
public class AutoBoxingExample {

	public static void main(String[] args) {

		int i = 10;
		
		Integer i1 = Integer.valueOf(i); // explicit conversion
		Integer i2 = i; // implicit conversion using autoboxing by JVM
		
		System.out.println(i1+ " " +i2);
	}

}
