import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		/* Crea un objeto del tipo Alumno donde se almacene su nombre, sus 2 apellidos
		y su nota media. 
		Serializa el alumno en un array de bytes (byte[]) y muestra el resultado por pantalla.
		Deserializa un alumno serializado y muestra el resultado por pantalla.
		*/
		// Creamos un objeto alumno e introducimos por código los datos.
		Alumno a = new Alumno("Daniel", "Resúa", 9.5f);
		try {
			//Creamos el Array de Bytes y el Stream para el mismo y lo serializamos todo.
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(baos);
			dos.writeUTF(a.getName());
			dos.writeUTF(a.getSurname());
			dos.writeFloat(a.getAverage());
			dos.close();
			baos.close();
			byte [] datos = baos.toByteArray();
			
			//Creamos un Alumno vacío donde recuperar los datos al deserealizar
			Alumno b = new Alumno();
			ByteArrayInputStream bais = new ByteArrayInputStream(datos);
			DataInputStream dis = new DataInputStream(bais);
			b.setName(dis.readUTF());
			b.setSurname(dis.readUTF());
			b.setAverage(dis.readFloat());
			
			//Comprobamos que ese a ese nuevo alumno se le han insertado los datos correctamente.
			System.out.println(b.toString());

		} catch(IOException ioe) {
			System.out.println("An IO Error has found");
		}
	}
}
