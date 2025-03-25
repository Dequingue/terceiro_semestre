package tentar;

public class Pessoa extends Aviao {
    
    private int reserva;
    private String nome;
    
    

        

    public Pessoa(int quantidade_avioes, int assentos, int quantidade_assentos, int reserva, String nome) {
        super(quantidade_avioes, assentos, quantidade_assentos);
        this.reserva = reserva;
        this.nome = nome;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calculo(){
        return super.getAssentos() - 1;
    }

    
    
    
    
}
