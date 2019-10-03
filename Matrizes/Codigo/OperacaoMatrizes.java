import java.util.*;

public class OperacaoMatrizes {

    public static void main(String[] args) {
        int A[][], B[][], C[][], D[][];

        A = lerMatriz(2, 3);
        B = lerMatriz(3, 2);
        C = somaMatriz(A, B);
        D = multiMatriz(A, B);

        mostraMatriz(C);
        System.out.println();
        mostraMatriz(D);
        System.exit(0);

    }

    public static int[][] lerMatriz(int nl, int nc) {
        int mat[][] = new int[nl][nc];

        Scanner leitura = new Scanner(System.in);

        System.out.println("Entre com os dados da matriz");

        for (int l = 0; l < nl; l++) {
            for (int c = 0; c < nc; c++) {
                System.out.println("Entre com o elesmento [" + l + "][" + c + "]: ");
                mat[l][c] = leitura.nextInt();
            }
        }

        return mat;

    }

    public static int[][] somaMatriz(int x[][], int y[][]) {
        if (x.length != y.length || x[0].length != y[0].length) {
            System.out.println("Matrizes com dimensões diferentes!");

        }

        int z[][] = new int[x.length][y.length];

        for (int l = 0; l < x.length; l++) {
            for (int c = 0; c < x.length; c++) {
                z[l][c] = x[l][c] + y[l][c];
            }

        }
        return z;

    }

    public static void mostraMatriz(int C[][]) {
        for (int l = 0; l < C.length; l++) {
            for (int c = 0; c < C.length; c++) {
                System.out.print(C[l][c] + "\t");
            }
            System.out.println();
        }

    }

    public static int[][] multiMatriz(int x[][], int y[][]) {
        int soma = 0;
        int multi = 0;

        int matriz[][] = new int[x.length][y[0].length];

        for (int l = 0; l < y[0].length; l++) {
            for (int c = 0; c < x.length; c++) {
                for (int m = 0; m < y.length; m++) {

                    multi = x[l][m] * y[m][c];
                    soma = multi + soma;

                }
                matriz[l][c] = soma;
                multi = 0;
                soma = 0;
            }
        }
        return matriz;

    }

}