package readPropertyData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertiesFile {
	public static void main(String[]args) throws IOException {
		//step1 
		 File f=new File("./testData/config.properties");
		 FileInputStream fis = new FileInputStream(f);
		 
		 //step2
		 Properties prop = new Properties();
		 
		 //step3
		 prop.load(fis);
		 
		 //step4
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(email);
		System.out.println(password);
	}

}
