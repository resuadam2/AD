import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createDirectory();
	}
	
	public static void createDirectory(){
		String path = "C:\\Users\\daniel\\Desktop\\Prueba";
		File dir = new File(path);
		boolean created = false;
		
		if(dir.exists()){
			System.out.println("The directory " + path + " already exists.");
		} else {
			//Crea un directorio
			created = dir.mkdir();
		}
		
		if(created){
			System.out.println("The directory " + path + " has been created succesfully. ");
		} else {
			System.out.println("The directory could not be created");
		}
	}
}
