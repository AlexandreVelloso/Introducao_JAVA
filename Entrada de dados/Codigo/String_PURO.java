import java.util.Scanner;

public class String_PURO{

	public static void main( String [] args ){

			Scanner sc = new Scanner( System.in );

			System.out.println("Digite uma String");

			// para a String vou ler a linha inteira, entao o usuario pode digitar espaco
			String str = sc.nextLine();

			System.out.println("Valor lido para a String = "+str );
	}
}
