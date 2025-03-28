import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
   
    public static void main(String[] args) {
        String nomeArquivo ="mensagem.txt";

        File arquivo = new File (nomeArquivo);
        if(!arquivo.exists()){
            System.out.println("Erro: arquivo "+nomeArquivo+"não existe");
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){

            String linha;

            while((linha =reader.readLine())!=null){
                System.out.println(linha);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Erro: Arquivo não encontrado!"+e.getMessage());

        }
    }
    
}
