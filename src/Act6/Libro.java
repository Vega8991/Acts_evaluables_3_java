package Act6;

public class Libro {
    
    //Atributos
    private String nombre;
    private String escritor;
    private Genero genero; // Tipo enumerado
    private int paginas;
    private int anio; // Cambiado "ñ" por "n"
    private double calificacion;

    //enum para el género del libro
    enum Genero {
        HISTORIA, COMEDIA, NOVELA, TERROR
    }

    //constructor
    public Libro(String nombre, String escritor, Genero genero, int paginas, int anio, double calificacion) {
        this.nombre = nombre;
        this.escritor = escritor;
        this.genero = genero;
        this.paginas = paginas;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getEscritor() {
        return escritor;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getAnio() {
        return anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    //metodo para imprimir los atributos del libro
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Escritor: " + escritor);
        System.out.println("Genero: " + genero);
        System.out.println("Paginas: " + paginas);
        System.out.println("Anio: " + anio);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("--------------------");
    }

    //indica si el libro tiene menos de 50 páginas
    private boolean esLibroListo() {
        return paginas < 50;
    }

    //calcular la valoración del libro
    private String calcularValoracion() {
        if (calificacion <= 3) {
            return "Muy malo";
        } else if (calificacion <= 5) {
            return "Malo";
        } else if (calificacion <= 6) {
            return "Regular";
        } else if (calificacion <= 8) {
            return "Bueno";
        } else {
            return "Excelente";
        }
    }

    //comparar si dos libros son similares
    private boolean esLibroSimilar(Libro otroLibro) {
        return this.genero == otroLibro.genero && this.calcularValoracion().equals(otroLibro.calcularValoracion());
    }

    //main para probar la clase
    public static void main(String[] args) {
        // Crear tres libros
        Libro libro1 = new Libro("Libro 1", "Autor 1", Genero.HISTORIA, 45, 1995, 7.5);
        Libro libro2 = new Libro("Libro 2", "Autor 2", Genero.NOVELA, 200, 2005, 8.9);
        Libro libro3 = new Libro("Libro 3", "Autor 3", Genero.HISTORIA, 60, 2010, 5.0);

        //Imprimir información de los libros
        libro1.imprimir();
        libro2.imprimir();
        libro3.imprimir();

        //verificar si los libros son "listos"
        System.out.println("\nLibro 1 tiene menos de 50 paginas? " + libro1.esLibroListo());
        System.out.println("Libro 2 tiene menos de 50 paginas? " + libro2.esLibroListo());
        System.out.println("Libro 3 tiene menos de 50 paginas? " + libro3.esLibroListo());

        //Calcular la valoración de los libros
        System.out.println("\nValoracion de Libro 1: " + libro1.calcularValoracion());
        System.out.println("Valoracion de Libro 2: " + libro2.calcularValoracion());
        System.out.println("Valoracion de Libro 3: " + libro3.calcularValoracion());

        //comparar si los libros son iguales
        System.out.println("\nLibro 1 y Libro 2 son similares? " + libro1.esLibroSimilar(libro2));
        System.out.println("Libro 1 y Libro 3 son similares? " + libro1.esLibroSimilar(libro3));
    }
}