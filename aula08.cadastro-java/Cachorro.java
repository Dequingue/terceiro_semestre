public class Cachorro extends Animal {
    private String raca;
    private String som;
    
    
    

    public Cachorro(String nome, int patas, String cor, String raca, String som) {
        super(nome, patas, cor);
        this.raca = raca;
        this.som = som;
    }

    public String getRaca() {
        return raca;
    }
        
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }

    public void exibiInfo(){
        System.out.println("\nNome: "+getNome()+"\nPatas: "+getPatas()+"\nRaça: "+getRaca()+"\nSom: "+getSom());
    }
}
