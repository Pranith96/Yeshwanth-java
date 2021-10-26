
public class UnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(10);
		int i2 = i1.intValue(); // explicit converting
		int i3 = i1;// implicit conversion using unboxing by JVM
		System.out.println(i2+ " " +i3);
		
		String s = i1.toString();

	}

}
