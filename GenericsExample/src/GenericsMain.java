
public class GenericsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericsExample2<Integer> data = new GenericsExample2<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);

		System.out.println(data);

		System.out.println(data.get());

		GenericsExample2<String> dataString = new GenericsExample2<String>();
		dataString.add("1");
		dataString.add("2");
		dataString.add("3");
		dataString.add("4");
		System.out.println(dataString);
		System.out.println(dataString.get());

	}

}
