import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutAndInputStreamExample {

	public static void main(String[] args) throws IOException {

		String content = "hello Welcome java..!!";

		File file = new File("C:\\Users\\ramannpr\\support_works\\Yashwanth-java\\temp4.txt");

		FileOutputStream outPutStream = new FileOutputStream(file);

		byte[] data = content.getBytes();
		outPutStream.write(data);
		outPutStream.close();

		FileInputStream inputStream = new FileInputStream(file);
		int i = 0;
		while ((i = inputStream.read()) != -1) {
			System.out.print((char) i);
		}
		inputStream.close();
	}
}