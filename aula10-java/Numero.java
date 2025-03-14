public class Numero{
    public static void main(String[] args) {
        try{
            int resultado=10/0;

        }catch(ArithmeticException e){
            System.out.println("Erro: Divisão por zero impossivel");
        }finally{
            System.out.println("finalizado....");
        }
    }
    

}