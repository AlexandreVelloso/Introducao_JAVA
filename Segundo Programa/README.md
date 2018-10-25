# Meu segundo programa em java

##Uma saída típica:

Entre com o primeiro inteiro: 3
Entre com o segundo inteiro: 9
Entre com o terceiro inteiro: 123
O menor numero eh: 3
O maior numero eh: 123

    A linha ...

### import java.util.Scanner;

    ... é usada para dizer ao Java que usaremos alguma coisa externa ao nosso programa (a "classe" Scanner)
    A linha ...

### Scanner sc = new Scanner(System.in);

    ... cria um "Scanner" que é usado para ler dados da entrada
        Os detalhes (o que significa "new", etc. serão explicados adiante)
    A linha ...

### int n1, n2, n3;

    ... declara três variáveis inteiras para uso posterior
        Por convenção, variáveis iniciam com letra minúscula
    A linha ...

### n1 = sc.nextInt();

    ... lê um inteiro da entrada
    Também poderíamos ter feito assim:

### int n1 = sc.nextInt();

    As linhas ...

###       if(n2 < n3) {
###         System.out.println("O menor numero eh: " + n2);
###       } else {
###         System.out.println("O menor numero eh: " + n3);
###       }

    ... mostram uma decisão
    Duas dessas linhas também mostram a concatenação de strings com o operador +
        Falamos que, em Java, o operador "+" está overloaded porque ele significa adição de números e também concatenação de strings, dependendo dos seus operandos
        É o único operador que sofre overload
    Segue uma segunda versão do programa
        Esta solução está no arquivo MinMax2.java
