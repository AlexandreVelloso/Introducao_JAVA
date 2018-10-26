# Recursividade

Essa seção é uma continuação direta de [métodos e funções](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Metodos%20e%20funcoes), então se você ainda tem dúvidas nessa parte, dê uma revisada.

## O que é recursividade?

Recursividade é quando definimos algo em função dele mesmo.

Exemplo de recursividade:<br>
![Compile](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Imagens/recursividade.gif)

Em programação fazemos isso quando temos um método ou função que se chama.<br>
Existem 2 exemplos muito comuns de recursividade: a função fatorial e a sequência de fibonacci.

### Fatorial

Fatorial é uma função matemática representada por **n!**, onde o fatorial de **n** é a multiplicação de todos os naturais menores ou iguais a **n**, excluíndo o 0, como mostra no exemplo a seguir:<br>
<br>
0! = 1<br>
1! = 1<br>
2! = 2\*1<br>
3! = 3\*2\*1<br>
4! = 4\*3\*2\*1<br>
5! = 5\*4\*3\*2\*1<br>
6! = 6\*5\*4\*3\*2\*1<br>
<br>
```
OBS: 0! é igual a 1 por definição.
```

Podemos observar que o fatorial do número 5 é igual a 5 vezes o fatorial do número 4.<br>
Assim podemos expressar o fatorial de qualquer número **n** como **n** multiplicado pelo fatorial de **n-1**.

```java
fatorial(n) = n * fatorial(n-1);
```

Acabamos de fazer uma função recursiva, pois para sabermos o fatorial de **n** devemos saber o fatorial de **n-1** e assim por diante.<br>

Ok, e agora, temos essa recursividade infinita?<br>
Não, pois toda recursividade deve ter um ponto de parada, esse ponto nós chamamos de **caso base**. O caso base é um valor de **n** em que sabemos a resposta para o seu fatorial. Como sabemos que **0! = 1**, esse vai ser o nosso caso base.<br>

Voltando ao fatorial, então podemos concluir que:

```
se n = 0 então
    fatorial(n) = 1 // caso base
senão
    fatorial(n) = n * fatorial(n-1) // passo recursivo
```

```
OBS: Essa função só funciona para N como um valor inteiro maior ou igual a 0
```

Pronto, agora temos um algorítimo de como fazer o fatorial de um número, agora vamos implementar isso em JAVA. O código completo está disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Recursividade/Codigo/Fatorial.java).

```java
public static int fatorial( int n ){
    int resultado;

    if( n == 0 ){
        resultado = 1; // caso base
    }else{
        resultado = n * fatorial( n-1 ); // passo recursivo
    }

    return resultado;
}
```

## Fibonacci

A sequência de Fibonacci já é definida de forma recursiva, ela diz que o Fibonacci de um número **n** é igual a soma do resultado dos 2 termos anteriores, a sequência é a seguinte:<br>
<br>
F(0) = 0<br>
F(1) = 1<br>
F(2) = F(0) + F(1) = 1<br>
F(3) = F(1) + F(2) = 2<br>
F(4) = F(2) + F(3) = 3<br>
F(5) = F(3) + F(4) = 5<br>
F(6) = F(4) + F(5) = 8<br>

Diferente da função fatorial, a sequência de Fibonacci têm 2 casos base: F(0) e F(1). Nesses 2 casos a gente sabe o resultado da função, e os outros nós devemos calcular a partir da base.<br>
Então o algorítimo é o seguinte:

```
se n = 0 então
    fib(n) = 0 // caso base
senão se n = 1
    fib(n) = 1 // caso base
senão
    fib(n) = fib(n-2) + fib(n-1) // passo recursivo
```

Agora vamos a implementação. Disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Recursividade/Codigo/Fibonacci.java)

```java
public static int fibonacci( int n ){
    int resultado;

    if( n == 0 ){
        resultado = 0; // caso base
    }else if( n == 1 ){
        resultado = 1; // caso base
    }else{
        resultado = fibonacci( n-2 ) + fibonacci( n-1 ); // passo recursivo
    }
}
```

## Palindromo

Um palindromo e uma palavra que pode ser lida de frente pra tras ou de tras para frente.
Alguns exemplos de palindromos sao:

- Ana 
- Otto
- Arara
- Kaiak
- O galo ama o lago
- Anotaram a data da maratona

Para se saber se uma palavra e um palindromo, fazemos a comparaçao de cada letra da palavra ou frase com o seu extremo oposto,
por exemplo:

OTTO - Se compara a primeira letra (O) com a ultima letra, que tambem e O, se elas forem iguais, se passa pra segunda letra e 
para a penultima letra, comparando assim todas as letras dos extremos para dentro ate que se chegue ma metade. 
O = O, passa para a proxima,
T = T, se finaliza.

Agora vamos a implementação. Disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Recursividade/Codigo/Palindromo.java)

```
public static boolean ehPalindromo(String str){

        // definir dados
        boolean result = false; 

        // chama metodo recursivo
        result = ehPalindromo( str, 0 );
        return( result );
    }// end ehPalindromo()

    public static boolean ehPalindromo(String str, int i)
    {
        // definir dados
        boolean result = true;
        int meio = str.length( )/2;
        char prim = ' ';
        char ult  = ' ';

        prim = str.charAt( i );
        ult  = str.charAt( str.length( ) - 1 - i ); 
        if( prim != ult )
        {
            result = false;
        }
        else
        {       
            if( i < meio )
            {
                result = ehPalindromo( str, i + 1 );
            }// end if
        }// end if
        return( result );
    }// end ehPalindromo()
    ```