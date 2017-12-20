# Variáveis

### O que é uma variável?

Variável é um objeto que armazena um dado, e esse dado é um valor que pode ser de diversos tipos, inteiro( int ), real( double ), letra( char ), sequência de letras( String ), ou valor lógico( boolean ). Nessa unidade vamos abordar o que cada um desses dados pode armazenar e as operações que podem ser feitas com cada um deles.

### Como declarar uma variável
Antes de se usar qualquer variável é preciso declarar ela, isto é criá-la antes de usar. Para declarar uma variável é fácil, basta colocar o tipo da variável e depois o nome, e no final **;**, como nos exemplos abaixo:

```
int variavel1;
int x,y; // aqui estou declarando mais de uma variável na mesma linha, isto e' um comentario
double a;
String frase;
```

```
OBS: é possível se adicionar comentários no programa, esses comentários são linhas que não serão lidas
pelo programa, ela apenas servem para facilitar a leitura do programa depois por pessoas, como você mesmo
ou outros que irão ler o seu código. Existem 2 tipos de comentários:

* Comentário por linha: // , onde tudo que vier depois de // e estiver na mesma linha será um comentário
* Comentário por bloco: /* */, esse comentário faz a mesma coisa que o anterior, mas a diferença é que
ele pode ser feito em mais de uma linha, tudo que estiver entre /* e */ estará dentro do comentário.

OBS2: Eu não costumo colocar acentos e caracteres especiais( à,á,ã,â,ç ) em comentários,
mas eles podem ser colocados sem problemas.
```

### Restrições de nomes de variáveis
Existem algumas restrições quanto ao nome que você pode dar às variáveis:

* O nome de uma variável não pode começar com um número, como **double 1var;**
* O nome de uma variável não pode ter espaço, como **int minha variavel;**
* O nome de uma variável não pode ter caracteres especiais, como ( à,á,ã,â,ç,!,@,#,$,%,&,/,* )

### Executar os códigos

Caso você deseja executar os códigos mostrados aqui você pode abrir os arquivos destinados a cada tipo de dado
que está nessa pasta, e copiá-los para o seu JGrasp, como [Inteiro.java](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Variaveis/Inteiro.java), etc.

# Tipos de variáveis

## Inteiro
Esse tipo de variável armazena valores do tipo **inteiro** igual na matemática. As 4 operações básicas funcionam para esse tipo de dado normalmente, e ainda tem uma novidade, o módulo( resto da divisão ). como vou mostrar a seguir:

```
int a,b;
int r1,r2,r3,r4,r5; // essas sao as variaveis que vai guardar os resultados das operacoes

a = 10; // aqui eu estou colocando o valor 10 na variavel a
b = 3;

// adicao
r1 = a + b;
// subtracao
r2 = a - b;
// multiplicacao
r3 = a * b;
// divisao
r4 = a / b;
// modulo
r5 = a % b;

/*

Esse e' um comentario em bloco, entao o programa nao vai executar esse trecho

r1: 13
r2: 7
r3: 30
r4: 3
r5: 1
*/
```

### Divisão
Para a divisão existe um pequeno detalhe, se você fazer a divisão de 2 valores e armazená-la em uma variável do tipo inteiro
o resultado vai ser o valor sem a parte decimal, como no exemplo abaixo:<br />
10/3 é igual a **3.33333333333**, e como a variável **r4** é do tipo inteiro, o valor salvo nela será **3**.

### Módulo( Resto da divisão )
Também existe uma operação que chamamos de módulo, ela serve para pegar o valor do resto de uma divisão inteira. OBS: essa operação só funciona para números inteiros.<br />
Como no exemplo de 10/3, a divisão inteira dá como resultado 3( como visto acima ), e o **resto** da divisão é **1**, então o valor de **c** será **1**.

## Double( Real )
Esse tipo de variável armazena valores do tipo **real** igual na matemática. As 4 operações básicas funcionam para esse tipo de dado normalmente. como vou mostrar a seguir:

As operações com os número do tipo double são iguais às do tipo inteiro, com a exceção da operação de módulo que não existe com esse tipo de dado.<br />

```
double a,b;
double r1,r2,r3,r4; // essas sao as variaveis que vai guardar os resultados das operacoes

a = 10.5;
b = 3.14;

// adicao
r1 = a + b;
// subtracao
r2 = a - b;
// multiplicacao
r3 = a * b;
// divisao
r4 = a / b;

/*

Esse e' um comentario em bloco, entao o programa nao vai executar esse trecho

r1: 13.64
r2: 7.36
r3: 32.97
r4: 3.34394904459
*/
```

### Divisão
Também existe uma diferença na divisão, pois como esse tipo de dado pode guardar valores decimais( depois da vírgula ) a variável **r4** receberá
o valor **3.34394904459**.

## Char( Caractere )
Esse tipo de variável armazena valores dentro da [tabela ascii](http://ic.unicamp.br/~everton/aulas/hardware/tabelaASCII.pdf), não se preocupe sobre ela,
mas o que você deve saber é que esse tipo de dado armazena somente 1 caractere, como letra, número, caracteres especiais, etc.<br />
Com esse tipo de variável não é possível fazer nenhuma das operações básicas com esse tipo de dado sem fazer uma [conversão de tipo](), pois eles são caracteres.

```
// Declarar variaveis
char c1,c2,c3;

// Dar valor as variaveis, note que o valor de um char deve estar entre aspas simples: ''
c1 = 'a';
c2 = '0';
c3 = '$';
```

```
Note que o valor de um char deve estar entre aspas simples: ''. Deve conter apenas um caractere,
e não pode ser vazio: ''.

OBS: '' é diferente de ' ', pois no segundo caso é um caractere espaço
```

## String
Esse tipo de variável armazena valores literais, ou seja uma sequência de caracteres, como nomes, texto, texto com números, e todos esses tipos de combinações. Com esse tipo existe uma operação básica, a concatenação.

```
String str1, str2, str3;
int idade;
String mensagem;

// valor de str1
str1 = "Ola meu nome e' ";
// valor de str2
str2 = "Alexandre";
// valor de str3
str3 = " e a minha idade e' "
// valor de idade
idade = 21;

mensagem = str1 + str2 + str3 + idade;

/*
Esse e' um comentario em bloco, entao o programa nao vai executar esse trecho

mensagem = Ola meu nome e' Alexandre e a minha idade e' 21
*/
```

### Concatenação
Esse tipo de operação junta 2 ou mais Strings para formar outra. Como no exemplo anterior eu juntei 3 **Strings** e um **int**, no final dessa operação o valor final será uma **String**.

```
Posso concatenar String com qualquer tipo de dado, e o valor final será uma String.
```

```
Note que o valor da String, diferente do char deve ser dado entre aspas duplas: "".
Na String o valor pode ser vazio.
```

## Boolean
