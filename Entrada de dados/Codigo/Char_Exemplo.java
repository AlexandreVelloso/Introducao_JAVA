import IO.*;

public class Char_Exemplo{

	public static void main( String [] args ){

			// Somente le o numero do teclado
			char num1 = IO.readchar();
			// informa a mensagem e o usuario coloca o numero na mesma linha
			char num2 = IO.readchar( "Digite um valor real: " );
			// informa a mensagem e o usuario coloca o numero na linha de baixo
			char num3 = IO.readchar( "Digite outro valor real\n");

			IO.println("Valor lido para o numero1 = "+num1 );
			IO.println("Valor lido para o numero2 = "+num2 );
			IO.println("Valor lido para o numero3 = "+num3 );
			IO.println("Valor lido para o numero3 = "+(int)num3 );
	}
}

/*
OBS: no num2 eu usei o caractere '\n', ele serve para quebrar a linha. Igual quando fazem <br/> no HTML
*/
