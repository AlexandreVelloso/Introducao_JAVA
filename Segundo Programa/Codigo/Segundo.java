
import java.util.Scanner;

/*
 * "Ler 3 números inteiros da entrada, imprimir o menor e o maior"
 *
 * Autor: Adhonay junior
 */

public class Segundo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Entre com o primeiro inteiro: ");
        numero1 = scan.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        numero2 = scan.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        numero3 = scan.nextInt();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero2 < numero3) {
                    System.out.println("O menor numero eh: " + numero2);
                } else {
                    System.out.println("O menor numero eh: " + numero3);
                }
                System.out.println("O maior numero eh: " + numero1);
            } else {
                if (numero1 < numero2) {
                    System.out.println("O menor numero eh: " + numero1);
                } else {
                    System.out.println("O menor numero eh: " + numero2);
                }
                System.out.println("O maior numero eh: " + numero3);
            }
        } else {
            if (numero2 > numero3) {
                if (numero1 < numero3) {
                    System.out.println("O menor numero eh: " + numero1);
                } else {
                    System.out.println("O menor numero eh: " + numero3);
                }
                System.out.println("O maior numero eh: " + numero2);
            } else {
                if (numero1 < numero2) {
                    System.out.println("O menor numero eh: " + numero1);
                } else {
                    System.out.println("O menor numero eh: " + numero2);
                }
                System.out.println("O maior numero eh: " + numero3);
            }
        }
    }
}