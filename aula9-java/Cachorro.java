public class Cachorro extends Animal {

    public Cachorro(String tipo, String fazerSom) {
        super(tipo, fazerSom);
    }

    // Implementação do método abstrato
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: " + getFazerSom());
    }
}