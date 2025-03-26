import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo{
    public static void main(String[] args) {
        try{

            FileWriter escritor = new FileWriter("Arquivo.txt");
            escritor.write("Olá, este é um arquivo de teste!\n");
            escritor.write("Podemos escrever várias linhas.\n");
    
            escritor.close();
            System.out.println("Arquivo criado com sucesso!");

        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo. ");
            e.printStackTrace();
        }
    }


}