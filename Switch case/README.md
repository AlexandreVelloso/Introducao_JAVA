# Switch/case

O *switch/case* é um tipo de estrutura parecida com as estruturas condicionais, por que você escolhe qual parte do código vai ser feita, mas eu não coloquei ele na mesma secção pois ele não faz comparação.<br />
Esse tipo de estrutura é muito útil quando você por exemplo tem um menu com algumas opções e quando o usuário escolher uma delas ele vai para a parte de código que as executa.<br/>
No exemplo a seguir o usuário irá digitar o dia da semana( 1 a 7 ), e o programa vai mostrar na tela o dia da semana correspondente.<br />

```
Criar um programa que leia um número e mostre o dia da semana correspondente.
Os dias são numerados de 1 a 7, e o Domingo é o dia 1.
```

Todos os códigos estão disponíveis [aqui](https://github.com/AlexandreVelloso/Introducao_JAVA/tree/master/Switch%20case/C%C3%B3digo)

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

* **switch(variavel)**: Aqui definimos qual variável será analizada. No caso acima será a variável **diaSemana**. As variáveis dentro do switch devem ser dos tipos *int*,*char* ou *String*.
* **case X**: o *case* é quando a variável assumir um valor qualquer então deverá executar um trecho de código. No exemplo acima mostramos o dia da semana correspondente.
* **break**: O *break* é muito importante, pois ele mostra quando o case acabou. Se não colocarmos ele, o programa vai executar os casos abaixo dele até encontrar um *break* ou o *switch* acabar.
* **default**: O default é o trecho que será executado quando o valor não for nenhum dos anteriores, nesse exemplo quando o usuário digitar uma data que não existe.
