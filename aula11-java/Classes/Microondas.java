package Classes;

public class Microondas extends Eletrodomesticos{
    private int tempoMaximo;

    public Microondas(String marca, Double potencia, int tempoMaximo) {
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    public int getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    public void exibiInfo(){
        System.out.println("Marca: "+getMarca()+"\nPotencia: "+getPotencia()+"\nTempo maximo: "+getTempoMaximo()+"\n");
    }
    
}
