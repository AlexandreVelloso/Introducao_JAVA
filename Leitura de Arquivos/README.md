# Leitura de Arquivos em Java. 



​	Frequentemente precisamos ler arquivos de texto e para serem processados em lote. Os computadores utilizam os arquivos como estruturas de dados para armazenamento de longo prazo de grandes volumes de dados. Dados mantidos em arquivos são chamados de dados persistentes porque eles existem além da duração da execução do programa em dispositivos de armazenamento secundário como disquete, disco rígido, entre outros.

​	Programas em Java implementam processamento de arquivos utilizando as classes do pacote *Java.io* ou utilizando a classe *Scanner* do pacote *Java.util.* 

## Utilizando a classe Scanner & FileReader

Para começar é necessário criar uma instância tanto de *scanner* quanto de *filereader* , vale notar que ao instanciar um objeto do tipo *FileReader* passamos o endereço e o nome do arquivo em que estamos trabalhando. (Caso tenhamos somente o nome do arquivo, significa que o arquivo está no mesmo local que o nosso programa em Java).

Nota-se que é necessário criar tratamento de exceção para cuidar de erros durante uma leitura de arquivos, logo usaremos try_catch em nosso exemplo. 

```java
        try {
            File file = new File("teste.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException erro) {
            System.out.println("Oh! Arquivo não encontrado.");
            erro.printStackTrace();
        }
        
```

Agora iremos ler o conteúdo do arquivo *teste.txt*

Para leitura do conteúdo utilizamos os métodos *.hasNext()* ou *.hasNextLine()* que realizam a leitura de uma palavra por vez ou de uma linha por vez. 

Este tipo de leitura deve seguir a seguinte estrutura: 
```java
while (scanner.hasNextLine()){
    System.out.println(scanner.nextLine());
}
scanner.close();
```

Uma vez que terminamos de realizar as nossas manipulações em um arquivo, seja de leitura ou de escrita **(material para outro tutorial)**, é preciso fechar o arquivo para que o mesmo não fique aberto durante o programa. 

## Utilizando pacote de classes Java.io

De forma similar ao realizado com Scanner, nós iremos instanciar as classes que precisaremos para leitura do arquivo e necessitaremos de realizar um tratamento de exceção.  A principal diferença entre os dois é que o *BufferedReader* simplesmente lê o arquivo e te dá o conteúdo, caractere por caractere, enquanto o *Scanner* é uma ferramenta mais complexa capaz de “interpretar” o conteúdo, separando por delimitadores e convertendo para outros tipos (numérico, por exemplo).

```java

try {
    FileReader file = new FileReader("teste.txt");
    BufferedReader br = new BufferedReader(file);
    String linha = br.readLine();
    while (linha != null){
        System.out.println(linha);
        linha = br.readLine();
    }
    br.close();
    } catch (IOException erro) {
        System.out.println("Oh! Arquivo não encontrado.");
        erro.printStackTrace();
}
```