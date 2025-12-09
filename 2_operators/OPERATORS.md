# Input e Output de Dados

1. Como as etapas de desenvolvimento da Linguagem java transforma um simples arquivo de texto em bytecode? Os códigos são impressos para pessoas ou máquinas?

2. Porque Java nos força a criarmos objetos? Como no caso de um Hello Wordl simples. Quais benefícios dessa hierarquia do ponto de vista de programação? 

3. Qual o papel do método **public static void main(String[] args)**?

4. Explique a complexidade por trás do comando **System.out.println("Mensagem");**. Qual a diferença entre **print** e **println**? 

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

# Variáveis

6. O que são variáveis? O que acontece no código abaixo quando lemos uma variável inteira do ponto de vista de memória? Explique o que é Linguagem de Tipagem Estática.

```java
import java.util.scanner;

public static void main()
{
    Scanner scanner = new scanner();

    String numero1 = scanner.nextInt();

    String numero2 = scanner.nextFloat();    
}
```

7. Quais são os principais **tipos de variáveis** em Java?

8. Quais são os operadores:

I. Aritméticos
A. Soma
B. Subtração
C. Multiplicação
D. Divisão
E. Resto da divisão

II. Lógicos
A. 'E'
B. 'OU'
C. 'NAO'

III. Relacionais
A. Maior
B. Maior ou igual
C. Menor
D. Menor ou igual
E. Diferente de 
F. Atribuição
G. Comparação
H. Incremento
I. Decremento

# Condicionais

9. O que são Condicionais? Porque dizemos que são valores binários?

10. Qual a sintaxe e a lógica dos condicionais **if**, **else if** e **else** em Java.


# Exercícios (Exercises)
2.7 Preencha os espaços em branco em cada uma das seguintes declarações: a) _____ são usados para documentar um programa e melhorar sua legibilidade. b) Uma decisão pode ser tomada em um programa Java com um(a) _____. c) Cálculos são normalmente realizados por declarações _____. d) Os operadores aritméticos com a mesma precedência da multiplicação são _____ e _____. e) Quando parênteses em uma expressão aritmética estão aninhados, o conjunto _____ de parênteses é avaliado primeiro. f) Uma localização na memória do computador que pode conter valores diferentes em vários momentos durante a execução de um programa é chamada de um(a) _____.
2.8 Escreva declarações Java que realizem cada uma das seguintes tarefas: a) Exiba a mensagem "Enter an integer: ", deixando o cursor na mesma linha. b) Atribua o produto das variáveis b e c à variável a. c) Use um comentário para declarar que um programa realiza um cálculo de folha de pagamento de exemplo.
2.9 Indique se cada uma das seguintes afirmações é verdadeira ou falsa. Se for falsa, explique o porquê. a) Os operadores Java são avaliados da esquerda para a direita. b) Os seguintes são todos nomes de variáveis válidos: _under_bar_, m928134, t5, j7, her_sales$, his_$account_total, a, b$, c, z e z2. c) Uma expressão aritmética Java válida sem parênteses é avaliada da esquerda para a direita. d) Os seguintes são todos nomes de variáveis inválidos: 3g, 87, 67h2, h22 e 2h.
2.10 Assumindo que x=2 e y=3, o que cada uma das seguintes declarações exibe? a) System.out.printf("x = %d%n", x); b) System.out.printf("Value of %d + %d is %d%n", x, x, (x + x)); c) System.out.printf("x ="); d) System.out.printf("%d = %d%n", (x + y), (y + x));
2.11 Quais das seguintes declarações Java contêm variáveis cujos valores são modificados? a) p = i + j + k + 7; b) System.out.println("variables whose values are modified"); c) System.out.println("a = 5"); d) value = input.nextInt();
2.12 Dado que y=ax 
3
 +7, quais das seguintes são declarações Java corretas para esta equação? a) y = a * x * x * x + 7; b) y = a * x * x * (x + 7); c) y = (a * x) * x * (x + 7); d) y = (a * x) * x * x + 7; e) y = a * (x * x * x) + 7; f) y = a * x * (x * x + 7);
