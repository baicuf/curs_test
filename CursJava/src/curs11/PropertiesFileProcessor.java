package curs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	//write properties file
	public void writePropertiesFile() {
//	public void writePropertiesFile(String key, String value) {
		
		// Try with resources - nu mai este nevoie de utiliza close (outputStream.close();)
//		try(OutputStream outputStream = new FileOutputStream("test.properties")) {
//			
//		}catch() {}
		
		try {
			OutputStream outputStream = new FileOutputStream("test.properties");
			
			Properties propFile = new Properties();
			propFile.setProperty("hostname", "123456"); //hostname=123456
			propFile.setProperty("port", "8080");
			propFile.setProperty("username", "Test");
			propFile.setProperty("password", "test123");
			propFile.setProperty("browser", "Chrome");
			propFile.store(outputStream, "Am salvat fisierul");
			
			outputStream.close();
			
		}catch(IOException e){
			System.out.println("Nu am putut salva fisierul!");
			e.printStackTrace();
		}
	}
	
	//write properties file
	public void readProoertiesFile(String key) {
		
		try(InputStream inputStream = new FileInputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.getProperty(key));
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
		
	//write properties file
	public void updatePropertiesFile(key, String value){
		
//		try(InputStream inputStream = new FileInputStream("test.properties")) {
//			
//			Properties propFile = new Properties();
//			propFile.load(inputStream);
//			
//		}catch(IOException e) {
//			System.out.println("Nu am putut citi fisierul!");
//			e.printStackTrace();
//		}
		
		try(OutputStream outputStream = new FileOutputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty(key, value);
			propFile.store(outputStream, value);
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
	}
	}


}
