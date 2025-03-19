package Polimorfismo;

public class Gato extends Animal {

    private String nome;


    public Gato(String fazerSom, String nome) {
        super(fazerSom);
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibiInfo(){
        System.out.println("Nome: "+getNome()+"\nO som que ele faz: "+getFazerSom()+"\n");
    }
}
