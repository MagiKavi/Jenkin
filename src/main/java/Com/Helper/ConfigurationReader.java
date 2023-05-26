package Com.Helper;

import java.io.IOException;

public class ConfigurationReader {
	
	private ConfigurationReader() {
	}
	public static Com.Helper.FileReaderManager FileReaderManager() throws IOException {
		
	FileReaderManager frm = new FileReaderManager();
	return frm;
	}
}
