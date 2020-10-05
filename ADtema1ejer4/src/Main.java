import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		String path = ".\\Data";
		File dir = new File(path);
		boolean created = false;
		
		String path2 = ".\\Data\\users";
		File dir2 = new File(path2);
		boolean created2 = false;
		
		if(dir.exists() || dir2.exists()){
			System.out.println("The directory " + path + " already exists.");
		} else {
			created = dir.mkdir();
			created2 = dir2.mkdir();
		}
		
		if(created && created2){
			System.out.println("The directories " + path + " and "
					+ path2 + " has been created succesfully. ");
		} else {
			System.out.println("Not all directories could be created.");
		}
		String pathFile = ".\\Data\\users\\user1.txt";
		File file = new File(pathFile);
		try {
			BufferedWriter bw = null;
			if(file.exists()) {
			   System.out.println("The File \"user1.txt\" already exists.");
	        } else {
	            bw = new BufferedWriter(new FileWriter(file));
	            System.out.println("The File \"user1.txt\"  was created.");
	            bw.close();
	        }
		}catch(IOException e){
			System.out.println("IOException detected.");
		}
		//7/03/2017 18:33:00
		String myDate = "2017/03/07 18:33:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = sdf.parse(myDate);
		long ms = date.getTime();
		boolean change = file.setLastModified(ms);
		if (change) {
			System.out.println("Edit time changed.");
		} else {
			System.out.println("Edit time could not be changed.");
		}
	}
}
