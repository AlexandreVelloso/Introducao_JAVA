import java.util.Scanner;

public class Exemplo{
    public static void metodoR( int i, int n ){
        if( i < n ){
            System.out.println( "Recursivo: Ola, o meu valor de i e': "+i);
            metodoR( i + 1, n );
        }
    }

    public static void main( String [] args ){

        Scanner sc = new Scanner( System.in );

        System.out.println("Informe um valor inteiro positivo");
        int n = sc.nextInt();

        // nao se esqueca de fechar o sc,
        // o seu codigo nao vai deixar de rodar se voce nao fizer isso
        // mas e' mais seguro fechar
        sc.close();

        int i;
        for( i = 0; i < n; i++ ){
            System.out.println( "For: Ola, o meu valor de i e': "+i);
        }

        System.out.println();

        i = 0;
        while( i < n ){
            System.out.println( "While: Ola, o meu valor de i e': "+i);
            i++;
        }

        System.out.println();

        metodoR(0,n);
    }
}