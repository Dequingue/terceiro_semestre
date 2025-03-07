public class Carro extends Veiculos{
    private int qtPortas;

    public Carro(String marca, String modelo, int ano, int qtPortas) {
        super(marca, modelo, ano);
        this.qtPortas = qtPortas;
    }

    public int getQtPortas() {
        return qtPortas;
    }

    public void setQtPortas(int qtPortas) {
        this.qtPortas = qtPortas;
    }

    
    public void exibiInfo(){
        System.out.println("Marca: "+getMarca()+"Modelo: "+getModelo()+"Ano: "+getAno()+
        "Quantidade de Portas: "+getQtPortas());
    }
}
