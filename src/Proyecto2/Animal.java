package Proyecto2;

/**
 * Creacion de clase Animal abstracta
 */
public abstract class Animal {

    // Atributos
    private String nombre;
    private int edad;
    private double peso;

    // Constructor con parametros
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters para poder llamarlos en la main
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    // Metodos de la clase Animal, que se podra imprimir en la main con el objeto de perro y gato (polimorfismo)
    public void comer() {
        System.out.println(nombre + " Esta Comiendo");
    }

    public void dormir() {
        System.out.println(nombre + " Esta Durmiendo");
    }
    public abstract void hacerRuido();
}
