package Act5;

public class Coche {
	private String marca;
	private String modelo;
	private double motor;
	protected combustible tipo;
	protected automovil tipos;
	private int puertas;
	private int asientos;
	private static int velMax = 120;
	private color colores;
	private int velactual;
	
	protected enum combustible {
		GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GASNATURAL
	}
	
	protected enum automovil {
		BERLINA, COMPACTO, FAMILIAR, ADVANCE, SUV
	}
	
	protected enum color {
		BLANCO, NEGRO, ROSA, ROJO, AMARILLO, VERDE, AZUL, GRIS
	}
	
	public Coche(String marca, String modelo, double motor, combustible tipo, automovil tipos, int puertas, int asientos, color colores, int velactual) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.tipo = tipo;
		this.tipos = tipos;
		this.puertas = puertas;
		this.asientos = asientos;
		this.colores = colores;
		this.velactual = velactual;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public combustible getTipo() {
		return tipo;
	}

	public void setTipo(combustible tipo) {
		this.tipo = tipo;
	}

	public automovil getTipos() {
		return tipos;
	}

	public void setTipos(automovil tipos) {
		this.tipos = tipos;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public color getColores() {
		return colores;
	}

	public void setColores(color colores) {
		this.colores = colores;
	}

	public int getVelactual() {
		return velactual;
	}

	public void setVelactual(int velactual) {
		this.velactual = velactual;
	}
	
	public void acelerar(int incremento) {
	    if (velactual + incremento > velMax) {
	        System.out.println("Velocidad máxima permitida alcanzada.");
	    } else {
	        velactual += incremento;
	        System.out.println("Velocidad incrementada. Velocidad actual: " + velactual);
	    }
	}

	public void desacelerar(int decremento) {
	    if (velactual - decremento < 0) {
	        System.out.println("No puedes ir a menor velocidad de 0 km/h.");
	    } else {
	        velactual -= decremento;
	        System.out.println("Velocidad reducida. Velocidad actual: " + velactual);
	    }
	}

	public void frenar() {
	    velactual = 0;
	    System.out.println("Vehiculo frenado. Velocidad actual: " + velactual);
	}

	public void calcTiempo (int distancia) {
		int tiempoEstimado = distancia / velactual;
		System.out.println("El tiempo estimado es de: " + tiempoEstimado + " Horas.");
	}
	
	public void imprimir() {

		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Motor: " + motor);
		System.out.println("Tipo de combusible: " + tipo);
		System.out.println("Tipo de vehiculo: " + tipos);
		System.out.println("Numero de puertas: " + puertas);
		System.out.println("Numero de asientos: " + asientos);
		System.out.println("Color: " + colores);
		System.out.println("Velocidad actual: " + velactual);
		System.out.println("---------------------------------");
	}
}
