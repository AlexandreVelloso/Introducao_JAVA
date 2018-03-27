public class Erro2{

    public static void metodo(){
       
        String str = "banana";

        try{
            int num = Integer.parseInt( str );
        }catch( NumberFormatException nfe ){
            System.out.println("Tratei a excecao, e nao deixei o programa parar de funcionar");
        }

        System.out.println("Fim do metodo");
    }

    public static void main( String [] args ){
        metodo();
    }
}