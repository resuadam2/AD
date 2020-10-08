
public class Alumno {
	private String name, surname;
	private float average;
	
	public Alumno(String name, String surname, float average) {
		super();
		this.name = name;
		this.surname = surname;
		this.average = average;
	}
	
	public Alumno() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", surname=" + surname + ", average=" + average + "]";
	}
	
	
}
