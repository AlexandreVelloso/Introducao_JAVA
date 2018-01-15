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
2) Se sim: execute o código dentro dele e volte para o passo 1
3) Se não: saia do while

Agora um exemplo funcional, mostrar os número inteiros entre 1 e 10

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
