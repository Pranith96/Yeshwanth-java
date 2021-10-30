import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadDataFromFileExample {
	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\ramannpr\\support_works\\Yashwanth-java\\temp2.txt");

		String content = "Hi Welcome";
		try {
			Files.writeString(path, content);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			String readData = Files.readString(path);
			System.out.println(readData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
