import java.util.Scanner;
 
public class Matriz_Exemplo {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int matriz[][] = new int[20][30];
    int linha, coluna, i, j;

    // iterando sobre a matriz para dar valor para cada posiçao
    for (linha = 0; linha < 20; linha++) {
            for (coluna = 0; coluna < 30; coluna++) {
                System.out.printf("Entre com o valor matriz [%d][%d]: ",
                        linha + 1, coluna + 1);
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

    for (i = 0; i < 20; i++) {
            for (j = 0; j < 30; j++) {
                int impar = matriz[i][j];
                if (impar % 2 != 0) {
                    matriz[i][j] = -1;
                }
            }
        }
    
    // iterando sobre a matriz para dar print da matriz.
    for (i = 0; i < 20; i++) {
            for (j = 0; j < 30; j++) {
                System.out.println("Matriz: " + matriz[i][j]);
            }
        }
    }
}