package Com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
	public static Properties p;
	public FileReaderManager() throws IOException {
		File f = new File("C:\\Users\\Kavidiya\\Desktop\\Flipkart_Project\\src\\main\\resources\\Amazon.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
		
		
		
	}
	public  String getEmail() {
		String email = p.getProperty("email");
		return email;
		
	}
}
