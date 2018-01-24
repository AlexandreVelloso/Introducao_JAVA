import java.util.Scanner;

public class Metodo{

    public static void digaOla(){
        System.out.println("Ola mundo!");
    }

    public static void digaMeuNome( String nome ){
        // Vou fazer esse print em java puro
        System.out.println( "Ola "+nome );
    }

    public static void main( String [] args ){

        // Variavel para ler do teclado
        Scanner sc = new Scanner( System.in );

        System.out.println("Digite seu nome");

        // le o nome
        String nome = sc.nextLine();

        // chama o Metodo
        digaMeuNome( nome );

        // tambem podemos chamar metodos sem parametro
        digaOla();
    }
}
