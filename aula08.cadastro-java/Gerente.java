public class Gerente extends Funcionario {
    private double bonus;
    public Gerente(String nome, double salario,int idade, double bonus){
        super(nome,salario, idade);
        this.bonus=bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
