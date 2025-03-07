public class Gato extends Animal{
    private String som;

      
    public Gato(String nome, int patas, String cor, String som) {
        super(nome, patas, cor);
        this.som = som;
    }

    public String getSom() {
        return som;
    }
    
    public void setSom(String som) {
        this.som = som;
    }

    public void exibiInfo(){
        System.out.println("Nome: "+getNome()+"\nPatas: "+getPatas()+"\nCor: "+getCor()+"\nSom: "+getSom());
    }
    
}
