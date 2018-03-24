public class Fatorial{

    public static int fatorial( int n ){
        int resultado;

        System.out.println( "Entrei, n = "+n);

        if( n == 0 ){
            resultado = 1;
        }else{
            resultado = n * fatorial( n-1 );
        }

        System.out.println("Valor de n: "+n+" valor de resultado: "+resultado);

        return resultado;
    }

    public static void main ( String [] args ){

        int num = 3;
        System.out.println( "O fatorial de "+num+" = "+fatorial(num) );
    }
}