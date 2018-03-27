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

## Como tratar uma exceção

As exceções são facilmente tratadas usando um comando chamado **try/catch**. Esse comando executa o código dentro dele normalmente, mas se algum comando dentro do bloco causar uma exceção o **catch** pega ela, e não deixa o programa parar de executar.

Exemplo, código disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Tratamento%20de%20excecoes/Codigo/Erro2.java):
```
public static void metodo(){
       
    String str = "banana";

    try{
        int num = Integer.parseInt( str );
    }catch( NumberFormatException nfe ){
        System.out.println("Tratei a excecao, e nao deixei o programa parar de funcionar");
    }

    System.out.println("Fim do metodo");
}
```

Agora quando executamos o programa vemos que ele gera a seguinte saida:

```
Tratei a excecao, e nao deixei o programa parar de funcionar
Fim do metodo
```

Diferente do programa anterior, esse mostrou a mensagem **Fim do metodo**, pois quando o erro foi tratado aqui, e o programa não teve sua execução parada.

## Try/catch

O comando try/catch tem a seguinte estrutura:

```
try{
    (1)
}catch( (2) ){
    (3)
}finally{
    (4)
}
```

1) Comando(s) que pode(m) causar uma exceção
2) Aqui nessa parte você coloca a exceção que esse(s) comando(s) pode(m) causar, se você não saber qual ele pode causar, ou apenas estiver com preguiça de colocar todas, você pode colocar **Exception e** nessa parte. Assim ele vai tratar qualquer tipo de exceção
3) Código que vai ser executado quando for gerada a exceção. Pode ser uma mensagem, ou o que você quiser
4) O finally é opcional, ele é executado independente do programa ter executado o bloco (3) ou não. Vou mostrar um exemplo bom de execução do finally a seguir.

Outro exemplo de try/catch, código disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Tratamento%20de%20excecoes/Codigo/Erro3.java):

```
Scanner sc = new Scanner( System.in );

try{
    
    System.out.println( "Digite um numero inteiro" );
    int num = sc.nextInt();
    System.out.println( "Valor lido: "+num );

}catch( Exception e ){
    System.out.println( "Valor invalido, o valor nao foi lido" );
}finally{
    sc.close();
    System.out.println( "Fechei o Scanner" );
}
```

Saída 1, usuário digitou um número correto
```
Digite um numero inteiro
4
Valor lido: 4
Fechei o Scanner
```

Saída 2, o usuário digitou uma string
```
Digite um numero inteiro
letra
Valor invalido, o valor nao foi lido
Fechei o Scanner
```

Devemos fechar o Scanner depois de usá-lo. Se você não fazer isso não dá erro no seu código, mas é mais seguro fechar.<br>
Com esse exemplo podemos ver que o bloco **try/catch** pode ser usado para tentar evitar erros de execução. Ele é usado quando existem erros que você não pode prever, como entrada inválida do usuário, entre outros.

## Tipos mais comuns de exceções

Se você procurar na internet vai achar centenas de tipos de exceção, mas o meu propósito aqui não é mostrar todas nesse tutorial, somente as que mais acontecem, e elas são as seguintes:

* **NullPointerException**: Quando você tenta acessar atributos ou métodos de um objeto nulo.
    * Scanner sc = null;
    * sc.nextInt();
* **NumberFormatException**: Mostrado acima. Quando se tenta converter uma valor inválido.
    * Double.parseDouble( "invalido" );
* **ArrayIndexOutOfBoundsException**: Esse erro acontece quando você tenta acessar uma posição inválida em um array, como uma posição maior do que o tamanho, ou uma posição negativa.
    * int[ ] array = new int[3];
    * array[4] = 0;