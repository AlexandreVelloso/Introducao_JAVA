# Switch/case

O *switch/case* é um tipo de estrutura parecida com as estruturas condicionais, por que você escolhe qual parte do código vai ser feita, mas eu não coloquei ele na mesma secção pois ele não faz comparação.<br />
Esse tipo de estrutura é muito útil quando você por exemplo tem um menu com algumas opções e quando o usuário escolher uma delas ele vai para a parte de código que as executa, no exemplo a seguir o usuário irá digitar o dia da semana( 1 a 7 ), e o programa vai mostrar na tela o dia da semana correspondente.<br />

```
Criar um programa que leie um número e mostre o dia da semana correspondente.
Os dias são numerados de 1 a 7, e o Domingo é o dia 1.
```

### Pacote IO
```
int diaSemana = IO.readint("Digite um dia da semana\n");

switch( diaSemana ){
    case 1:
        IO.println("Domingo");
        break;
    case 2:
        IO.println("Segunda-feira");
        break;
    case 3:
        IO.println("Terça-feira");
        break;
    case 4:
        IO.println("Quarta-feira");
        break;
    case 5:
        IO.println("Quinta-feira");
        break;
    case 6:
        IO.println("Sexta-feira");
        break;
    case 7:
        IO.println("Sabado");
        break;
    default:
        IO.println("Dia invalido");
        break;
}

/*
OBS: nao usei acento para evitar erros na hora de mostrar os dados
*/
```

### JAVA puro
```
Scanner sc = new Scanner( System.in );

System.out.println("Digite um dia da semana");
int diaSemana = sc.nextInt();

switch( diaSemana ){
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    case 5:
        System.out.println("Quinta-feira");
        break;
    case 6:
        System.out.println("Sexta-feira");
        break;
    case 7:
        System.out.println("Sabado");
        break;
    default:
        System.out.println("Dia invalido");
        break;
}

/*
OBS: nao usei acento para evitar erros na hora de mostrar os dados
*/
```

Aqui nesse tipo de estrutura temos a linha switch( variavel ). Essa linha diz que vamos analizar o valor da variavel **diaSemana** nesse codigo acima.<br/>
Os *cases* são caso a variável ter aquele valor: 1,2,3,4,5,6,7. Se no caso ela ter o valor 1 o programa vai entrar no caso 1 e mostrar na tela **Segunda-feira**.<br/>
Para mostrar que acabamos esse *case* devemos obrigatóriamente colocar o comando **break**, senão o programa vai executar os outros *cases* abaixo até achar um *break* ou até o *switch* acabar.<br/>
O caso **default** é feito quando nenhum dos casos anteriores foi feito, ou seja, quando o usuário digitar uma data inválida como -1,10,50,....
