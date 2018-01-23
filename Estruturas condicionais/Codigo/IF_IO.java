import IO.*;

public class IF_IO{

    public static void main( String [] args ){

        double a = IO.readdouble("Digite um valor para A\n");
        double b = IO.readdouble("Digite um valor para B\n");

        if( b == 0.0 ){
            IO.println("-1");
        }else if( a/b > 0 ){
            IO.println( a/b );
        }else{
            IO.println( "0" );
        }

        IO.println("Fim do programa");
    }

}
