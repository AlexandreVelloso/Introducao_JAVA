import java.util.Scanner;

public class Observacao{

    public static void main( String [] args ){

        Scanner sc = new Scanner( System.in );

        // Se o usuario digitar um valor String com espaco como "Bom Dia" a palavra Bom vai ser salva
        // na variavel str1, mas como o programa so le "Bom ", e o "Dia" ainda fica salvo no que
        // chamamos de Buffer, entao a variavel str2 ja vai pegar o valor Dia sem ter que pedir
        // o usuario um novo valor
        System.out.println("Digite um valor String com espaco");
        String str1 = sc.next();
        System.out.println("Digite outro valor String");
        String str2 = sc.next();
        System.out.println( "Valores lidos: "+str1+" "+str2);

        // O mesmo acontece para as funcoes nextInt, nextDouble, nextBoolean, ...
        // Entao para evitar esse problema e' bom você chamar a funcao nextLine() para limpar o Buffer
        // depois de ler o valor

        System.out.println("\nAgora limpando o buffer\n");
        System.out.println("Digite um valor String com espaco");
        String str3 = sc.next();
        // limpa o buffer
        sc.nextLine();

        System.out.println("Digite outro valor String");
        String str4 = sc.next();
        // limpa o buffer
        sc.nextLine();
        System.out.println( "Valores lidos: "+str3+" "+str4);
    }
}
