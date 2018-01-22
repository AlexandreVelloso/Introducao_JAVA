//import IO.*;

public class DoWhile{

    public static void main( String [] args ){
        // altere esse valor e veja as mudancas
        int numRepeticoes = 10;
        int num = 1;

        do{
            System.out.println( num );
            // IO.println( num )
            num = num + 1;
        }while( num <= numRepeticoes );
    }
}

/*
OBS: se voce esta usando o pacote IO descomente as partes dele no programa
*/
