import IO.*;

public class String_IO{

	public static void main( String [] args ){

			// Le uma String do teclado, mas sem espaco
			String str1 = IO.readString( "Digite uma String\n" );
			// Le uma String do teclado com espaco
			String str2 = IO.readln( "Digite outra String\n" );

			IO.println("Valor lido para o numero1 = "+str1 );
			IO.println("Valor lido para o numero2 = "+str2 );
	}
}

/*
OBS: aqui temos uma pequena diferenca entre esses 2 metodos.
No 1 caso se o usuario digitar uma String que tenha espaco
como "Bom dia", somente o "Bom" será lido. ( os caracteres "" não contam nesse caso)

No 2 caso a mensagem pode conter espacos, entao "Bom dia"
seria lido como "Bom dia"
*/
