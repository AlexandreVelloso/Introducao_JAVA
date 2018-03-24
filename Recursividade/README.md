# Recursividade

Essa seção é uma continuação direta de [métodos e funções](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Metodos%20e%20funcoes), então se você ainda tem dúvidas nessa parte, dê uma revisada.

## O que é recursividade?

Recursividade é quando definimos algo em função dele mesmo. Em programação fazemos isso quando temos um método ou função que se chama.<br>
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

```
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

```
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