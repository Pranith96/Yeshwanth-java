import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		String content = "hello Welcome java..!!";

		FileWriter fileWriter = new FileWriter("C:\\Users\\ramannpr\\support_works\\Yashwanth-java\\temp.txt");

		fileWriter.write(content);
		fileWriter.close();

		PrintWriter printwriter = new PrintWriter(fileWriter);
		printwriter.print(content);
		printwriter.printf("Welcome hi is %s", "Java files");
		printwriter.close();
		System.out.println(printwriter);
	}

}
