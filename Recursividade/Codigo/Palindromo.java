import java.util.Scanner;

public class Palindromo 
{
    public static boolean ehPalindromo(String str)
    {
        // definir dados
        boolean result = false;
 
        // chama metodo recursivo
        result = ehPalindromo( str, 0 );
 
        return( result );
    }// end ehPalindromo()

    public static boolean ehPalindromo(String str, int i)
    {
        // definir dados
        boolean result = true;
        int meio = str.length( )/2;
        char prim = ' ';
        char ult  = ' ';
         
        prim = str.charAt( i );
        ult  = str.charAt( str.length( ) - 1 - i );
 
        if( prim != ult )
        {
            result = false;
        }
        else
        {       
            if( i < meio )
            {
                result = ehPalindromo( str, i + 1 );
            }// end if
        }// end if
 
        return( result );
    }// end ehPalindromo()

    public static void main(String[] args) {
        // definir dados
        String str;
        boolean resultado = false;
        Scanner scan = new Scanner(System.in);

        // le a string
        System.out.print("Escreva a palavra: ");
        str = scan.nextLine();

        // verifica se e' palindromo
        resultado = ehPalindromo(str);

        // testa se e' palindromo
        if(resultado)
        {
            System.out.println("Palavra " + str + " e' palindromo");
        }
        else
        {
            System.out.println("Palavra " + str + " nao e' palindromo");
        }// end if
    }// end main()
}// end class