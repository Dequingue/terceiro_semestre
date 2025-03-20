package Herança;
public class Hgerente extends Heranca{
    private double bonus;

    public Hgerente(String nome, Double salario, String cargo, double bonus) {
        super(nome, salario, cargo);
        this.bonus = salario*0.10;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    //Outra forma de fazer:

    /* public double calcular(){
        return super.getSalario()*0.10;
    }*/
}
