# Primeiro programa em java

## O que significa esse tudo isso?
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

Esse método( adicionar link para o que é método ) é a primeira coisa a ser feita no programa, ou seja, quando o programa inicia as linhas de código lá dentro serão executadas.

Exemplo: como mostrar o seu nome no terminal, substitua **Coloque seu nome aqui** pelo seu nome.

Como executar esse programa:
* Copie ele para um arquivo Primeiro.java dentro do JGrasp
* Compile ![Compile](http://url/to/img.png)
* Execute ![Execute](http://url/to/img.png)

```
import IO.*;

public class Primeiro{
  public static void main( String [] args ){
    IO.println("Coloque seu nome aqui ");
  }
}
```

### O que é o pacote IO?

Na 1 linha de codigo eu adiciono esse pacote ao programa, ele serve para facilitar a vida dos alunos quando quiserem mostrar algo na tela, ou ler uma informação do teclado

```
import IO.*;
```

Para mostrar algo na tela é simples, basta adicionar essa linha de código

```
IO.println("Mensagem");
```

Isso irá mostrar **Mensagem** na tela( sem o negrito ), tudo que estiver dentro das *""* será mostrado no terminal.
