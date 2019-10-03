import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ExScanner{
    public static void main(String[] args){
        
        try {
            File file = new File("teste.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Desta forma imprimimos uma linha por vez. \n ");
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

            // Necessario comentar um caso va utilizar

            System.out.println("Desta forma imprimimos uma palavra por vez. \n ");
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }

            scanner.close();
        } catch (FileNotFoundException erro) {
            System.out.println("Oh! Arquivo não encontrado.");
            erro.printStackTrace();
        }
        
        
    }
}