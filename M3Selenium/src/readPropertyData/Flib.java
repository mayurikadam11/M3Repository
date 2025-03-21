package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib {

		 public String readDataFromPropertyFile(String propPath,String Key) throws IOException {
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data=prop.getProperty(Key);
			return data;

	}

}
