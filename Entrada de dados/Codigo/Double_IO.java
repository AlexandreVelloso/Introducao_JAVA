import IO.*;

public class Double_IO{

	public static void main( String [] args ){

			// Somente le o numero do teclado
			double num1 = IO.readdouble();
			// informa a mensagem e o usuario coloca o numero na mesma linha
			double num2 = IO.readdouble( "Digite um valor real: " );
			// informa a mensagem e o usuario coloca o numero na linha de baixo
			double num3 = IO.readdouble( "Digite outro valor real\n");

			IO.println("Valor lido para o numero1 = "+num1 );
			IO.println("Valor lido para o numero2 = "+num2 );
			IO.println("Valor lido para o numero3 = "+num3 );
	}
}

/*
OBS: no num2 eu usei o caractere '\n', ele serve para quebrar a linha. Igual quando fazem <br/> no HTML
*/
