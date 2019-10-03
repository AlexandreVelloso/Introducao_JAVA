import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExIO{
    public static void main(String[] args){
        
        try {
            FileReader file = new FileReader("teste.txt");
            BufferedReader br = new BufferedReader(file);

            System.out.println("Desta forma imprimimos uma linha por vez. \n ");
            String linha = br.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
            br.close();
            
        } catch (IOException erro) {
            System.out.println("Oh! Arquivo não encontrado.");
            erro.printStackTrace();
        }
        
        
    }
}