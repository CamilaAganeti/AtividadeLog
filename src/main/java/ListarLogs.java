import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ListarLogs {
    private static final String NOME_ARQUIVO_LOG = "log2106.txt";

    public static void main(String[] args) {
        listarLogs(NOME_ARQUIVO_LOG);
    }
      public static void listarLogs(String nomeArquivoLog) {
        FileReader logReader = null;
            BufferedReader logBuffer = null;
            try {
                logReader = new FileReader(nomeArquivoLog);
                logBuffer = new BufferedReader(logReader);


            String linha;
            while ((linha = logBuffer.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de log " + nomeArquivoLog);
            e.printStackTrace();
        }
    }
}
