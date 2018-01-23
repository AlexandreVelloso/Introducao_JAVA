import java.util.Scanner;

public class Double_PURO{

	public static void main( String [] args ){

			Scanner sc = new Scanner( System.in );

			System.out.println("Digite outro valor real");
			// Somente le o numero do teclado
			double num = sc.nextDouble();

			System.out.println("Valor lido para o numero = "+num );
	}
}

/*
OBS: Interessante que aqui ele so' aceita numeros double com ',', se voce colocar '.' vai dar erro.
Pelo menos no meu computador esta assim, teste no seu
*/
