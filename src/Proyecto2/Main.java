package Proyecto2;

/**
 * Creacion de la clase main
 * objetos
 * y llamada de metodos
 */
public class Main {
    public static void main(String[] args) {
        // Creacion de objeto con parametros
        Perro chiwawa = new Perro("Toby", 13, 13.3);
        // Imprimiendo los datos del objeto chiwawa
        System.out.println(chiwawa.getNombre());
        System.out.println(chiwawa.getEdad());
        System.out.println(chiwawa.getPeso());
        // Llamando los metodos para imprimir los resultados (aplica polimorfismo)
        chiwawa.comer();
        chiwawa.dormir();
        chiwawa.hacerRuido();

        // Salto de linea
        System.out.println("\n");

        // Creacion de objeto con parametros
        Gato persa = new Gato("Mich", 6, 10.4);
        // Imprimiendo los datos del objeto persa
        System.out.println(persa.getNombre());
        System.out.println(persa.getEdad());
        System.out.println(persa.getPeso());
        // Llamando los metodos para imprimir los resultados (aplica polimorfismo)
        persa.comer();
        persa.dormir();
        persa.hacerRuido();
    }
}
