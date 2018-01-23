import IO.*;

public class Switch_IO{
    public static void main( String [] args ){
        int diaSemana = IO.readint("Digite um dia da semana\n");

        switch( diaSemana ){
            case 1:
                IO.println("Domingo");
                break;
            case 2:
                IO.println("Segunda-feira");
                break;
            case 3:
                IO.println("Terça-feira");
                break;
            case 4:
                IO.println("Quarta-feira");
                break;
            case 5:
                IO.println("Quinta-feira");
                break;
            case 6:
                IO.println("Sexta-feira");
                break;
            case 7:
                IO.println("Sabado");
                break;
            default:
                IO.println("Dia invalido");
                break;
        }

        IO.println("Fim do programa");
    }
}
