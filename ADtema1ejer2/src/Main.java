import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createDirectories();
	}
	
	public static void createDirectories(){
		String path = ".\\Data";
		File dir = new File(path);
		boolean created = false;
		
		String path1 = ".\\Data\\img";
		File dir1 = new File(path1);
		boolean created1 = false;
		
		String path2 = ".\\Data\\users";
		File dir2 = new File(path2);
		boolean created2 = false;
		
		if(dir.exists() || dir2.exists() || dir1.exists()){
			System.out.println("The directory " + path + " already exists.");
		} else {
			//Crea un directorio
			created = dir.mkdir();
			created1 = dir1.mkdir();
			created2 = dir2.mkdir();
		}
		
		if(created && created1 && created2){
			System.out.println("The directories " + path + 
					" and " + path1 + " and "
					+ path2 + " has been created succesfully. ");
		} else {
			System.out.println("Not all directories could be created");
		}
	}
}
