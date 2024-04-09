package Tema10;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class VegetableProperties {
	
	public void writePropertiesFile() {
	
		try(OutputStream outputStream = new FileOutputStream("vegetables.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty("ardei capia", "26"); 
			propFile.setProperty("broccoli", "34");
			propFile.setProperty("cartofi dulci", "86");
			propFile.setProperty("ceapa", "42");
			propFile.setProperty("mazare", "42");
			propFile.store(outputStream, "Am salvat fisierul");
			
		}catch(IOException e){
			System.out.println("Nu am putut salva fisierul!");
			e.printStackTrace();
		}
	}
	
	public String readPropertiesFile(String leguma) {
		
		try(InputStream inputStream = new FileInputStream("vegetables.properties")) {
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			 return propFile.getProperty(leguma);
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
			return null;
		}
	}
	
	public void updatePropertiesFile(String leguma, String value){
		
		Properties propFile = new Properties();
		
		try(InputStream inputStream = new FileInputStream("vegetables.properties")) {
			propFile.load(inputStream);
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
		
		
		try(OutputStream outputStream = new FileOutputStream("vegetables.properties")) {
			
			propFile.setProperty(leguma, value);
			propFile.store(outputStream, "Am updatat");
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
	}
	
}