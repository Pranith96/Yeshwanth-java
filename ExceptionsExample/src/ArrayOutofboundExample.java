import java.util.Arrays;

public class ArrayOutofboundExample {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,50};
		System.out.println(Arrays.toString(a));
	
		try {
		int b[] = new int[4];
		b[0] = 1;
		b[1] =2;
		b[2] =3;
		b[3]=4;
		b[4] = 5;
		System.out.println(Arrays.toString(b));
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Gebjbvjgg");
	}

}
