package Proyecto3;

/**
 * Creacion de la clase Libro (abstracta)
 */
public abstract class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int yearPublication;

    // Constructor con parametros de la clase Libro
    public Libro (String titulo, String autor, int yearPublication){
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublication = yearPublication;
    }

    // Getter para poder llamar el atributo titulo en otras clases
    public String getTitulo(){
        return titulo;
    }
    // Metodos prestar y devolver para usarlo si los libros estan prestados o ha sido devuelto.
    public void prestar(){
        System.out.println("El libro " +titulo +" ha sido prestado.");
    }
    public void devolver(){
        System.out.println("El libro " +titulo +" ha sido devuelto.");
    }
    // Metodo abstracto booleano para saber si un libro esta disponible. Si es true esta disponible, de lo contrario, no.
    public abstract boolean estaPrestado();
}
