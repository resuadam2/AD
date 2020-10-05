import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathFile = ".\\Hello.txt";
		File file = new File(pathFile);
		try {
			BufferedWriter bw = null;
			if(file.exists()) {
			   System.out.println("The File \"Hello.txt\" already exists.");
	        } else {
	            bw = new BufferedWriter(new FileWriter(file));
	            System.out.println("The File \"Hello.txt\"  was created.");
	            for(int i = 0; i < 6; i++){
	            	bw.write("Hello File!\n");
	            }
	            bw.close();
	        }
		}catch(IOException e){
			System.out.println("IOException detected.");
		}
	}

}
