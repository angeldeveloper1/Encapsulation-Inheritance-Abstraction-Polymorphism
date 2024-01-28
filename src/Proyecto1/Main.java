package Proyecto1;

/**
 * Creacion del main
 */
public class Main {
    public static void main(String[] args) {

        // Creacion de los objetos sin tener los datos necesarios para inicializarlos
        SmartDevice Tablets = new SmartDevice();
        SmartPhone Huawei = new SmartPhone();
        SmartWatch HuaweiWatchFit2 = new SmartWatch();

        // Creacion del objeto SmartTV
        SmartDevice SmartTV = new SmartDevice("Samsung","QN900A","65 Pulg", 2021);

        // Llamando al metodo usando Polimorfismo
        SmartTV.visualizarFunciones();

        // Imprimiendo los datos del objeto SmartTV
        System.out.println(SmartTV.marca);
        System.out.println(SmartTV.modelo);
        System.out.println(SmartTV.tamano);
        System.out.println(SmartTV.year);

        // Salto de linea
        System.out.println("\n");

        // Creacion del objeto Samsung
        SmartPhone Samsung = new SmartPhone("Samsung", "Galaxy 23", "6.8 Pulg", 2023, "Exynos", 512.00);

        // Llamando al metodo usando Polimorfismo
        Samsung.visualizarFunciones();

        // Imprimiendo los datos del objeto Samsung
        System.out.println(Samsung.marca);
        System.out.println(Samsung.modelo);
        System.out.println(Samsung.tamano);
        System.out.println(Samsung.year);
        System.out.println(Samsung.procesador);
        System.out.println(Samsung.gb);

        // Salto de linea
        System.out.println("\n");

        // Creacion del objeto Honor
        SmartWatch Honor = new SmartWatch("Honor", "Watch GS 3", "46 mm", 2022, true);

        // Llamando al metodo usando Polimorfismo
        Honor.visualizarFunciones();

        // Imprimiendo los datos del objeto Honor
        System.out.println(Honor.marca);
        System.out.println(Honor.modelo);
        System.out.println(Honor.tamano);
        System.out.println(Honor.year);
        System.out.println(Honor.resistenciaAgua);
    }
}
