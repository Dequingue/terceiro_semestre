package Encapsulamento;


public class EncapsularApp {

    public static void main(String[] args) {
        Encapsular p1 = new Encapsular("cafe", (double)5, 2);
        Encapsular p2 = new Encapsular("bolo", (double)10, 2);
    

        System.out.println("O valor total dos produtos é: "+p1.calcularTotal());
        System.out.println("O valor total dos produtos é: "+p2.calcularTotal());


        p1.setQuantidade(6);
        System.out.println("O valor total dos produtos é: "+p1.calcularTotal());
    }
}
