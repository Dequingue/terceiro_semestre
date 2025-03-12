// Declaração da classe Animal como abstrata
public abstract class Animal {
    private String tipo;
    private String fazerSom;

    // Construtor da classe Animal
    public Animal(String tipo, String fazerSom) {
        this.tipo = tipo;
        this.fazerSom = fazerSom;
    }

    // Métodos getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFazerSom() {
        return fazerSom;
    }

    public void setFazerSom(String fazerSom) {
        this.fazerSom = fazerSom;
    }

    // Método abstrato que as subclasses devem implementar
    public abstract void fazerSom();  // Método sem corpo, que deve ser implementado nas subclasses
}