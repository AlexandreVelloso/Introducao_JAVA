# Meu primeiro programa em java

## O que significa tudo isso?
Os programas em JAVA devem ter no mínimo esses comandos:

### classe
```java
public class Primeiro{
  ...
}
```

Nessa linha é criada uma classe, todo programa deve estar dentro de uma classe, e ela deve obrigatóriamente ter o mesmo nome do arquivo.
Tudo que está entre **{** e **}** está dentro da classe.

### main

Esse método( adicionar link para o que é método ) é a primeira coisa a ser feita no programa, ou seja, quando o programa inicia essas linhas de código dentro do main serão executadas. Elas são executadas de cima para baixo e cada linha por vez.

Exemplo: como mostrar o seu nome no terminal, substitua **Coloque seu nome aqui** pelo seu nome.

Como executar esse programa:
* Copie ele para um arquivo Primeiro.java dentro do JGrasp
* Compile ![Compile](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Imagens/Compile.png)
* Execute ![Execute](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Imagens/Execute.png)

Se você está usando o pacote IO:
```java
import IO.*;

public class Primeiro{
  public static void main( String [] args ){
    IO.println("Coloque seu nome aqui");
  }
}
```

Se você está usando JAVA puro, ou seja sem o pacote IO:
```java
public class Primeiro{
  public static void main( String [] args ){
    System.out.println("Coloque seu nome aqui");
  }
}
```

### O que é o pacote IO?

O pacote IO é um pacote feito pelo professor [Theldo Cruz Franqueira](http://lattes.cnpq.br/3356241223151750) que ajuda o aluno a mostrar mensagens na tela e pedir dados do teclado, mas como nem todos professores têm esse pacote eu vou ensinar dos 2 jeitos.

Na 1 linha de codigo eu adiciono esse pacote ao programa, e assim posso usar livrimente esse pacote.

```java
import IO.*;
```
