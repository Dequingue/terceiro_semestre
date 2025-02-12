import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            for(int i=1;i<=10;i++){
                System.out.println("================================");
                for(int j=1;j<=10;j++){
                    System.out.println(i+" x "+j+" = "+i*j);

                }

            }
        }
    }
}
