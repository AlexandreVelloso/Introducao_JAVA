import IO.*;

public class Inteiro{
	
	public static void main( String [] args ){

			// Somente le o numero do teclado
			int num1 = IO.readint();
			// informa a mensagem e o usuario coloca o numero na mesma linha
			int num2 = IO.readint( "Digite um valor inteiro: " );
			// informa a mensagem e o usuario coloca o numero na linha de baixo
			int num3 = IO.readint( "Digite outro valor inteiro\n");

			IO.println("Valor lido para o numero1 = "+num1 );
			IO.println("Valor lido para o numero2 = "+num2 );
			IO.println("Valor lido para o numero3 = "+num3 );
	}
}

/*
OBS: no num2 eu usei o caractere '\n', ele serve para quebrar a linha. Igual quando fazem <br/> no HTML
*/
