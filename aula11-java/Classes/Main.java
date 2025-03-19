package Classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("GELADEIRAS:\n");
        Geladeira geladeira =new Geladeira("sonny", (double) 5,(double) 2);    
        geladeira.exibiInfo();
        System.out.println("MICROONDAS:\n");
        Microondas micro = new Microondas("Sonny", (double)5, 10);
        micro.exibiInfo();
    
    }
    
}
