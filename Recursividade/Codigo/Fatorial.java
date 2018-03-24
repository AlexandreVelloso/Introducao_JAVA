import java.util.Scanner;

public class Fatorial{

    public static int fatorial( int n ){
        int resultado;

        if( n == 0 ){
            resultado = 1;
        }else{
            resultado = n * fatorial( n-1 );
        }

        return resultado;
    }

    public static void main( String [] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite um numero" );
        int num = sc.nextInt();

        System.out.println( "Fatorial de "+num+" = "+fatorial(num) );
    }

}