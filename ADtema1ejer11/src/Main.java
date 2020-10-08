import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		/*
		Escribe un fichero de configuración en el escritorio que almacene las siguientes 
		propiedades:
			url = http://google.com
			port = 80
			secure = true
		Debes poder obtener estas propiedades del fichero e imprimir por pantalla el resultado.
		 */
		String path = "C:\\Users\\daniel\\Desktop\\config.props";
		File file = new File(path);
		try {
			BufferedWriter bw = null;
	        bw = new BufferedWriter(new FileWriter(file));
	        System.out.println("The File was created.");
	        bw.close();
		}catch(IOException e){
			System.out.println("IOException detected.");
		}
		Properties prop = new Properties();
		prop.setProperty("url", "https://www.google.com");
		prop.setProperty("port", "80");
		prop.setProperty("secure", "true");
		try{
			prop.store(new FileOutputStream("config.props"), "Config File");
			prop.store(new FileWriter(path), "File Readable");
		} catch (FileNotFoundException fnfe){
			System.out.print("File could not be found");
		} catch (IOException ioe) {
			System.out.println("An IO Error has foudn");
		}
		
		//Ahora leeremos lo creado para comprobar
		
		Properties input = new Properties();
		Properties read = new Properties();
		try{
			//Primero leemos del Stream
			input.load(new FileInputStream("config.props"));
			String url = input.getProperty("url");
			String port = input.getProperty("port");
			boolean secure = Boolean.valueOf(input.getProperty("secure"));	
			System.out.println("Props Values are: \n"
					+ "Url: " + url + "\n"
					+ "Port: " + port + "\n"
					+ "Secure: " + secure);
			//Ahora las leeremos del archivo creado
			read.load(new FileReader(path));
			String url2 = input.getProperty("url");
			String port2 = input.getProperty("port");
			boolean secure2 = Boolean.valueOf(input.getProperty("secure"));	
			System.out.println("Props Values in file are: \n"
					+ "Url: " + url2 + "\n"
					+ "Port: " + port2 + "\n"
					+ "Secure: " + secure2);
		} catch (FileNotFoundException fnfe){
			System.out.print("File could not be found");
		} catch (IOException ioe) {
			System.out.println("An IO Error has foudn");
		}
	}

}
