//main.java
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        String nomeArquivo = "texto.txt";
        String texto = "Este é um exemplo de texto que será gravado em um arquivo de texto.";

        try {
            FileWriter escritor = new FileWriter(nomeArquivo);
            BufferedWriter bufferEscrita = new BufferedWriter(escritor);
            bufferEscrita.write(texto);
            bufferEscrita.close();
            System.out.println("Texto gravado com sucesso no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo " + nomeArquivo);
            e.printStackTrace();
        }
      }
 }  



