import java.util.Scanner;

public class Funcao{

    public static int somaInteiro( int a, int b ){
        int soma;

        // soma os 2 numeros
        soma = a+b;

        // devolve o valor da soma
        return( soma );
    }

    public static double pi(){
        return ( 3.14159265359 );
    }

    public static void main( String [] args ){

        // variavel para ler da tela
        Scanner sc = new Scanner( System.in );

        System.out.println("Digite um valor para A");

        // le o valor de A
        int a = sc.nextInt();

        System.out.println("Digite um valor para B");

        // le o valor para B
        int b = sc.nextInt();

        // chama a funcao soma
        // Eu passo as variaveis A e B para a funcao,
        // e o valor retornado vai ficar dentro de soma
        int soma = somaInteiro( a, b );

        System.out.println("O resultado da soma e': "+soma );

        // ou tambem posso chamar a funcao direto no print
        System.out.println("O valor de pi e': "+ pi() );
    }
}
