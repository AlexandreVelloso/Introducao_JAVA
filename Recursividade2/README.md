# Recursividade Continuação

Na seção de [recursividade](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Recursividade) nós vimos como fazer uma função recursiva, com os exemplos de fatorial e Fibonacci.<br>
Agora nessa seção eu irei explicar como o computador faz a recursividade.

## Chamada de função

Antes de mostrar efetivamente uma recursividade funcionando, tenho que explicar o que acontece quando o computador chama uma função ou um método.<br>
Primeiro temos esse exemplo de código, disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Recursividade2/Codigo/Exemplo1.java):

```java
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
```

Execute o código no seu computador e veja se a sua saída foi igual a minha:

```
Comecei o programa, entrei no main
Entrei no metodo 1
Entrei no metodo 2
Estou saindo do metodo 2
Estou saindo do metodo 1
Estou saindo do main
```

O que aconteceu nesse programa foi o seguinte:
* O programa inicia, todo programa inicia pelo *main*, e então mostra a mensagem **Comecei o programa, entrei no main**.
* O programa chama o *metodo1*, assim o *main* fica esperando o *metodo1* acabar de ser executado.
* O programa entra no *metodo1* e mostra a mensagem **Entrei no metodo 1**.
* Agora como eu chamei o *metodo2*, o *metodo1* tem que esperar o *metodo2* acabar de ser executado.

Agora o programa está com esses 3 métodos na pilha de execução:

```
Pilha de execução: A pilha mostra a ordem em que os métodos devem ser feitos para o computador,
quem está mais acima vai ser o primeiro a se executado.

Exemplo:
Imagina que você está lavando toda a louça da ceia de natal, e você tem uma pilha de pratos para lavar.
Você sempre pega o prato mais acima para lavá-lo primeiro, e assim vai lavando prato por prato.
Se alguém chega com um novo prato para você lavar, essa pessoa vai colocar esse novo prato no topo da pilha.
Com o computador não é diferente.
```

| Pilha de execução |
| --- |
| Método 2 |
| Método 1 |
| Main |

Continuando o programa:

* O programa executa o *metodo2*, e assim temos as mensagens **Entrei no metodo 2** e **Estou saindo do metodo 2**.
* Como o *metodo2* acabou, ele é retirado da pilha, e agora devemos continuar o *metodo1* de onde ele parou.
* O *metodo1* mostra na tela **Estou saindo do metodo 1** e acaba sua execução, saindo da pilha.
* Agora o metodo *main* continua de onde ele parou, e assim mostra na tela **Estou saindo do main**.

E assim terminamos a execução desse programa.

## Variáveis na pilha

Tomara que essa explicação da pilha de execução não ficou confuso para você, pois agora vou mostrar como ficam as variáveis do programa quando você chama uma função.<br>
Vou usar o método fatorial mostrado no exemplo anterior e como ele se comporta recursivamente. Código disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Recursividade2/Codigo/Fatorial.java)

```java
public static int fatorial( int n ){
    int resultado;

    System.out.println( "Entrei, n = "+n);

    if( n == 0 ){
       resultado = 1;
    }else{
        resultado = n * fatorial( n-1 );
    }

    System.out.println("Valor de n: "+n+" valor de resultado: "+resultado);

    return resultado;
}
```

Execute o código e veja se a sua saída é igual a minha:

```
Entrei, n = 3
Entrei, n = 2
Entrei, n = 1
Entrei, n = 0
Valor de n: 0 valor de resultado: 1
Valor de n: 1 valor de resultado: 1
Valor de n: 2 valor de resultado: 2
Valor de n: 3 valor de resultado: 6
O fatorial de 3 = 6
```

Note que a mensagem **Entrei, n = ...** mostrou os valores de **n** diminuindo até chegar em 0.<br>
Isso acontece porque quando o programa faz o teste **if( n == 0 )** e dá falso, ele executa a linha<br>
**resultado = n * fatorial( n-1 );**.<br>
Assim ele chama novamente a função fatorial, mas passando um valor menor para n, até chegar em 0.<br>
Quando finalmente esse valor de **n** é 0, o programa para de fazer chamadas recursivas, e assim essa execução de **n** acaba com o resultado = 1;<br>

Pilha de execução no momento em que a mensagem **Entrei, n = 0** foi mostrada

| Pilha de execução |
| --- |
| fatorial(0) |
| fatorial(1) |
| fatorial(2) |
| fatorial(3) |
| Main |

```
OBS: O valor das variáveis são independentes para cada chamada:

Quando o programa recebe fatorial(3), o valor de n nessa execução é 3,
mas quando é chamado o fatorial(2), o valor de n é totalmente independente do outro.
Podemos ver isso quando o programa mostra as mensagens

Valor de n: 0 valor de resultado: 1
Valor de n: 1 valor de resultado: 1
Valor de n: 2 valor de resultado: 2
Valor de n: 3 valor de resultado: 6

Vemos que o valor de n é diferente para cada mensagem.
```

Agora como vemos, a pilha está com todas as chamadas até 0.<br>
* O programa vai fazer a linha de comando **resultado = 1**, e acabar a execução do fatorial de 0, o retirando da pilha.
* A execução fatorial(1) continua de onde parou, ela parou quando chamou o **fatorial(n-1)**, com isso ela pode agora fazer a operação **resultado = n * fatorial(n-1)**, que resulta em 1, pois ela fez **resultado = 1 * 1**, e fatorial(1) sai da pilha.
* O fatorial(2) faz a operação **resultado = 2 * 1**, e sai da pilha.
* O fatorial(3) faz a operação **resultado = 3 * 2** e sai da pilha, voltando pro main.
* O main mostra a mensagem **O fatorial de 3 = 6** e acaba o programa.

Ufa, agora sim acabou de vez a recursividade, podemos ver que ela é símples de ser feita, mas computacionalmente talvez não seja a melhor alternativa, pois o computador tem que ficar trabalhando com a pilha de execução, e isso tem um certo tempo de execução.<br>
Concluimos que as funções recursivas são impressionantes, e como é feita tanta coisa que a gente não vê.<br>