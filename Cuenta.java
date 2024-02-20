//Nombre: Yovana Alejandra Hinestroza Lopez
import java.util.Random;
import java.util.Scanner;

public class Cuenta {
    private String numeroCuenta;
    private final String nombreBanco = "Wells Fargo";
    private String nombreCliente;
    private String ciCliente;
    private double balance;

    // Constructor
    public Cuenta(String nombreCliente, String ciCliente) {
        this.numeroCuenta = generarNumeroCuenta();
        this.nombreCliente = nombreCliente;
        this.ciCliente = ciCliente;
        this.balance = 0;
    }

    // Método para generar un número de cuenta aleatorio
    private String generarNumeroCuenta() {
        Random rand = new Random();
        int num = rand.nextInt(1000000);
        return String.format("%09d", num);
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            this.balance += monto;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("El monto debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= this.balance) {
            this.balance -= monto;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Monto inválido o insuficiente saldo.");
        }
    }

    // Método para mostrar el extracto de cuenta
    public void mostrarExtracto() {
        System.out.println("Banco: " + nombreBanco);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario para crear la cuenta
        System.out.println("Ingrese su nombre:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese su CI:");
        String ciCliente = scanner.nextLine();

        // Crear la cuenta con la información proporcionada
        Cuenta cuenta = new Cuenta(nombreCliente, ciCliente);

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Depositar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Mostrar Extracto de Cuenta");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción:");

            opcion = scanner.nextInt();
            double monto;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto a depositar:");
                    monto = scanner.nextDouble();
                    cuenta.depositar(monto);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar:");
                    monto = scanner.nextDouble();
                    cuenta.retirar(monto);
                    break;
                case 3:
                    cuenta.mostrarExtracto();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
