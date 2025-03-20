package Herança;
public class Hassistente extends Heranca{
    private double calcularBonus;

    public Hassistente(String nome, Double salario, String cargo, double calcularBonus) {
        super(nome, salario, cargo);
        this.calcularBonus = salario*0.05;
    }

    public double getCalcularBonus() {
        return calcularBonus;
    }

    public void setCalcularBonus(double calcularBonus) {
        this.calcularBonus = calcularBonus;
    }
    

    //Outra forma de realizar:
    
   /*  public double calcular(){
        return super.getSalario()*0.05;
    }
    */   

    
}
