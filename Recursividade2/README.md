# Recursividade Continuação

Na seção de [recursividade](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Recursividade) nós vimos como fazer uma função recursiva, com os exemplos de fatorial e Fibonacci.<br>
Agora nessa seção eu irei explicar como o computador faz a recursividade.

## Chamada de função

Antes de mostrar efetivamente uma recursividade funcionando, tenho que explicar o que acontece quando o computador chama uma função ou um método.<br>
Primeiro temos esse exemplo de código, disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Recursividade2/Codigo/Exemplo1.java):

```
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

```
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