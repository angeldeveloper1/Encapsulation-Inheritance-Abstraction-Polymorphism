package Proyecto1;

/**
 * Creacion de la clase SmartDevice
 */
public class SmartDevice {

    // Creacion de los atributos
    String marca;
    String modelo;
    String tamano;
    int year;

    // Creacion del constructor sin parametros
    public SmartDevice() {
    }

    // Creacion del constructor con parametros
    public SmartDevice(String marca, String modelo, String tamano, int year) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamano = tamano;
        this.year = year;
    }

    // Creacion de metodo para imprimir mensaje titulo
    public void visualizarFunciones(){
        System.out.println("Visualización de funciones de SmartDevice");
    }
}
