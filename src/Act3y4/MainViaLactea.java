   package Act3y4;

import Act3y4.ViaLactea.Elemento;

public class MainViaLactea {
	public static void main(String[] args) {
        // Crear cuatro elementos de la Vía Láctea
		ViaLactea elemento1 = new ViaLactea("Estrella 6", 1.99e30, 1.1e18, 1392000, true, Elemento.GASEOSO, false);
		ViaLactea elemento2 = new ViaLactea("Planeta Z", 5.97e24, 1.08e12, 12742, true, Elemento.TERRESTRE, false);
		ViaLactea elemento3 = new ViaLactea("Luna X", 7.35e22, 2.19e10, 3474, true, Elemento.TERRESTRE, false);
		ViaLactea elemento4 = new ViaLactea("Cometa 4", 1.0e12, 4.19e8, 10, false, Elemento.LIQUIDO, true);

        // Imprimir los valores de sus atributos
        elemento1.imprimir();
        elemento2.imprimir();
        elemento3.imprimir();
        elemento4.imprimir();

        // Calcular la densidad de cada elemento
        System.out.println("\nDensidades:");
        System.out.println("Densidad de " + elemento1.nombre + ": " + elemento1.calculoDensidad());
        System.out.println("Densidad de " + elemento2.nombre + ": " + elemento2.calculoDensidad());
        System.out.println("Densidad de " + elemento3.nombre + ": " + elemento3.calculoDensidad());
        System.out.println("Densidad de " + elemento4.nombre + ": " + elemento4.calculoDensidad());

        // Verificar si los elementos son interiores o exteriores usando el método extoint
        System.out.println("\n¿Son exteriores a la Vía Láctea?");
        elemento1.extoint();
        System.out.println(elemento1.nombre + " es exterior: " + elemento1.exterior);

        elemento2.extoint();
        System.out.println(elemento2.nombre + " es exterior: " + elemento2.exterior);

        elemento3.extoint();
        System.out.println(elemento3.nombre + " es exterior: " + elemento3.exterior);

        elemento4.extoint();
        System.out.println(elemento4.nombre + " es exterior: " + elemento4.exterior);
    }
}

