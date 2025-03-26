import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        try{
            FileReader leitor = new FileReader("Produtos.txt");

            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha;

            while ((linha = bufferedReader.readLine())!=null) {
                System.out.println(linha);
            }
            
            bufferedReader.close();
        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
    
}
