import java.util.Scanner;

public class Fibonacci{

    public static int fibonacci( int n ){
        int resultado;

        if( n == 0 ){
            resultado = 0; // caso base
        }else if( n == 1 ){
            resultado = 1; // caso base
        }else{
            resultado = fibonacci( n-2 ) + fibonacci( n-1 ); // passo recursivo
        }

        return resultado;
    }

    public static void main (String [] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println( "Digite um numero" );
        int num = sc.nextInt();

        System.out.println("O Fibonacci de "+num+" = "+fibonacci(num) );

        sc.close();
    }
}