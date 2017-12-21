# Converssão de tipo ou *type casting*

### O que é converssão de tipo?
Converssão de tipo, também chamado de *type casting* em inglês, é quando um programador transforma uma variável, ou dado em outro tipo, como int para char, String para int, int para double, e assim vai. Nesse tutorial irei abordar como se fazer essas operações usando o pacote IO, e o java puro.

```
OBS: com o java puro podem ocorrer erros se você tentar converter uma letra para int,
e com java puro pode se tratar isso, mas essa parte vai ser assunto para outra unidade.
```

Se você quiser ver a unidade de tratamento de erros [clique aqui](CONVERSSAO.md)

## Usando pacote IO
Usando o pacote IO as converssões de String para os outros tipos ficam mais simplificadas, e já estão com o tratamento de erro implementadas, a diferença do pacote IO para o java puro é somente esse tipo String para todos outros, o resto estará na secção de JAVA puro.

### String para todos os outros
Para se fazer a converssão de String para int é bem simples, como mostrado a seguir:

```
// Note que 123456 e' uma String e nao um numero inteiro pois esta entre ""
int numero = IO.getint( "123456" );

// tambem pode se colocar uma variavel String dentro do IO.getint()
String numero_str = "31415926"
int numero2 = IO.getint( numero_str );
```

Como todas as outras converssões são praticamente iguais, vou só mostrá-las a partir de agora

```
double pi = IO.getDouble( "3.1415926" );
```

A conversão para char irá pegar somente o 1 caractere da String

```
char letra = IO.getchar( "Alexandre" );
```

## Usando JAVA puro

### String para todos os outros
Para se fazer a converssão de String para int é bem simples, como mostrado a seguir:

```
// Note que 123456 e' uma String e nao um numero inteiro pois esta entre ""
int numero = Integer.parseInt( "123456" );

// tambem pode se colocar uma variavel String dentro do IO.getint()
String numero_str = "31415926"
int numero2 = Integer.parseInt( numero_str );
```

A conversão para double é muito parecida com a de int

```
double pi = Double.parseDouble( "3.1415926" );
```

A converssão para char é interessante, por que não existe o [método](*) parseChar então temos outra alternativa:

```
// como um char e' somente 1 caractere, eu posso usar esse jeito usando o metodo charAt(),
// nao se preocupe se voce nao entender o que e' um metodo ainda, isso sera explicado no futuro
char letra = "Alexandre".charAt(0);

// Voce tambem pode usar uma variavel que contem a String e pegar o caractere
String mensagem = "Alexandre";
char letra2 = mensagem.charAt(0);
```

A converssão para char vai pegar somente o 1 caractere da String e passar ele para **char**, e como a gente vai ver mais pra frente a String começa da posição 0 e não na posição 1, por isso que eu coloquei charAt(**0**)

### Qualquer um para String

A partir daqui o pacote IO não nos dá mais suporte, então para os 2 casos devemos usar esse tipo de abordagem. A converssão de qualquer um dos tipos de dados para String é igual, vamos aos exemplos.

```
// int para String
String str1 = "" + 123456;

// double para String
String str2 = "" + 3.1415962;

// char para String
String str3 = "" + '%';

/*
Eu coloquei os valores dentro de "" para mostrar que sao Strings agora

str1: "123456"
str2: "3.1415962"
str3: "%"
*/
```

Nesses casos eu *concateno* uma String vazia com o valor que eu quero, repare que a operação de concatenação é uma soma, então se eu quiser fazer uma soma entre 2 ou mais números e depois concatenar eu devo colocar um **()** para trocar a precedência das operações, isso significa que a soma será feita antes da concatenação, igualmente na matemática que devemos resolver o **()** antes de resolver o que está fora.

```
String resultado = "" + ( 1 + 2 + 4 );

/*
resultado: "7"
*/
```

### int para double


### double para int

### int para char

## char para int
