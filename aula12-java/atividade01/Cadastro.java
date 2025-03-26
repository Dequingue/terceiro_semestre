package atividade01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Cadastro {

        public static void main(String[] args) {
            try(Scanner sc = new Scanner(System.in)){
                String frase = "";
                try{
                    FileWriter escritor = new FileWriter("escreve.txt",true);

                    System.out.println("Digite uma frase: ");
                    if(sc.hasNextLine()){
                        frase = sc.nextLine();

                    }else{
                        System.out.println("Erro alguma coisa fora do normal");
                    }
                    

                    escritor.write(frase+"\n");
                    escritor.close();

                    System.out.println("Texto salvo!");
                }catch(IOException e){
                    System.out.println("Erro no systema!");
                    e.printStackTrace();
                }
            }
        }
    
}