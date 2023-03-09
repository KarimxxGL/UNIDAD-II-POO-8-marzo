

// Clase principal que crea objetos de tipo Vehiculo
    public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Automovil("Toyota", "Corolla", 2020, 30000, 4, "Gasolina");
        Vehiculo vehiculo2 = new Motocicleta("Honda", "CBR", 2019, 15000, 600);

        vehiculo1.mostrarCaracteristicas();
        vehiculo2.mostrarCaracteristicas();
    }
}
