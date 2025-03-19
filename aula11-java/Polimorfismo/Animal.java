package Polimorfismo;

public abstract class Animal {
    private String fazerSom;

    public Animal(String fazerSom) {
        this.fazerSom = fazerSom;
    }

    public String getFazerSom() {
        return fazerSom;
    }

    public void setFazerSom(String fazerSom) {
        this.fazerSom = fazerSom;
    }

    
    
}