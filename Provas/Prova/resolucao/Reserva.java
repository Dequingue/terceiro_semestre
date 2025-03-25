package resolucao;

class Reserva {
    private String passageiro;
    private int numeroAviao;
    
    public Reserva(String passageiro, int numeroAviao) {
        this.passageiro = passageiro;
        this.numeroAviao = numeroAviao;
    }
    
    public String getPassageiro() {
        return passageiro;
    }
    
    public int getNumeroAviao() {
        return numeroAviao;
    }
}