public class Boolean_Exemplo{
  public static void main( String [] args ){

      // Declarar variaveis
      boolean var1, var2;
      boolean r1, r2, r3, r4;

      var1 = true;
      var2 = false;

      // And( e )
      r1 = var1 && var2;

      // Or( ou )
      r2 = var1 || var2;

      // Not( nao )
      r3 = !var1;
      r4 = !var2;

      System.out.println( "r1: "+r1 );
      System.out.println( "r2: "+r2 );
      System.out.println( "r3: "+r3 );
      System.out.println( "r4: "+r4 );

      /*
      Esse e' um comentario em bloco, entao o programa nao vai executar esse trecho

      r1: false
      r2: true
      r3: false
      r4: true
      */
  }
}
