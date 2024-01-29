package Proyecto3;

/**
 * Creacion de la clase LibroFisico (clase hija) extiende a la clase Libro (clase padre)
 */
public class LibroFisico extends Libro{
    // Atributo de la clase LibroFisico (encapsulado)
    private boolean prestado;

    // Constructor con parametros de la clase LibroFisico Y el super para la llamada del constructor de la clase padre (Libro)
    public LibroFisico(String titulo, String autor, int yearPublication){
        super(titulo,autor,yearPublication);
        this.prestado = false;
    }

    // Metodo para saber si el libro esta prestado. Si esta prestado es true, de lo contrario false.
    public void prestar(){
        super.prestar();
        this.prestado = true;
    }


    // Metodo para devolver el libro.
    public void devolver(){
        super.devolver();
        this.prestado = false;
    }
    // Metodo que retorna verdadero o falso y que se puede usar para saber el estado del libro (prestado o no)
    public boolean estaPrestado(){
        return prestado;
    }
}
