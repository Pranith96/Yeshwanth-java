
public class MainExample {

	public static void main(String[] args) throws CustomRunTimeExceptionExample{

		int a = 10;
		
		int b = 0;
		
		if(a>b) {
			throw new CustomRunTimeExceptionExample("data in correct");
		}

	}

}
