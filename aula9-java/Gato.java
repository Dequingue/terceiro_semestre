public class Gato extends Animal {

    public Gato(String tipo, String fazerSom) {
        super(tipo, fazerSom);
    }

    // Implementação do método abstrato
    @Override
    public void fazerSom() {
        System.out.println("O Gato faz: " + getFazerSom());
    }
}