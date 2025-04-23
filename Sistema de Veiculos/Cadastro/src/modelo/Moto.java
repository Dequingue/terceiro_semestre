package modelo;

public class Moto extends Veiculos {
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

  
    
}
