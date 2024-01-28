package Proyecto1;

/**
 * Creacion de la clase SmartPhone (clase hija) que extiende a la clase padre SmartDevice
 */
public class SmartPhone extends SmartDevice {

    // Creacion de los atributos encapsulados
    String procesador;
    double gb;

    // Creacion del constructor sin parametros
    public SmartPhone() {
    }

    // Usando el constructor de la superclase SmartDevice Anadiendo los atributos adicionales

    public SmartPhone(String marca, String modelo, String tamano, int year, String procesador, double gb) {
        super(marca, modelo, tamano, year);
        this.procesador = procesador;
        this.gb = gb;
    }

    public void visualizarFunciones(){
        System.out.println("Visualización de funciones de SmartPhone");
    }

}
