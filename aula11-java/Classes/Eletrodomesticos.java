package Classes;

public class Eletrodomesticos {
    private String marca;
    private Double potencia;
    
    public Eletrodomesticos(String marca, Double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    
}
