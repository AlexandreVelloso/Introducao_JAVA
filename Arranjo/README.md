# Arranjos ou *Arrays*

## O que é um Arranjo?

Arranjo (em inglês Array), é uma estrutura de dados que armazena uma coleção de elementos de tal forma que cada um dos elementos possa ser identificadp por, pelo menos, um índice ou uma chave.

## Declaração

Em Java, os arranjos são objetos que necessitam de iniciação. Isto é feito usando o operador _*new*_, que faz a instanciação do objeto, como no exemplo:

```java
/* 
  Modelo:
  tipo[] nomeVariavel = new tipo[numeroDePosicoes];
*/

int[] idade = new int[3]; // array que contem 3 idades
String[] nomes = new String[5]; // array de 5 nomes
double[] preco = new double[10]; // array que contem 10 precos
```

Quando declaramos o arranjo de idade, por exemplo, é criada essa estrutura, com o índice 0, como sendo o primeiro:

| 0 | 1 | 2 |
|---|---|---|
| 0 | 0 | 0 |


## Atribuindo Valores

Para atribuirmos valores ao arranjo, precisamos apenas do índice e o valor:

```java
idade[0] = 21;
idade[1] = 18;
nomes[0] = "Luiz";
precos[3] = 19.19;
```

A estrutura do arranjo de idade, por exemplo, ficaria assim:

| 0  | 1  | 2 |
|----|----|---|
| 21 | 18 | 0 |

## Imprimindo na tela os valores

Para imprimir os valores contidos em um arranjo, teríamos que utilizar uma estrutura de repetição, como o *for*, e o *.length*, para pegarmos todas as posições do array:

```java
for(int i = 0; i < idade.length; i++){
    System.out.print(idade[i] + " ");
}
```