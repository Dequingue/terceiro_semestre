public class Moto extends Veiculos{

    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void exibiInfo(){
        System.out.println("Marca: "+getMarca()+"Modelo: "+getModelo()
        +"Ano: "+getAno()+"Quantidade de Cilindradas: "+getCilindrada());
    }
    
}
