## Variáveis

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

## Tipos de variáveis

### Inteiro
Esse tipo de variável armazena valores do tipo inteiro igual na matemática. As 4 operações básicas funcionam para esse tipo de dado normalmente. como vou mostrar a seguir:

**Adição**

```
// declarar variaveis
int a,b,c;
// dar um valor para a
a = 5;
// dar um valor para b
b = 7;
// somar o valor de a com b e guardar em c
c = a + b;
```

**Subtração**
```
// declarar variaveis
int a,b,c;
// dar um valor para a
a = 5;
// dar um valor para b
b = 7;
// subtrair o valor de a com b e guardar em c
c = a - b;
```

**Multiplicação**
```
// declarar variaveis
int a,b,c;
// dar um valor para a
a = 5;
// dar um valor para b
b = 7;
// multiplicar o valor de a com b e guardar em c
c = a * b;
```

**Divisão**

Para a divisão existe um pequeno detalhe, se você fazer a divisão de 2 valores e armazená-la em uma variável do tipo inteiro
o resultado vai ser o valor sem a parte decimal, como no exemplo abaixo:<br />
5/7 é igual a **0.71428571428**, e como a variável **c** é do tipo inteiro, o valor salvo nela será **0**.

```
// declarar variaveis
int a,b,c;
// dar um valor para a
a = 5;
// dar um valor para b
b = 7;
// dividir o valor de a com b e guardar em c
c = a / b;
```

**Módulo( Resto da divisão )**

Também existe uma operação que chamamos de módulo, ela serve para pegar o valor do resto de uma divisão inteira. OBS: essa operação só funciona para números inteiros.<br />
Como no exemplo de 5/7, a divisão inteira dá como resultado 0( como visto acima ), e o **resto** da divisão é **5**, então o valor de **c** será **5**.

```
// declarar variaveis
int a,b,c;
// dar um valor para a
a = 5;
// dar um valor para b
b = 7;
// resto da divisão de a por b
c = a % b;
```

### Double( Real )

### Char( Caractere )

### String

### Boolean
