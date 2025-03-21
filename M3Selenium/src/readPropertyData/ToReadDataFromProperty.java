package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
	//To specify the location of the file
	FileInputStream fis = new FileInputStream("./testdata/config.properties");
	
	//To make the file ready to read
     Properties prop = new Properties();
     prop.load(fis);
     
     //To read the data from property file
     String data = prop.getProperty("url");
     System.out.println(data);

	}

}
