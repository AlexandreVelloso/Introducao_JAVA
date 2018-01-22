# Laços de repetição ou *Loops*

Muitas vezes em nossos programas precisamos fazer um trecho de código repetir várias vezes.<br />
Imagine que o usuário deseja mostrar a mensagem "Bom dia" na tela 10 vezes, um jeito símples com o que a gente sabe até agora é mostra na tela 10 vezes a mensagem, usando o *System.out.println* ou *IO.Println*.
```
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
System.out.println("Bom Dia");
```
Bom, isso funciona, mas e se o cliente depois pedir pra repetir 1000000 vezes?<br />
É óbvio que não temos que copiar e colar 1000000 vezes o mesmo comando, então para isso servem os laços de repetição.<br />
Existem 3 deles *for*, *while*, e *do/while*, nessa seção vou abordar todos os 3.

## while

Esse laço é bem simples, ele repete um trecho de código enquando uma condição for verdadeira.
```
while( nao_estou_formado ){
  estude();
}

/*
OBS: Esse é só um exemplo, esse código não funciona
*/
```
Olhando o laço, enquanto a condição **nao_estou_formado** for verdadeira, o trecho de código **estude();** vai ser executado, esse laço de repetição funciona da seguinte maneira:
1) Testa se a condição é verdadeira
2)
    * Se sim: execute o código dentro dele e volte para o passo 1
    * Se não: saia do while

Agora um exemplo funcional, mostrar os número inteiros entre 1 e 10 em ordem crescente

```
// comeco com o número 1
int num = 1;

// enquanto o número é menor ou igual a 10, ou seja, o 10 também vai aparecer
while( num <= 10 ){
  System.out.println( num );
  // Ou se você usa o pacote IO descomente a linha abaixo
  //IO.println( num );

  // Eu devo alterar o a variável num de 1 em 1
  num = num + 1; // aqui a variável é somada em 1 unidade
}

/*
Saída:
1
2
3
4
5
6
7
8
9
10
*/
```

## do/while

O laço *do/while* é muito parecido com o mostrado *while* acima, mas a diferença desse é que ele executa o código dentro do loop pelo menos 1 vez, e depois ele testa se a condição é verdadeira.<br />
Aqui eu vou usar o mesmo caso mostrado no while, o caso do estudante que tem que estudar para formar:

```
do{
  estude();
}while( nao_estou_formado );

/*
OBS: Esse é só um exemplo, esse código não funciona
*/
```

Acima vemos uma leve diferença no código, agora o teste foi para baixo, isso significa que o estudante irá estudar, e depois vai verificar se está formado.<br />
Uma leve explicação do laço:

1) Executa as instruções dentro do loop
2) Testa se a condição é verdadeira
    * Se sim, volte para o caso 1
    * Se não, saia do loop

 Vamos ver um exemplo abaixo para o mesmo programa de mostrar os números de 1 a 10 em ordem crescente.

```
// comeco com o numero 1
int num = 1;

do{
    System.out.println( num );
    // Ou se você usa o pacote IO descomente a linha abaixo
    //IO.println( num );

    // Eu devo alterar o a variável num de 1 em 1
    num = num + 1; // aqui a variável é somada em 1 unidade
}while( num <= 10 );

/*
Saída:
1
2
3
4
5
6
7
8
9
10
*/
```

## for

O laço de repetição *for* tem uma aparência diferente dos 2 anteriores, ele é muito bom para repetir um bloco de instruções quando sabemos o número de vezes que elas devem acontecer.<br />

Esse loop não se encaixa ao problema do aluno que deve estudar para formar, pois não sabemos o número de vezes em que ele deve estudar para formar, mas ele é muito bom para mostrar os número de 1 a 10 em ordem crescente.<br />
Vamos ao exemplo:

```
for( int num = 1; num <= 10; num = num + 1 ){
    System.out.println( num );
    // Ou se você usa o pacote IO descomente a linha abaixo
    //IO.println( num );
}

/*
Saída:
1
2
3
4
5
6
7
8
9
10
*/
```

O laço de repetição *for* tem 4 partes:
```
for( 1; 2; 4 ){
    3
}
```

1) primeiro ele inicializa a variável contadora, no *while* a gente tinha que inicializar ela fora, mas aqui podemos fazer isso na linha do *for*.<br />
Essa é a primeira parte executada nesse laço, e é executada somente 1 vez.

2) Aqui temos a condição, ela é igual a do *while* e *do/while*, o programa executa o bloco de instruções **3** enquanto essa condição é verdadeira.<br />
Essa é a segunda parte executada no laço.

3) Aqui temos o bloco de instruções. Ela só é executada se o comando **2** for verdadeiro.<br />
Quando esse bloco termina ele vai para o passo **4**.

4) Por último temos o incremento, essa parte do código muda o valor da variável contadora.<br />
Nos outros laços um comando igual a esse é colocado no final do bloco de instruções.<br /> Essa é a 4 parte executada no programa. Depois de executar o bloco **3** o programa incrementa o valor de num adicinando 1 ao valor antigo, e depois volta para o passo **2**.
