# Como Transformar um loop iterativo em uma recursividade

Se você está se perguntando o que é um loop iterativo, não se preocupe, é uma coisa bem simples e que você já viu aqui. Um loop iterativo nada mais é do que qualquer estrutura de repetição que eu já mostrei anteriormente: **for**, **while**, **do/while**.<br>
Essa nova unidade não tem valor prático, somente valor didático, pois sabemos que se você consegue fazer uma operação usando um *for* em vez de um método recursivo, dê preferência para o *for*.<br>

## Loop para metodo recursivo
Como eu mostrei anteriormente [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Loop) ambos for e o while tem 4 partes, usar essas partes para mostrar como é a transição dele para o método. Código disponível [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Transformar%20loop%20em%20recursividade/Codigo/Exemplo.java)<br>

For básico
```
for( int i = 0; i < n; i++ ){
    // operacao
}
```

While básico
```
int i = 0;
while( i < n ){
    // operacao
    i++;
}
```

Método recursivo equivalente
```
public static void metodoR( int i, int n ){
    if( i < n ){
        // operacao
        metodoR( i + 1, n );
    }
}

// exemplo de como chamar o metodoR: metodoR( 0,n );
```

```
OBS: Para chamar o metodoR na primeira vez, eu tive que passar
i como 0.

OBS2: a estrutura de um for e um while são bem parecidas,
os 2 geram um metodo recursivo identico
```

Pronto, agora você pode transformar qualquer loop em um método recursivo. Nesses exemplos eu fiz somente métodos que repetem n vezes, mas sinta-se à vontade para fazer os mais criativos métodos recursivos.