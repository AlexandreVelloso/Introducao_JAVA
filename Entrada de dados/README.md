# Entrada de dados do teclado

Como o usuário entra com valores no nosso programa? nessa secção vamos ver como pegar valores vindos do teclado. Teremos 2 tipos de entradas: usando o pacote IO e usando java puro.

## Usando pacote IO
O pacote IO foi feito para simplificar a vida do estudante, nessa parte de pedir valores do teclado ele simplifica bastante. Lembre que antes de todos os programas que usam o pacote IO deve ter a linha **import IO.*;**

### int
Para ler um valor inteiro do teclado usamos a [função*](https://github.com/AlexandreVelloso/Introducao_JAVA/edit/master/Entrada%20de%20dados/README.md) *readint*
```
// Somente ler o valor
int num1 = IO.readint();

// Mostrar na tela uma mensagem e ler o valor
int num2 = IO.readint( "Digite um valor inteiro" );

/*
OBS:
No 1 caso o programa vai ficar parado esperando o usuário digitar o valor, se o usuário não saber o que é
para fazer ele pode achar que o programa bugou.
No 2 caso o programa mostra uma mensagem na tela, e ai o usuário vai saber que é para digitar um
valor inteiro do teclado.
Se o usuário digitar algo que não seja um int, como uma letra, string, ou double o valor armazenado será 0.
Esse padrão foi feito pelo professor Theldo.
*/
```

Como os outros tipos são bem parecidos com esse eu vou somente colocar os comandos

### double
```

```

### char
```

```

### String
```

```

### boolean
```

```

## Usando JAVA puro
