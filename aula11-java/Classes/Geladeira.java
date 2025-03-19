package Classes;

public class Geladeira extends Eletrodomesticos{
    private Double capacidade;

    public Geladeira(String marca, Double potencia, Double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }
    
    
    public void exibiInfo(){
        System.out.println("Marca: "+getMarca()+"\nPotencia: "+getPotencia()+"\nCapacidade: "+getCapacidade()+"\n");
    }
    
}
