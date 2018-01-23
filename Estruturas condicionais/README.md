# Estruturas condicionais

Uma estrutura condicional é a parte do código que você decide entre fazer uma tarefa ou outra. Como no fluxograma mostrado a seguir.<br/>
![Fluxograma](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Imagens/fluxograma.png)

Como podemos ver aqui, esse fluxograma tem 3 possíveis finais: mostrar **-1**, mostrar **a ÷ b**, ou mostrar **0**. Todos eles dependem da entrada que o usuário der para o programa.<br />
Se você não viu a secção de entrada de dados [clique aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Entrada%20de%20dados).<br />
Se transformarmos esse fluxograma para código ele ficaria assim, todos os exemplos de estruturas condicionais estão [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Estruturas%20condicionais/Codigo):

```
Observação: como o fluxograma não fala qual tipo de variável deve ser usada, irei usar o tipo double
```

### Pacote IO
```
double a = IO.readdouble("Digite um valor para A\n");
double b = IO.readdouble("Digite um valor para B\n");

if( b == 0.0 ){
    IO.println("-1");
}else if( a/b > 0 ){
    IO.println( a/b );
}else{
    IO.println( "0" );
}
```

### JAVA puro
```
Scanner sc = new Scanner( System.in );

System.out.println("Digite um valor para A");
double a = sc.nextDouble();

System.out.println("Digite um valor para B");
double b = sc.nextDouble();

if( b == 0.0 ){
    System.out.println("-1");
}else if( a/b > 0 ){
    System.out.println( a/b );
}else{
    System.out.println( "0" );
}
```

```
Observação: Como a variável b é do tipo double, para testar ela com o número 0 eu tenho que colocar 0.0
Se ela fosse um int eu colocaria somente 0
Se ela fosse um char eu colocaria '0'
Se ela fosse uma String eu colocaria "0"
Se fosse um boolean eu colocaria true, ou talvez false
```

As estruturas condicionais funcionam assim:
1) O programa vem executando e quando chega em um if ele testa se a condição dentro dele é verdadeira, nesse case se b é igual a 0.
* Se b for igual a 0 o programa mostra na tela **-1**. E sai dos *IFs*
* Senão, testa a condição 2
2) O programa aqui testa se a divisão de a por b é maior que 0.
* se isso for verdade o programa mostra **a/b** na tela. E sai dos *IFs*
* senão vai para o 3
3) Se nenhuma das 2 condições anteriores forem verdadeiras o programa não precisa testar nada, e já mostra **0** na tela.

## Comandos de comparação

Os comandos de comparação são bem intuitivos:

1) Igual ( == )
2) Diferente ( != )
3) Maior ( > )
4) Menor ( < )
5) Maior igual ( >= )
6) Menor igual ( <= )

Também é possível testar mais de 1 coisa no mesmo *if*, usando os operadores **&&** e **||**, esses comparadores foram explicados com a variável boolean, esse link pode ser acessado [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Variaveis).<br />
Exemplos:
1) if( (a == b ) && ( b == c ) )
* Testa se **a** é igual a **b** E **b** é igual a **c**
2) if( (a == b) || ( b == c ) )
* Testa de **a** é igual a **b** OU **b** é igual a **c**

Eu coloquei as condições dentro de *()* pois eu acho que ficam mais legíveis, mas eles não são necessários.<br/>
<br/>

Também um comando de comparação é o **!**, ele significa **não**, ele serve para negar uma condição, como:

1) if( !(a == b) )
* essa linha significa **não a==b** ou seja, a mesma coisa que **a!=b**.
