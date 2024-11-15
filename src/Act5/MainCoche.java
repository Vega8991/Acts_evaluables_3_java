package Act5;

import Act5.Coche.combustible;
import Act5.Coche.color;
import Act5.Coche.automovil;

public class MainCoche {

	public static void main(String[] args) {

	Coche coche = new Coche ("Audi", "A4", 1.9, combustible.GASOLINA, automovil.BERLINA, 4, 5, color.NEGRO, 90);
	
	coche.imprimir();
	coche.acelerar(30);
	//coche.desacelerar(30);
	//coche.frenar();
	//coche.acelerar(121);
	//coche.desacelerar(122);
	coche.calcTiempo(120);
	}
}
