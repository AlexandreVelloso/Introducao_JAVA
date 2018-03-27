# Tratamento de exceções

As vezes o seu programa pode gerar um erro de execução, esse erro pode ser por causa de uma entrada inválida de um usuário, ou talvez quando se tenta acessar uma posição inválida de um vetor, etc.

## Exemplo de exceção

Execute o código a seguir, disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Tratamento%20de%20excecoes/Codigo/Erro1.java).

```
public static void metodo(){

    String palavra = "banana";

    // aqui vai gerar uma excecao porque nao e' possivel
    // transformar a String banana em um inteiro
    int num = Integer.parseInt( palavra );
}
```

Erro completo:
```
Exception in thread "main" java.lang.NumberFormatException: For input string: "banana"
        at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.base/java.lang.Integer.parseInt(Unknown Source)
        at java.base/java.lang.Integer.parseInt(Unknown Source)
        at Erro1.metodo(Erro1.java:6)
        at Erro1.main(Erro1.java:10)
```

Vamos analisar cada linha do erro:
1) **Exception in thread "main" java.lang.NumberFormatException: For input string: "banana"**
    * Esse erro diz que ocorreu uma exceção na *thread main*, **thread main** não significa método main, não se preocupe com thread, você verá o que é isso mais para frente.
    * O nome do erro é **java.lang.NumberFormatException**, isso quer dizer que ele é um erro feito pelo java. A gente só precisa saber o que significa **NumberFormatException**. Se prestarmos atenção ele quer nos dizer que o número que colocamos para ser transformado em *int* está escrito de forma errada, e realmente está, por que não existe nenhum número que se escreve como banana.
    * **For input string: "banana"** e também observe que o JAVA nos deu qual foi o valor do int que nós passamos e deu problema.
    * Para não acontecer esse erro nós podemos alterar a String para 10,20,45,... qualquer número *int*.
2) Como mostrado na unidade [Recursividade 2](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Recursividade2) a partir da linha 2 é mostrada a pilha de chamada de métodos, então quanto mais em cima na pilha, mais perto do erro a gente chega.
    * O erro aqui é **at java.base/...** como a parte de java.base não é nossa, não devemos nos preocupar com as linhas que isso ocorre
3) **at java.base/...** não é nosso problema, erro no Integer.parseInt
4) **at java.base/...** não é nosso problema, erro no Integer.parseInt
5) **at Erro1.metodo(Erro1.java:6)** Agora sim, essa classe é nossa, então vamos ver a linha 6 do código
    * A linha 6 é a seguinte: **int num = Integer.parseInt( str );** como sabemos das linhas acima, o erro está no método Integer.parseInt, e também sabemos que o erro foi causado pelo *input* banana.
    * podemos concertar esse input para não causar o erro, ou tratar essa exceção. Veremos o tratamento abaixo.
6) **at Erro1.main(Erro1.java:10)** Erro na linha 10.
    * Podemos ver que na linha 10 o **metodo** é chamado