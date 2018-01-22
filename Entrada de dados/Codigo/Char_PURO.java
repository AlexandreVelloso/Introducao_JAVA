import java.util.Scanner;

public class Char_PURO{

	public static void main( String [] args ){

			Scanner sc = new Scanner( System.in );

			// Le o char do teclado
			System.out.println( "Digite um char" );

			// como readChar nao existe, devemos ler a linha inteira e
			// depois pegar somente o 1 caractere com a funcao charAt(x)
			char valor = sc.nextLine().charAt(0);

			System.out.println("Valor lido para o char = "+valor );
	}
}
