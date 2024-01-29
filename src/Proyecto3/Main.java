package Proyecto3;

/**
 * Creacion de la clase main
 * Probar los 4 fundamentos de java orientado a objetos (encapsulamiento,herencia,abstraccion y polimorfismo)
 */
public class Main {

    public static void main(String[] args) {
            // Creacion de objetos con parametros para los constructores de la clase LibroFisico y LibroDigital
            LibroFisico libroFisico = new LibroFisico("1984", "George Orwell", 1949);
            LibroDigital libroDigital = new LibroDigital("El gran diseño", "Stephen Hawking", 2010, 3);

            // Mostrar mensaje si el libro fisico esta prestado.
            System.out.println("¿El libro físico está prestado? " + libroFisico.estaPrestado()); // False
            // Llamar al metodo prestar con el objeto de libroFisico
            libroFisico.prestar();
            System.out.println("¿El libro físico está prestado? " + libroFisico.estaPrestado()); // True
            // llamar el metodo devolver del objeto libroFisico para la devolucion del libro
            libroFisico.devolver();
            // Mostrar mensaje si el libro fisico esta prestado.
            System.out.println("¿El libro físico está prestado? " + libroFisico.estaPrestado()); // False

        // Salto de Linea
        System.out.println("\n");

            // Mostrar mensaje si el libro digital esta prestado.
            System.out.println("¿El libro digital está prestado? " + libroDigital.estaPrestado()); //false
            // Llamar al metodo prestar con el objeto de libroDigital incrementa +1
            libroDigital.prestar();
            System.out.println("¿El libro digital está prestado? " + libroDigital.estaPrestado()); //false
            libroDigital.prestar(); // incrementa +2
            System.out.println("¿El libro digital está prestado? " + libroDigital.estaPrestado()); //false
            libroDigital.prestar(); // incrementa +3.
            System.out.println("¿El libro digital está prestado? " + libroDigital.estaPrestado()); //true
            // Imprime el mensaje de que no hay copias disponibles porque 3 < 3 falso
            libroDigital.prestar();

        // Salto de linea
        System.out.println("\n");

            // Llamar al metodo devolver del objeto libroDigital para la devolucion de un libro
            libroDigital.devolver(); // -1
            // Mostrar mensaje si el libro digital esta prestado.
            System.out.println("¿El libro digital está prestado? " + libroDigital.estaPrestado()); // false porque hemos decrementado -1, entonces 2>=3 false.
            libroDigital.prestar(); // hemos prestado el libro digital de nuevo. +1
            System.out.println("¿El libro digital está prestado? " + libroDigital.estaPrestado()); // 3 >= 3 true. Esta prestado
            libroDigital.prestar(); // imprime que no hay copoas disponibles para el libro
        }

}
