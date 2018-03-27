# Tratamento de exceções

As vezes o seu programa pode gerar um erro de execução, esse erro pode ser por causa de uma entrada inválida de um usuário, ou talvez quando se tenta acessar uma posição inválida de um vetor, etc.

# Exemplo de exceção

Execute o código a seguir, disponível [aqui]().

```
public static void metodo(){

    String palavra = "banana";

    // aqui vai gerar uma excecao porque nao e' possivel
    // transformar a String banana em um inteiro
    int num = Integer.parseInt( palavra );
}
```