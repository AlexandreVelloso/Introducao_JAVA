# Primeiro programa em java

## O que significa tudo isso?
Os programas em JAVA devem ter no mínimo esses comandos:

### classe
```
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

Se você está usando o pacote IO
```
import IO.*;

public class Primeiro{
  public static void main( String [] args ){
    IO.println("Coloque seu nome aqui");
  }
}
```

Se você está usando JAVA puro, ou seja sem o pacote IO
```
public class Primeiro{
  public static void main( String [] args ){
    System.out.println("Coloque seu nome aqui");
  }
}
```

### O que é o pacote IO?

Na 1 linha de codigo eu adiciono esse pacote ao programa, ele serve para facilitar a vida dos alunos quando quiserem mostrar algo na tela, ou ler uma informação do teclado

```
import IO.*;
```

Para mostrar algo na tela é simples, basta adicionar essa linha de código dentro do método main

```
IO.println("Mensagem");
```

Isso irá mostrar **Mensagem** na tela( sem o negrito ), tudo que estiver dentro das *""* será mostrado no terminal.
