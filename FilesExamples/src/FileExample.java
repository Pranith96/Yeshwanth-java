import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------create files-----------------");

		File file = new File("C:\\Users\\ramannpr\\support_works\\Yashwanth-java\\temp.txt");

		boolean response;

		try {
			response = file.createNewFile();
			if (response) {
				System.out.println("file created" + file.getCanonicalPath());
			} else {
				System.out.println("File already created" + file.getCanonicalPath());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("------------------------create files-----------------");

		Path path = Paths.get("C:\\Users\\ramannpr\\support_works\\Yashwanth-java\\temp2.txt");

		try {
			Path filepath = Files.createFile(path);
			System.out.println("files created at path: " + filepath);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("------------------------delete files-----------------");

		try {
			File deleteFile = new File("C:\\Users\\ramannpr\\support_works\\Yashwanth-java\\temp1.txt");

			if (deleteFile.delete()) {
				System.out.println(deleteFile.getName() + "Deleted successfully");
			} else {
				System.out.println("Failed to delete");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
