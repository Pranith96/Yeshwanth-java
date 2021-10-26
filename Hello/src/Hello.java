
public class Hello {
	
	public void hi() {
		int i = 10;
		System.out.println(i);
	}

	public static void main(String args[]) {
		System.out.println("Hello");
		Hello hello = new Hello();
		hello.hi();
		int k = Hello.print();
		
		System.out.println(k);
	}
	
	public static int print() {
		int j = 101;
		System.out.println(j);
		
		for(int i =0;i<10;i++) {
			
		}
		
		return j;
	}
	
	

	
}
