public class Exemplo1{
    public static void metodo1(){

        System.out.println("Entrei no metodo 1");

        // chama o metodo 2
        metodo2();

        System.out.println("Estou saindo do metodo 1");
    }

    public static void metodo2(){
        
        System.out.println("Entrei no metodo 2");

        System.out.println("Estou saindo do metodo 2");
    }

    public static void main( String [] args ){

        System.out.println("Comecei o programa, entrei no main");

        // chama o metodo 1
        metodo1();

        System.out.println("Estou saindo do main");
    }
}