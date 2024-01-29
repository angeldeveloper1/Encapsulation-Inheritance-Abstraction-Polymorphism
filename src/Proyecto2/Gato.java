package Proyecto2;

public class Gato extends Animal {

    // Constructor con parametros y el super para la llamada al constructor de la clase padre
    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    // Metodo hacerRuido con el resultado de la misma clase (gato). Aplica polimorfismo.
    public void hacerRuido(){
        System.out.println("El Gato Hace Miau!");
    }

}
