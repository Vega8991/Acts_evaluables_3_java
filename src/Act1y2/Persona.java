package Act1y2;

public class Persona {
	
	//Act1: declaramos los atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private int anyo_nacimiento;
	//Act2: Anadimos  pais de origen y genero
	private String pais;
	private char genero;
	
	//Act1: Hacemos el constructor para el objeto
	//Act2: anadimos pais y genero
	public Persona(String nombre, String apellidos, String dni, int anyo_nacimiento, String pais, char genero) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anyo_nacimiento = anyo_nacimiento;	
		this.pais = pais;
		this.genero = genero;
		imprimirXPantalla();
	}
	
	//Act1: Creamos el metodo para imprimir por pantalla los datos
	//Act2: Anadimos un syso de pais y otro de genero
	public void imprimirXPantalla() {

		System.out.println("--------------------------");
		System.out.println("Persona");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);
		System.out.println("Anyo de nacimiento: " + anyo_nacimiento);
		System.out.println("Pais de origen: " + pais);
		System.out.println("Genero: " + genero);
		System.out.println("--------------------------");
	}
}
