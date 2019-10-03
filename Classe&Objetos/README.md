# Classes e Objetos

A Programação Orientada a Objetos (também conhecida como POO) foi criada com intuito de ajudar desenvolvedores com algumas boas práticas de programaçao, são elas: o entendimento do código, fácil manutenção, reaproveitamento entre outros. É formada por alguns itens, dentre os quais destacamos: Classes, Objetos, Atributos, Métodos, Construtores.

## O que é uma classe?

As classes de programação podem ser entendidas como são receitas de um objeto, aonde têm características e comportamentos.
A palavra classe vem da taxonomia da biologia. Todos os seres vivos de uma mesma classe biológica têm uma série de atributos e comportamentos em comum, mas não são iguais, podem variar nos valores desses atributos e como realizam esses comportamentos.

### Características das classes:

+ Possui nome:
    + Conta, Cachorro, Carro;
+ Visibilidade
    + public, private, protected;

```java
public class Conta {       // visibiladade + class + nome_classe
    public int numero;     //atributo numero
    public String titular; //atributo titular
    public double saldo;   //atributo saldo
    // .. 
    }
``` 

## O que são atributos?

Os atributos são as propriedades de um objeto, também são conhecidos como variáveis ou campos. Essas propriedades definem o estado de um objeto, fazendo com que esses valores possam sofrer alterações.

```java
public class Cachorro{
     
    public String nome;     //atributo nome 
    public int peso;        //atributo peso
    public String corOlhos; //atributo corOlhos
    public int quantPatas;  //atributo quantPatas
}

public class Teste{
 
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(); //instanciando objeto cachorro1 do tipo Cachorro
        cachorro1.nome = "Pluto";            //dando valor ao atributo nome para cachorro1
        cachorro1.corOlhos = "azuis";        //dando valor ao atributo corolhos para cachorro1
        cachorro1.peso = 53;                 //dando valor ao atributo peso para cachorro1
        cachorro1.quantPatas = 4;
    }
}

```

## O que é são métodos?

Dentro da classe, também declararamos o que cada conta faz e como isto é feito - os comportamentos que cada classe tem.
Queremos dizer como que uma conta pode sacar dinheiro, fazemos essa especificação dentro da própria classe `Conta`. É por isso que essas "funções" são chamadas de métodos. Pois é a maneira de fazer uma operação com um objeto.

Como boas práticas, é indicado sempre usar o nome dos métodos declarados como verbos, para que quando for efetuada alguma manutenção seja de fácil entendimento.

```java
public class Conta { 
    public double salario; // atributo salário 

    public void sacar(double quantidade) { //método sacar especifica como sacamos numa conta
        double novoSaldo = this.saldo - quantidade; this.saldo = novoSaldo; } 
        }
``` 

A palavra reserveda `void` diz que ao chamar o método `sacar`, este não retorna nenhuma informação para o mesmo que o invocou. Ao sacar algum valor, precisamos informar a `quantidade` que queremos, dentro do método, declaramos dentro de parênteses e isso é chamado de `parâmetro` do método (ou `argumento`). Essa variável é temporária pois, ao final da execução desse método, ela deixa de existir.


Abaixo temos outro método, dessa vez para depositar.

```java
public class Conta	{

	public void deposita(double	quantidade) { // depositar recebe um double quantidade como parâmetro
			this.saldo	+=	quantidade;
	}
}
``` 

Para acessar atributos de um objeto, utilizamos o `.(ponto)` como vemos abaixo.

```java

public class ProgramaPrincipal{
    public class Conta { 
        public double salario; // atributo salário 

        public void sacar(double quantidade) { //método sacar especifica como sacamos numa conta
            double novoSaldo = this.saldo - quantidade; this.saldo = novoSaldo; } 
        }

        public void deposita(double	quantidade) { // depositar recebe um double quantidade como parâmetro
			this.saldo	+=	quantidade;
	    }

    public class TestaAlgunsMetodos	{
		public	static	void	main(String[]	args) {
								
		Conta	minhaConta;             //	criando	um objeto minha conta do tipo Conta
		minhaConta	=	new	Conta();
        
    
		minhaConta.titular	=	"Duke"; // alterando atributo titular
        minhaConta.saldo	=	1000;   // alterando atributo saldo
        
        minhaConta.saca(200);           //chama o metodo saca e passa 200 como paramêtro
        
        minhaConta.deposita(500);       // chama o metodo deposita e passa 200 como paramêtro
        
		System.out.println(minhaConta.saldo); // imprime na tela o saldo
    }
}

``` 

## O que é são construtores?

O construtor de um objeto é um método especial, pois inicializa seus atributos toda vez que é instanciado.  A identificação de um construtor em uma classe é sempre o mesmo nome da classe.

Toda vez que é digitada a palavra reservada `new`, o objeto solicita para a memória do sistema armazená-lo, onde chama o construtor da classe para inicializar o objeto.

```java
public class Conta	{
	public String	titular;
	public int	numero;
    public double	saldo;
    
	//	construtor
	Conta()	{
		System.out.println("Construindo	uma	conta.");
		}
}
```

Sendo assim, quando instaciarmos uma nova conta, a mensagem	`construindo uma	conta` aparecerá.
