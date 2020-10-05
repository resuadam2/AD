import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathFile = ".\\Productos.xml";
		File file = new File(pathFile);
		try {
			BufferedReader br = null;
			if(!file.exists()) {
			   System.out.println("The File " + pathFile + " does not exist.");
	        } else {
	            br = new BufferedReader(new FileReader(file));
	            String line;
	            while((line = br.readLine()) != null) {
	            	System.out.println(line);
	            }
	            br.close();
	        }
		} catch(IOException e) {
			System.out.println("IOException detected.");
		}
	}

}