2.13 Indique a ordem de avaliação dos operadores em cada uma das seguintes declarações Java e mostre o valor de x após cada declaração ser executada: a) x = 7 + 3 * 6 / 2 - 1; b) x = 2 % 2 + 2 * 2 - 2 / 2; c) x = (3 * 9 * (3 + (9 * 3 / (3))));
2.14 Escreva uma aplicação que exiba os números de 1 a 4 na mesma linha, com cada par de números adjacentes separados por um espaço. Use as seguintes técnicas: a) Use uma declaração System.out.println. b) Use quatro declarações System.out.print. c) Use uma declaração System.out.printf.
2.15 (Aritmética) Escreva uma aplicação que peça ao usuário para inserir dois inteiros, os obtenha do usuário e imprima sua soma, produto, diferença e quociente (divisão). Use as técnicas mostradas na Fig. 2.7.
2.16 (Comparando Inteiros) Escreva uma aplicação que peça ao usuário para inserir dois inteiros, os obtenha do usuário e exiba o número maior seguido pelas palavras "is larger". Se os números forem iguais, imprima a mensagem "These numbers are equal". Use as técnicas mostradas na Fig. 2.15.
2.17 (Aritmética, Menor e Maior) Escreva uma aplicação que insira três inteiros do usuário e exiba a soma, média, produto, menor e maior dos números. Use as técnicas mostradas na Fig. 2.15. [Nota: O cálculo da média neste exercício deve resultar em uma representação inteira da média. Assim, se a soma dos valores for 7, a média deve ser 2, não 2.3333….]
2.18 (Exibindo Formas com Asteriscos) Escreva uma aplicação que exiba um caixa, um oval, uma seta e um diamante usando asteriscos (*), conforme mostrado:
Caixa
Oval
Seta
Diamante
*********
***
*
*
* *
* *
*\ *
* *
* *
* *
*****
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
* *
***
* *
* *
*********
***
* *
*
2.19 O que o seguinte código imprime? System.out.printf("*%n**%n***%n****%n*****%n");
2.20 O que o seguinte código imprime? System.out.println("*"); System.out.println("***"); System.out.println("*****"); System.out.println("****"); System.out.println("**");
2.21 O que o seguinte código imprime? System.out.print("*"); System.out.print("***"); System.out.print("*****"); System.out.print("****"); System.out.println("**");
2.22 O que o seguinte código imprime? System.out.print("*"); System.out.println("***"); System.out.println("*****"); System.out.print("****"); System.out.println("**");
2.23 O que o seguinte código imprime? System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");
2.24 (Maior e Menor Inteiros) Escreva uma aplicação que leia cinco inteiros e determine e imprima os maiores e menores inteiros do grupo. Use apenas as técnicas de programação que você aprendeu neste capítulo.
2.25 (Ímpar ou Par) Escreva uma aplicação que leia um inteiro e determine e imprima se ele é ímpar ou par. [Dica: Use o operador de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto de 0 quando dividido por 2.]
2.26 (Múltiplos) Escreva uma aplicação que leia dois inteiros, determine se o primeiro é um múltiplo do segundo e imprima o resultado. [Dica: Use o operador de resto.]
2.27 (Padrão de Tabuleiro de Xadrez de Asteriscos) Escreva uma aplicação que exiba um padrão de tabuleiro de xadrez, conforme mostrado:
* * * * * * * *  * * * * * * * * * * * * * * * *  * * * * * * * * * * * * * * * *  * * * * * * * * * * * * * * * *  * * * * * * * *
2.28 (Diâmetro, Circunferência e Área de um Círculo) Escreva uma aplicação que insira do usuário o raio de um círculo como um inteiro e imprima o diâmetro, circunferência e área do círculo usando o valor de ponto flutuante 3.14159 para π. Use as técnicas mostradas na Fig. 2.7. [Nota: Você também pode usar a constante predefinida Math.PI para o valor de π. A classe Math é definida no pacote java.lang, que é importado automaticamente.] Use as seguintes fórmulas (r é o raio): diâmetro =2r circunferência =2πr área =πr 
2
 
2.29 (Valor Inteiro de um Caractere) Escreva uma aplicação que exiba os equivalentes inteiros de algumas letras maiúsculas, letras minúsculas, dígitos e símbolos especiais. Exiba os equivalentes inteiros dos seguintes: A B C a b c 0 1 2 $ * + / e o caractere em branco (espaço).
2.30 (Separando os Dígitos em um Inteiro) Escreva uma aplicação que insira um número composto por cinco dígitos do usuário, separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços cada. Por exemplo, se o usuário digitar 42339, o programa deve imprimir:
4   2   3   3   9
2.31 (Tabela de Quadrados e Cubos) Usando apenas as técnicas de programação que você aprendeu neste capítulo, escreva uma aplicação que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela, conforme mostrado:
number
square
cube
0
0
0
1
1
1
2
4
8
3
9
27
4
16
64
5
25
125
6
36
216
7
49
343
8
64
512
9
81
729
10
100
1000
2.32 (Valores Negativos, Positivos e Zero) Escreva um programa que insira cinco números e determine e imprima o número de números negativos inseridos, o número de números positivos inseridos e o número de zeros inseridos.
Fazendo a Diferença (Making a Difference)
2.33 (Calculadora de Índice de Massa Corporal) Crie uma calculadora de IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, peso em quilogramas e altura em metros), calcule e exiba o índice de massa corporal do usuário. Além disso, exiba as seguintes informações do Departamento de Saúde e Serviços Humanos/Institutos Nacionais de Saúde para que o usuário possa avaliar seu IMC:
VALORES DE IMC
Underweight:
less than 18.5
Normal:
between 18.5 and 24.9
Overweight:
between 25 and 29.9
Obese:
30 or greater
2.34 (Calculadora de Crescimento da População Mundial) Use a web para determinar a população mundial atual e a taxa de crescimento anual da população mundial. Escreva uma aplicação que insira esses valores e, em seguida, exiba a população mundial estimada após um, dois, três, quatro e cinco anos.
2.35 (Calculadora de Economia de Carona Compartilhada) Pesquise vários sites de carona compartilhada. Crie uma aplicação que calcule seu custo diário de direção, para que você possa estimar quanto dinheiro poderia ser economizado ao compartilhar caronas. A aplicação deve inserir as seguintes informações e exibir o custo por dia do usuário para dirigir ao trabalho: a) Total de milhas percorridas por dia. b) Custo por galão de gasolina. c) Média de milhas por galão. d) Taxas de estacionamento por dia. e) Pedágios por dia.
