import java.util.Scanner;

public class IF_PURO{

    public static void main( String [] args ){

        Scanner sc = new Scanner( System.in );

        System.out.println("Digite um valor para A");
        double a = sc.nextDouble();

        System.out.println("Digite um valor para B");
        double b = sc.nextDouble();

        if( b == 0.0 ){
            System.out.println("-1");
        }else if( a/b > 0 ){
            System.out.println( a/b );
        }else{
            System.out.println( "0" );
        }

        System.out.println("Fim do programa");
    }

}
