# Input e Output de Dados

1. Como as etapas de desenvolvimento da Linguagem java transforma um simples arquivo de texto em bytecode? Os códigos são impressos para pessoas ou máquinas?

As principais etapas de desenvolvimento são: edição, compilação, armazenamento, validação e execução. Nesse contexto, a máquina virtual Java converte o arquivo que antes era um formato escrito para ser interpretado por programadores para bytecode, que será executado por diversos tipos de aparelhos diferentes.

2. Porque Java nos força a criarmos objetos? Como no caso de um Hello Wordl simples. Quais benefícios dessa hierarquia do ponto de vista de programação? 

Java é uma Linguagem Orientada a Objetos Nativamente, portanto para criar qualquer código, por mais simples que seja, devemos sempre estruturar uma classe e instanciar o objeto. Do ponto de vista de programação e desenvolvimento de software, essa hierarquia facilita o desenvolvimento pois o código será estruturado em blocos, aumentando a organização, modularização e extensibilidade.

3. Qual o papel do método **public static void main(String[] args)**?

Trata - se do método main de qualquer classe. Quando a máquina virtual converte o código para Bytecode, após a validação, por padrão o método main será o primeiro a ser executado. É como se estivesse programado para, obrigatoriamente, na etapa da execução, a 'ordem' ser de executar primeiro o método main. Consequentemente, a interação com o usuário e chamadas de sistema estão aqui.

4. Explique a complexidade por trás do comando **System.out.println("Mensagem");**. Qual a diferença entre **print** e **println**?

Para imprimir uma mensagem na tela em Java, comparado a outras Linguagens, é muito mais complexo. A sintaxe acima especifica que O SISTEMA QUE ESTÁ EXECUTANDO JAVA DEVE USAR UMA SYSCALL DE OUTPUT E O MÉTODO PRINTLN para imprimir uma string pulando linha. A diferença entre println e print é que o print não pula nenhuma linha. 

5. Explique os detalhes da leitura de uma string:

```java
import java.util.scanner;


public static void main()
{
    Scanner scanner = new scanner();

    String token = scanner.next();

    String mensagem = scanner.nextLine();    
}
```
Em **import java.util.scanner;**. Começando pela importação, consite em importarmos de "utilitários" do Java o módulo de **scanner** que realiza a leitura (input) de variáveis.

Depois, temos o método **main** que é **público, estático e retorna vazio (void)**(public static void main).

No bloco main, em **Scanner scanner = new scanner();** nós temos criamos o **objeto scanner** da biblioteca scanner como um novo scanner.

A linha **String token = scanner.next();** cria uma variável do tipo string chamada token usando o **método .next();** da biblioteca scanner para ler APENAS UM TOKEN (que é o que o método lê).

Por fim, em **String mensagem = scanner.nextLine();** declaramos uma variável mensagem do tipo string e usamos o **método nextLine();** para ler mais te um token, onde podemos realizar o input de uma frase contendo espaços, entre outras coisas.

Em geral, os **métodos de leitura são:**

-**scanner.nextLine();**
-**scanner.next();**
**scanner.nextInt**
-**scanner.nextFloat();**
-**scanner.next().charAt(0);** Para ler apenas um caractere (posição 0).

# Variáveis

6. O que são variáveis? O que acontece no código abaixo quando lemos uma variável inteira do ponto de vista de memória? Explique o que é Linguagem de Tipagem Estática.

Variáveis são **endereços de memória que armazenam Dados**. Quando declaramos uma variável em Java, no processo de compilação, o compilador irá let o tipo de variável que usamos e reservar um espaço na memória. Quando necessário, o acesso será feito por meio do endereço. Claro, esse endereço armazena um valor binário que será usado pela máquina na execução. 

```java
import java.util.scanner;

public static void main()
{
    Scanner scanner = new scanner();

    String numero1 = scanner.nextInt();

    String numero2 = scanner.nextFloat();    
}
```

Ao usar o scanner, o **método converte a string lida para o tipo adequado de variável**.

As variáveis são **estáticas**, ou seja, **precisamos obrigatoriamente declarar seu tipo**, isso será usado pelo compilador para reservar uma determinada quantidade de bytes para ela na memória. Nós estamos convertendo a string lida para o valor adequado no caso acima.

7. Quais são os principais **tipos de variáveis** em Java? 

Nós temos: 

**byte**	 8	Número inteiro de -128 a 127.
**short**	16	Número inteiro de -32.768 a 32.767.
**int**  	32	Número inteiro, a escolha padrão para a maioria dos casos.
**long**	64	Número inteiro maior, usado quando int não é suficiente.
**float**	32	Número de ponto flutuante (decimal) de precisão simples. Requer o sufixo 'f' (ex: 3.14f).
**double**	64	Número de ponto flutuante de precisão dupla, a escolha padrão para valores decimais.
**boolean**  1	Valor lógico que pode ser true ou false.
**char**	16	Um único caractere Unicode.

8. Quais são os operadores:

**I. Aritméticos**
A. Soma                +
B. Subtração           -
C. Multiplicação       *
D. Divisão             /
E. Resto da divisão    %

