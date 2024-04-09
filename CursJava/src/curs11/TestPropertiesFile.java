package curs11;

public class TestPropertiesFile {

	public static void main(String[] args) {
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
//		obj.writePropertiesFile();
		obj.readProoertiesFile("hostname");
		obj.readProoertiesFile("username");
		obj.readProoertiesFile("browser");
		
		System.out.println("-------------------");
		obj.updatePropertiesFile("hostname", "my.server.com");
		obj.readProoertiesFile("username");
	}

}
