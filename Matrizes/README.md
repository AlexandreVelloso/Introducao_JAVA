# Matrizes

### O que é uma matriz?

As matrizes ou chamados também de vetores bidimensionais, são estruturas de dados homogênea, ou seja representam um conjunto de valores do mesmo tipo. São individualizados entre si através de sua posição de linha e coluna dentro desse conjunto.

Exemplo de matriz 3x5:<br>
![Compile](https://github.com/KakaSena/Introducao_JAVA/blob/master/Imagens/Matriz3x5.png)

A linguagem Java não suporta arrays multidimensionais diretamente, mas é possível especificar array unidimensionais cujos elementos também são arrays unidimensionais, alcançando assim o mesmo efeito.

### Como declarar uma matriz?

Na declaração de matrizes deverão ser fornecidas, principalmente, o nome da matriz, o número de linhas e o número de colunas da matriz (sua dimensão), o tipo de dados que será armazenado na matriz e as variáveis que serão utilizadas como índices ou subscritos na individualização de um valor do conjunto. 

Por convenção, a referência m[i][j] corresponde ao elemento da “i-ésima” linha e “j-ésima” coluna do array bidimensional m. 

```java
int m[][] = new int[3][5]; //Declarando um array bidimensional 3 por 5 (3x5 = 15 elementos)
int a[][] = new int[i][j]; //Declarando um array bidimensional i por j 
```

### Operações com Matrizes

Considere o snippet abaixo como 

#### Mostrar Matriz

Para obter os valores de uma matriz, precisamos iterar sobre todos seus elementos, isso é feito com a ajuda de dois `for` um dentro do outro.
O primeiro `for` vai iterar sobre as linhas da matriz enquanto o segundo sobre as colunas.

```java
public static void mostraMatriz(int C[][])
    {
        for (int linha = 0; linha < C.length; l++ )
        {
            for (int coluna = 0; coluna < C.length; c++)
            {
                System.out.print(C[l][c] + "\t");
            }
        System.out.println();
        }
        
    }
```

#### Multiplicação de Matrizes

A multiplicação de matrizes é realizada de acordo com a seguinte condição: o número de colunas da 1ª matriz deve ser igual ao número de linhas da 2ª matriz. A operação deverá ser feita multiplicando os membros da linha da 1º matriz pelos membros da coluna da 2º matriz, onde os elementos devem ser somados, constituindo um único item posicional da matriz. 

O exemplo abaixo recebe duas matrizes como exemplo, possui uma variável `soma` e `multi` que servem como auxiliares.

```java
 public static int[][] multiMatriz(int x[][], int y[][])
    {
        int soma = 0;
        int multi = 0;
        
        int matriz[][] = new int[x.length][y[0].length];
        
        for (int linha = 0; linha < y[0].length; l++)
        {
            for (int coluna = 0; coluna < x.length; c++)
            {
                for (int m = 0; m < y.length; m++)
                {
                    multi = x[linha][m] * y[m][coluna];
                    soma = multi + soma;
                    
                }
            matriz[linha][coluna] = soma;
            multi = 0;
            soma = 0;
            }
        }
        return matriz;    
    }
```
#### Adição dde Matrizes

Para adicionarmos duas ou mais matrizes é preciso que todas elas tenham o mesmo número de linhas e de colunas. A soma dessas matrizes irá resultar em outra matriz que também terá o mesmo número de linhas e de colunas. Os termos deverão ser somados com os seus termos correspondentes.

O exemplo abaixo recebe duas matrizes como exemplo, possui uma matriz `z` auxiliar.


```java
public static int[][] somaMatriz(int x[][], int y[][])
    {
        //verificaçao para que as duas matrizes possuam mesmo número de linhas e colunas.
        if(x.length != y.length || x[0].length != y[0].length)
        {
          System.out.println("Matrizes com dimensões diferentes!");
               
        }
        
        int z[][] = new int[x.length][y.length];

        for (int l = 0; l < x.length ; l++)
        {
            for (int c = 0; c < x.length; c++)
            {
                z[l][c] = x[l][c] + y[l][c];
            }
            
        }
        return z  
    }
```


### Executar os códigos

Caso você deseja executar os códigos mostrados aqui você pode abrir os arquivos destinados a cada tipo de dado
que está nessa pasta, e copiá-los para o seu JGrasp, como [Matriz_Exemplo.java](https://github.com/AlexandreVelloso/Introducao_JAVA/blob/master/Matrizes/Codigo/Matriz_Exemplo.java), etc.

