# Métodos e Funções

Sabe quando você tem um trecho de código que executa uma certa tarefa, e você quer usar isso muitas vezes no seu programa? Bom essa é uma boa hora para fazer um método ou uma função.<br />

O que são métodos e funções?<br/>
Métodos e funções são trechos de código que executam uma tarefa, e podem ser chamados uma ou várias vezes durante a execução do programa.<br />

Qual a diferença entre os 2?<br />
A diferença entre os dois é pequena. Um método só executa uma tarefa e pronto, e uma função executa uma tarefa e retorna um resultado.<br />
Por exemplo: um método chamado **digaMeuNome()**, mostra a *String* "Ola" com o nome que você passar para ele.<br />
Já uma função ela te retorna algum resultado, como por exemplo uma função chamada **diaDaSemanaAtual()**, essa função poderia pegar o dia da semana atual e devolver para quem a chamou, devolvendo uma *String* contendo o dia da semana.

## Estrutura de um método
Vamos começar com um exemplo de método, como o **digaMeuNome(String)**:
```java
public static void digaMeuNome( String nome ){
    // Vou fazer esse print em java puro
    System.out.println( "Ola "+nome );
}
```

Todos os métodos tem 6 componentes:
```java
public(1) static(2) void(3) falarBomDia(4) ( (5) ){

    (6)
}
```

1) **Modificador de acesso**: Aqui o método diz quem vai poder chamá-lo, como ainda estamos no básico pode colocar sempre **public** aqui. Voltamos nisso quando tratarmos [Orientação a objetos*](https://github.com/AlexandreVelloso/Introducao_JAVA/edit/master/Metodos%20e%20funcoes/).
2) **static**: Aqui mostra que o método é executado pela classe, para facilitar sempre vamos colocar o **static**. Não se preocupe, vamos voltar nessa parte quando vermos [Orientação a objetos*](https://github.com/AlexandreVelloso/Introducao_JAVA/edit/master/Metodos%20e%20funcoes/).
3) **Tipo de retorno**: O método não retorna nada para quem o chamou, então devemos usar o tipo de retorno **void** em todos métodos.
4) **Nome**: Nome do método, para chamá-lo devemos usar esse nome.
5) **Parâmetros**: Os métodos e funções podem receber valores para fazer qualquer coisa com eles, no exemplo **digaMeuNome(String)** o programador passa o nome para ser mostrado na tela, e o programa mostra "Ola" junto com o nome que foi passado.
6) **Código a ser executado**: Aqui fica o código do método.

Exemplo de código completo, nele usarei somente JAVA puro. Se você usa o pacote IO verá que não tem muita diferença.<br/>
Todos os exemplos de métodos e funções estão [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/edit/master/Metodos%20e%20funcoes/Codigo).

```java
import java.util.Scanner;

public class Metodo{

    public static void digaOla(){
        System.out.println("Ola mundo!");
    }

    public static void digaMeuNome( String nome ){
        // Vou fazer esse print em java puro
        System.out.println( "Ola "+nome );
    }

    public static void main( String [] args ){

        // Variavel para ler do teclado
        Scanner sc = new Scanner( System.in );

        System.out.println("Digite seu nome");

        // le o nome
        String nome = sc.nextLine();

        // chama o Metodo
        digaMeuNome( nome );

        // tambem podemos chamar metodos sem parametro
        digaOla();
    }
}
```

Como podemos ver acima, existem 2 métodos: *digaOla* e *digaMeuNome*. Esses métodos não são executados se não chamarmos eles, teste comentando as linhas que chamam eles.

## Estrutura de uma função

Primeiro vou mostrar uma função:

```java
public static int somaInteiro( int a, int b ){
    int soma;

    // soma os 2 numeros
    soma = a+b;

    // devolve o valor da soma
    return ( soma );
}
```

Vemos que a estrutura de uma função é levemente diferente de um método, aqui não temos o **void** e sim um *int*, e também uma palavra chamada **return**. Vamos ver o que cada uma dessas estruturas são.

```java
public static int(1) somaInteiro ( int a, int b ){
    //codigo

    return (2)
}
```

Só vou mostrar as partes diferentes aqui, pois o resto é igual ao método.

1) **Tipo de retorno**: Diferente de um método, aqui temos que dizer qual tipo de variável vamos retornar, e aqui no caso estou retornando um *int*.<br/>
2) **Retorno**: Toda função deve devolver um resultado, então no final dela devemos colocar **return** com uma variável ou um valor dentro de *()*.

Exemplo de código, nele usarei somente JAVA puro. Se você usa o pacote IO verá que não tem muita diferença.<br/>
Todos os exemplos de métodos e funções estão [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/edit/master/Metodos%20e%20funcoes/Codigo).

```java
import java.util.Scanner;

public class Funcao{

    public static int somaInteiro( int a, int b ){
        int soma;

        // soma os 2 numeros
        soma = a+b;

        // devolve o valor da soma
        return( soma );
    }

    public static double pi(){
        return ( 3.14159265359 );
    }

    public static void main( String [] args ){

        // variavel para ler da tela
        Scanner sc = new Scanner( System.in );

        System.out.println("Digite um valor para A");

        // le o valor de A
        int a = sc.nextInt();

        System.out.println("Digite um valor para B");

        // le o valor para B
        int b = sc.nextInt();

        // chama a funcao soma
        // Eu passo as variaveis A e B para a funcao,
        // e o valor retornado vai ficar dentro de soma
        int soma = somaInteiro( a, b );

        System.out.println("O resultado da soma e': "+soma );

        // ou tambem posso chamar a funcao direto no print
        System.out.println("O valor de pi e': "+ pi() );
    }
}
```
