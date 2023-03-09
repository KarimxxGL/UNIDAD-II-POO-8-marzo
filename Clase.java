import javax.swing.*;

// Clase abstracta que representa un vehículo
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;
    protected double precio;

    public Vehiculo(String marca, String modelo, int añoFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precio = precio;
    }

    public abstract void mostrarCaracteristicas(); // método abstracto para mostrar las características del vehículo
}

// Clase que representa un automóvil
class Automovil extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Automovil(String marca, String modelo, int añoFabricacion, double precio, int numPuertas, String tipoCombustible) {
        super(marca, modelo, añoFabricacion, precio);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public void mostrarCaracteristicas() {
        JOptionPane.showMessageDialog(null, "Marca: "+marca +"\n" +
                "Modelo: "+modelo+"\n" +
                "Año de Fabricacion: "+añoFabricacion+"\n" +
                "Precio: "+precio+"\n" +
                "Numero de Puertas: "+numPuertas+"\n" +
                "Tipo de Combustible: "+tipoCombustible);

    }
}

// Clase que representa una motocicleta
class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int añoFabricacion, double precio, int cilindrada) {
        super(marca, modelo, añoFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    public void mostrarCaracteristicas() {
        JOptionPane.showMessageDialog(null, "Marca: "+marca+"\n"+
                "Modelo:" + modelo + "\n" + "Año de Fabricacion: " +añoFabricacion + "\n" +
                "Precio: "+precio+ "\n" +
                "Cilindrada: "+ cilindrada);

    }
}
