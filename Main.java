//Nombre: Yovana Alejandra Hinestroza Lopez

// Clase principal Electrodomestico
class Electrodomestico {
    // Atributos encapsulados
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Electrodomestico(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para encender el electrodoméstico
    public void encender() {
        System.out.println("El electrodoméstico está encendido.");
    }

    // Método para apagar el electrodoméstico
    public void apagar() {
        System.out.println("El electrodoméstico está apagado.");
    }

    // Getters y setters para los atributos encapsulados
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

// Clase Lavadora que hereda de Electrodomestico
class Lavadora extends Electrodomestico {
    // Constructor
    public Lavadora(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    // Método específico de la lavadora para lavar
    public void lavar() {
        System.out.println("La lavadora está lavando la ropa.");
    }

    // Método específico de la lavadora para secar
    public void secar() {
        System.out.println("La lavadora está secando la ropa.");
    }
}

// Aqui para invocar los metodos
public class Main {
    public static void main(String[] args) {
        // Crear una lavadora
        Lavadora miLavadora = new Lavadora("Samsung", "ABC123", 2020);

        // Encender la lavadora
        miLavadora.encender();

        // Lavar y secar
        miLavadora.lavar();
        miLavadora.secar();

        // Apagar la lavadora
        miLavadora.apagar();
    }
}
