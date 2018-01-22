import IO.*;

public class Boolean_Exemplo{

	public static void main( String [] args ){

			// lê um valor booleano
			boolean bool1 = IO.readboolean( "Digite um valor booelean true/false\n" );

			IO.println("Valor lido para o numero1 = "+bool1 );
	}
}
/*
OBS: para ser um valor valido o usuario deve escrever true ou false,
nao importa se e' maiusculo ou minusculo.
*/