**II. Lógicos**
A. 'E'                 &&
B. 'OU'                ||
C. 'NAO'               !

**III. Relacionais**
A. Maior               >
B. Maior ou igual      >=
C. Menor               <
D. Menor ou igual      <=
E. Diferente de        !=
F. Atribuição          =
G. Comparação          ==
H. Incremento          ++
I. Decremento          --

# Condicionais

9. O que são Condicionais? Porque dizemos que são decisões binárias?

São **comandos usados para desviar o fluxo de execução do código** de acordo com uma decisão. 

Normalmente, o código é **executado linha a linha** em uma ordem **de cima para baixo, da esquerda para a direita**. Assim como em assembly e linguagens de mais baixo nível, quando o código está sendo executado e temos uma condição **if, else if e else** **caso a condição seja obedecida o fluxo de código muda** e o **bloco dentro dos condicionais será executado**.

10. Qual a sintaxe e a lógica dos condicionais **if**, **else if** e **else** em Java.

```java
if (condicao) //se - condição 
{
    //bloco de código a ser 
}

else if(condicao2) //senão se
{
    //bloco de código p executar
}

else //se não
{
    //bloco de código
}
```

## Lista de Exercícios — Capítulo 2
2.24 — Maior e Menor Inteiros

Escreva uma aplicação que leia cinco inteiros e determine e imprima os maiores e menores inteiros do grupo. Use apenas as técnicas de programação que você aprendeu neste capítulo.

2.25 — Ímpar ou Par

Escreva uma aplicação que leia um inteiro e determine e imprima se ele é ímpar ou par.
Dica: Use o operador de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa resto 0 quando dividido por 2.

2.26 — Múltiplos

Escreva uma aplicação que leia dois inteiros, determine se o primeiro é um múltiplo do segundo e imprima o resultado.
Dica: Use o operador de resto.

2.27 — Padrão de Tabuleiro de Xadrez de Asteriscos

Escreva uma aplicação que exiba um padrão de tabuleiro de xadrez, conforme mostrado:

* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *

**2.28 — Diâmetro, Circunferência e Área de um Círculo**

Escreva uma aplicação que insira do usuário o raio de um círculo como um inteiro e imprima:

diâmetro

circunferência

área

Usando 3.14159 para π ou Math.PI.

Fórmulas:

diâmetro = 2r

circunferência = 2πr

área = πr²

**2.29 — Valor Inteiro de um Caractere**

Escreva uma aplicação que exiba os equivalentes inteiros dos seguintes caracteres:

A B C
a b c
0 1 2
$ * + /
(espaço em branco)

2.30 — Separando os Dígitos em um Inteiro

Escreva uma aplicação que insira um número de cinco dígitos e imprima os dígitos separados por três espaços.
Exemplo: entrada 42339

Saída:

4   2   3   3   9

**2.31 — Tabela de Quadrados e Cubos**

Escreva uma aplicação que calcule os quadrados e cubos dos números de 0 a 10 e os imprima como tabela.

Exemplo:

number	square	cube
0	    0   	0
1	    1   	1
2	    4   	8
3	    9   	27
4	    16  	64
5	    25  	125
6	    36  	216
7	    49  	343
8	    64  	512
9	    81  	729
10	    100 	1000
2.32 — Valores Negativos, Positivos e Zero

Escreva um programa que insira cinco números e determine:

quantos negativos

quantos positivos

quantos zeros

Fazendo a Diferença (Making a Difference)
2.33 — Calculadora de Índice de Massa Corporal

Crie uma calculadora de IMC que leia peso e altura:

peso em libras e altura em polegadas
ou

peso em quilogramas e altura em metros

Calcule e exiba o IMC.
Exiba também a tabela:

VALORES DE IMC

Underweight: less than 18.5

Normal: between 18.5 and 24.9

Overweight: between 25 and 29.9

Obese: 30 or greater

**Resposta: IMC.java no módulo 1**

2.34 — Calculadora de Crescimento da População Mundial

Pesquise a população mundial atual e sua taxa de crescimento anual.
Escreva uma aplicação que insira esses valores e exiba a população estimada após:

1 ano

2 anos

3 anos

4 anos

5 anos

Calculadora de Economia de Carona Compartilhada

Crie uma aplicação que calcule o custo diário de direção ao trabalho.

Entradas:

a) Total de milhas percorridas por dia
b) Custo por galão de gasolina
c) Média de milhas por galão
d) Taxas de estacionamento por dia
e) Pedágios por dia

Exiba o custo diário total.


## PERGUNTAS EXTRAS
O QUE É CASTING?? COMO E QUANDO DEVEMOS FAZER?? COMO MANIPULAR A VÍRGULA DO FLOAT NO JAVA??

O QUE É FORMATAÇÃO?? COMO IMPRIMIR UMA MENSAGEM E UYM VALOR FLOAT??

QUAIS AS TRÊS FORMAS DE IMPRIMIR UM FLOAT E UMA VARIÁVEL? (println, .fotmat, printf %s%.2f)