package Herança;

public class HerancaApp {

    public static void main(String[] args) {
        
       Hgerente  gerente =new Hgerente("Pedro", (double) 10000, "gerente",0.10);
       Hassistente ass = new Hassistente("Ana", (double) 10000, "Assistente", 0.05);


        System.out.println("Nome: "+gerente.getNome()+"\nSalario: "+gerente.getSalario()+"\nCargo: "+gerente.getCargo()+"Bonus: "+gerente.getBonus());
        System.out.println("Nome: "+ass.getNome()+"\nSalario: "+ass.getSalario()+"\nCargo: "+ass.getCargo()+"Bonus: "+ass.getCalcularBonus());
    }
    
}
