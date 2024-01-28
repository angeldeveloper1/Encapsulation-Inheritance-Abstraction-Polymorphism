package Proyecto1;

/**
 * Creacion de la clase SmartWatch (clase hija) que extiende a la clase padre SmartDevice
 */
public class SmartWatch extends SmartDevice {

    // Creacion de los atributos encapsulados
    boolean resistenciaAgua;

    // Creacion del constructor sin parametros
    public SmartWatch() {
    }

    // Usando el constructor de la superclase SmartDevice Anadiendo los atributos adicionales

    public SmartWatch(String marca, String modelo, String tamano, int year, boolean resistenciaAgua) {
        super(marca, modelo, tamano, year);
        this.resistenciaAgua = resistenciaAgua;
    }

    // Creacion de metodo para imprimir mensaje titulo
    public void visualizarFunciones(){
        System.out.println("Visualización de funciones de SmartWatch");
    }
}
