package Proyecto2;

/**
 * Creacion de la clase Perro (clase hija) que extiende a la clase Animal (clase padre)
 */
public class Perro extends Animal {

    // Constructor con parametros y el super para la llamada al constructor de la clase padre
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }

    // Metodo hacerRuido con el resultado de la misma clase (perro). Aplica polimorfismo.
    @Override
    public void hacerRuido() {
        System.out.println("El Perro Hace Guau!");
    }

}
