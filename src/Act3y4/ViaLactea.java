package Act3y4;

public class ViaLactea {

    // Marcamos los atributos
    protected String nombre = null;
    protected double masa = 0.0;
    protected double volumen = 0.0;
    protected int km = 0;
    protected boolean observable = false;
    protected Elemento tipo;
    protected boolean exterior = false;

    // Hacemos el enum de Elemento
    public enum Elemento {
        LIQUIDO, TERRESTRE, GASEOSO
    }

    // Creamos el constructor
    public ViaLactea(String nombre, double masa, double volumen, int km, boolean observable, Elemento tipo, boolean exterior) {
        this.nombre = nombre;
        this.masa = masa;
        this.volumen = volumen;
        this.km = km;
        this.observable = observable;
        this.tipo = tipo;
        this.exterior = exterior;
    }

    // Hacemos un método para imprimir
    public void imprimir() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Km: " + km);
        System.out.println("Observable: " + observable);
        System.out.println("Elemento: " + tipo);
        System.out.println("Fuera de la Vía Láctea: " + exterior);
        System.out.println("---------------------------------------");
    }

    // Método para calcular la densidad
    public double calculoDensidad() {
        if (volumen == 0) {
            System.out.println("El volumen es 0, no se puede calcular la densidad.");
            return 0;
        }
        return masa / volumen;
    }

    // Método para verificar si es interior
    public void extoint() {
        if (observable == false) { // Si no es exterior, es interior
            exterior = true;
        } else {
            exterior = false;
        }
    }
}
