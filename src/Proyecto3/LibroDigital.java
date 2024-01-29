package Proyecto3;

/**
 * Creacion de la clase LibroDigital (hija) que extiende a la clase padre (libro)
 */
public class LibroDigital extends Libro{
    // Atributos
    private int copiasTotales;
    private int copiasEnUso;

    // Constructor con parametros de la clase LibroDigital y el super para llamar al constructor de la clase padre
    public LibroDigital(String titulo, String autor, int yearPublication, int copiasTotales){
        super(titulo,autor,yearPublication);
        this.copiasTotales = copiasTotales;
        this.copiasEnUso = 0;
    }
    // Metodo prestar para saber si hay copias del libro o no
    public void prestar(){
        if (copiasEnUso < copiasTotales){
            // sobreescritura de metodo
            super.prestar();
            // incrementa las copias en 1
            copiasEnUso++;
        } else {
            System.out.println("No hay copias disponible del libro " + getTitulo());
        }
    }
    // Metodo devolver para la devolucion de copias
    public void devolver(){
        if (copiasEnUso > 0){
            // sobreescritura de metodo para imprimir que se ha devuelto el libro
            super.devolver();
            // decrementa las copias en 1
            copiasEnUso--;
        } else {
            System.out.println("No hay ninguna copias que devolver");
        }
    }

    // Metodo booleano que retorna true o false. Si es true entonces esta prestado de lo contrario no esta prestado
    @Override
    public boolean estaPrestado() {
        return copiasEnUso>=copiasTotales;
    }
}
