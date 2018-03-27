import java.util.Scanner;

public class Erro3{
    
    public static void main( String [] args ){
        
        Scanner sc = new Scanner( System.in );

        try{
    
            System.out.println( "Digite um numero inteiro" );
            int num = sc.nextInt();
            System.out.println( "Valor lido: "+num );

        }catch( Exception e ){
            System.out.println( "Valor invalido, o valor nao foi lido" );
        }finally{
            sc.close();
            System.out.println( "Fechei o Scanner" );
        }
    }
}