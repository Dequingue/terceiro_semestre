package modelo;

public class Carro extends Veiculos{

    private String nPortas;

    public Carro(String marca, String modelo, String nPortas) {
        super(marca, modelo);
        this.nPortas = nPortas;
    }

    public String getnPortas() {
        return nPortas;
    }

    public void setnPortas(String nPortas) {
        this.nPortas = nPortas;
    }
  
    
    
}