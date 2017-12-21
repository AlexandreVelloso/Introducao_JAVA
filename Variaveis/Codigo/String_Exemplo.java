public class String_Exemplo{
  public static void main( String [] args ){

      String str1, str2, str3;
      int idade;
      String mensagem;

      // valor de str1
      str1 = "Ola meu nome e' ";
      // valor de str2
      str2 = "Alexandre";
      // valor de str3
      str3 = " e a minha idade e' ";
      // valor de idade
      idade = 21;

      mensagem = str1 + str2 + str3 + idade;

      System.out.println( "mensagem = "+mensagem);

      /*
      Esse e' um comentario em bloco, entao o programa nao vai executar esse trecho
      mensagem = Ola meu nome e' Alexandre e a minha idade e' 21
      */
  }
}
