package FileExists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Does_File_Exists {

	static String Apple;
	static String Table;
	static String Orange;
	static String location;
	static Properties prop;
	static Path path;

	public static void main(String[] args) throws IOException {

		location = "src/data/data.properties";
		path = Paths.get(location);
		if (Files.exists(path)) {
			// call the method
			doesFileExists(location);
			System.out.println("file exists at the path location " + Files.exists(path));
			System.out.println(path);
			int i;
			String[] table = Table.split(",");
			System.out.print("\nword is Table\n");
			for (i = 0; i < table.length; i++) {

				System.out.println("Meaning  is\t " + table[i]);
				// System.out.println(table[1]);

			}
			String[] apple = Apple.split(",");
			System.out.print("\nword is Apple\n");
			for (i = 0; i < apple.length; i++) {
				System.out.println("Meaning  is\t " + apple[i]);
			}
			System.out.print("\nword is Orange\n");
			System.out.println("Meaning  is\t " + Orange);
		}
	}

	public static void doesFileExists(String fileLocation) throws IOException {

		File file = new File(location);
		prop = new Properties();

		try {
			FileInputStream fs = new FileInputStream(file);
			prop.load(fs);
			Apple = prop.getProperty("Apple");
			Orange = prop.getProperty("Orange");
			Table = prop.getProperty("Table");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
