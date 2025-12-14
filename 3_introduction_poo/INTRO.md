# Introdução a Classes, Objetos, Métodos e Strings

# Conceitos Fundamentais

**Classes e Objetos**: O capítulo ensina **como declarar** uma classe e **usá-la para criar um objeto**. Cada nova classe criada se torna um novo tipo que pode ser usado para declarar variáveis e criar objetos.

# Perguntas Conceituais

## Classes e Objetos 

### O que é uma classe em Java e como se declara sintaticamente uma nova classe?

A classe é o **molde** ou **modelo** que usaremos para **criar/instanciar novos objetos**, que irão possuir as **características (atributos)** e **comportamentos(métodos)** de uma Classe. 

**A Classe em si não é objeto, apenas possui os moldes e características de um**.

É como pensar nos conceitos de planta baixa e casa, a **planta baixa é a classe**, o modelo que gerou a casa. A casa em si é o **Objeto fruto daquele modelo (classe)** que foi instanciado.

O livro cita, como exemplo, uma conta bancária.

Para **declarar uma classe:**

```java
public class ContaBancaria { //essa sera a classe, o molde de todas as contas

    //ESSES SÃO OS ATRIBUTOS, AS CARACTERÍSTICAS PADRÃO DAS CLASSES
    private String nome;
    private String cpf;
    private float saldo;
    private float depositos;
    private float saques;
}
```

Note que **PODEMOS OCULTAR UMA CARACTERÍSTICA PROPOSITALMENTE USANDO PRIVATE** ou também **MOSTRAR UMA CARACTERÍSTICA PROPOSITALMENTE USANDO PUBLIC**. 

### Como se cria (instancia) um objeto a partir de uma classe e de que forma essa classe passa a ser um novo tipo utilizável em declarações de variáveis?

Para instanciar um objeto, iremos fazer a seguinte sequência: 

**chamar a classe, dar nome ao objeto e depois atribuir como new NomeClasse() PASSANDO OS ARGUMENTOS NOS PARÊNTERES**

É sempre muito importante **nomear o objeto** e usar o **método new para criar**.

Continuando com o exemplo acima:


```java
public class ContaBancaria { 

    private String nome;
    private String cpf;
    private float saldo;
    private float depositos;
    private float saques;

    //construtor
    .
    .
    .

    public static void main(String[] args){

        ContaBancaria conta = new ContaBancaria("Leonardo Bazana", "xxxxxxxxxxx", 200.00, 0.0; 0.0);
    }
}
```

No caso acima nós **chamamos a classe**, em seguida **nomeamos o objeto** e posteriormente atribuímos a um **new Classe();** passando os **argumentos entre parânteres.

O **new é como se fosse a equipe de construção**, ele **vai na memória** em um endereço livre e cria o objeto com um endereço específico e atributos particulares. Por isso que objetos diferentes possuem atributos totalmente diferentes e não se relacionam.

## Comportamentos e Métodos 

**Comportamentos e Métodos**: Os comportamentos de uma classe são **implementados como métodos**. Os **métodos** são chamados para fazer com que os **objetos executem suas tarefas**.


### O que é um método em uma classe e como ele representa um comportamento de um objeto?

O método é uma **bloco de código que corresponde a um comportamento/tarefa** que poderá ser **executada pelos objetos instanciados na classe**.

O método irá ter **um header**, o **tipo de retorno**, e os **parâmetros**.

Exemplo:

```java

public class Carro{
    //atributos

    //método construtor

    //exemplo de método
    public static String partida(boolean ligado){
        String msg_ligado = "O veículo já está ligado!"
        String msg_desligado = "Partida Iniciada...\nVeículo Ligado!"
        

        if (ligado == true){
                return msg_ligado;
        }

        else{
            this.ligado = true;
            return msg_desligado;

        }
    }
}
```

No exemplo acima, nós temos o método **partida**, declarado por:
```java
public static String partida(boolean ligado)
```
É um **método público**, **estático**, que **retorna uma String** e tem o nome **partida**. Além disso, ele **recebe o parâmetro booleano ligado**.

### Como se chama (invoca) um método em um objeto e quais são as diferenças entre chamar métodos de instância e métodos estáticos?

Para **invocar um método**, iremos fazer da seguinte forma; **após criar um objeto**, o **método fará parte do objeto instanciado**, e para chamar podemos fazer da seguinte forma (usando o exemplo do carro criado acima):

```java
public static void main(String[] args){

    Carro chevete = new Carro("chevette", "Chevrolet", 1997, false);

    chevette.partida(ligado);
}
```
Para **chamar um método**, iremos usar a sintaxe **nome_objeto.método(argumento);**

## Atributos e Variáveis de Instância 

Os atributos de uma classe são implementados como variáveis de instância. Cada objeto (instância) da classe possui sua própria cópia das variáveis de instância.


### Oque são variáveis de instância (atributos) e como diferem de variáveis estáticas?

Variáveis **estáticas** são as que foram **criadas apenas para a classe**, e não para a instânica como um todo. Ou seja, são as variáveis gerais da classe, no caso abaixo o nome, cpf, saldo, saques, depósitos, etc...

Declaramos no início da classe, passando o **modo de acesso (public/private), static, tipo e nome**. Podemos também atribuir um valor.

Por outro lado, as **variávies de instância** são **criadas para o objeto** e atuam representando as **características** dos **objetos instanciados**. No abaixo, meu nome e informações...

```java
public class ContaBancaria { 

    //variáveis estáticas
    private static String nome;
    private static String cpf;
    private static float saldo;
    private static float depositos;
    private static float saques;

    //construtor
    .
    .
    .

    public static void main(String[] args){
        //aqui temos as variáveis de instância
        ContaBancaria conta = new ContaBancaria("Leonardo Bazana", "xxxxxxxxxxx", 200.00, 0.0; 0.0);
    }
}
```

Podemos criar atributos **públicos** que **todos os clientes da classe podem acessar com public** através da palavra chave **public**.

Por outro lado, podemos criar **atributos privados** com o objetivo de **ocultar o acesso aos clientes da classe** utilizando a palavra chave **private**.

**PRINCÍPIO DO ENCAPSULAMENTO**

### ONDE E COMO DECLARAR AS VARIÁVEIS DE INSTÂNICA??

**Variáveis de ESTÁTICAS -> declarar no início** 
**Variáveis de INSTÂNCIA -> delcarar na criação do objeto** 

Exemplo:

```java
public class Carro{

    //variáveis estáticas
    public static String modelo;
    public static float valor;
    public static int ano;

    public static void main(String[] args)
    {
        //aqui instanciamos o objeto e as variáveis de instância
        Carro chevette = new Carro("Chevette", 25.000,00f, 1997);
    
        Carro palio = new Carro("Unno", 32.000,00f, 2009);
    }
}

```

### Porque cada instância de uma classe possui sua própria cópia das variáveis de instância e quais implicações isso tem para o estado dos objetos?

Cada objeto possui características próprias, o que faz com que o estado dos objetos varie entre eles, ou seja, os objetos não têm as mesmas características. Isso garante independência entre os objetos, aumentando a viabilidade de um projeto, de forma que os objetos não sejam os mesmos entre eles. 

## Instanciação de Objetos 

O **processo de criação de um novo objeto** é realizado por uma expressão de criação de instância de classe, que começa com a PALAVRA CHAVE: 

**new**


### Como funciona a expressão de instanciação usando a palavra-chave new e o que acontece internamente quando um objeto é instanciado?



### Quais são os componentes obrigatórios de uma expressão de criação de instância (por exemplo, nome da classe e argumentos do construtor)?


## Encapsulamento e Ocultação de Dados

Declarar **variáveis de instância com o modificador de acesso private** é conhecido como **ocultação de dados** ou ocultação de informação. Isso significa que os **dados ficam encapsulados (escondidos)** dentro do objeto e só **podem ser acessados pelos métodos** da classe do objeto.


### O que significa encapsulamento em orientação a objetos e como o modificador private implementa a ocultação de dados?


### Quais são as vantagens de esconder dados dentro de um objeto e permitir acesso apenas por meio de métodos da própria classe?


## Métodos set e get

**Classes** geralmente fornecem **métodos públicos**, como métodos **set e get**, para permitir que os **clientes** da classe **definam ou obtenham** (respectivamente) o **valor das variáveis de instância privadas**.


### O que são métodos set e get, qual é a sua assinatura típica e quando devemos fornecê-los para variáveis privadas?


### Quais são implicações de projeto (por exemplo, validação ou imutabilidade) ao implementar set e get numa classe?


## Variáveis e Tipos de Dados

**Tipos Primitivos vs. Tipos de Referência**: Os tipos em Java são divididos em **tipos primitivos e tipos de referência**.

**Tipos Primitivos:** Incluem **boolean, byte, char, short, int, long, float e double**. Variáveis de tipos primitivos podem **armazenar exatamente um valor** de seu tipo declarado por vez.


### Quais são os tipos primitivos em Java e que faixa ou natureza de valores cada um representa (por exemplo, int vs long, char vs boolean)?


### Como o armazenamento e a atribuição funcionam para variáveis de tipos primitivos?


**Tipos de Referência**: São todos os tipos **não primitivos**, incluindo **classes (como String e Scanner)**. Variáveis de **tipo de referência (chamadas referências) armazenam os endereços de objetos na memória** do computador e são necessárias para chamar os métodos de um objeto.


### O que é um tipo de referência em Java e em que sentido uma variável de referência armazena um endereço ao invés do próprio objeto?


### Como difere o comportamento da atribuição e comparação entre tipos primitivos e tipos de referência (por exemplo, == e .equals)?


## Inicialização de Variáveis

**Variáveis de Instância** são inicializadas por padrão pelo Java. O valor padrão para **String** (tipo de referência) é **null**, enquanto double e outros **tipos numéricos primitivos** são inicializados como **0.0 ou 0**.

**Variáveis Locais** **não são** inicializadas **automaticamente** e devem ser **explicitamente atribuídas** a um valor **antes** de serem usadas.

### Quais valores padrão Java atribui automaticamente a variáveis de instância para tipos de referência (por exemplo String) e para tipos primitivos numéricos?


### Por que variáveis locais não são inicializadas automaticamente e qual é a consequência de tentar usar uma variável local sem inicialização prévia?


## Números de Ponto Flutuante 

São **números** que contêm um **ponto decimal**.

**float**: Representa números de **ponto flutuante de precisão simples** (até **sete dígitos** significativos).
**double**: Representa números de **ponto flutuante de precisão dupla** (até **15 dígitos** significativos). Literais de **ponto flutuante** (valores no código-fonte, **como 7.33**) são **tratados como valores double por padrão.**


### Qual é a diferença entre float e double em termos de precisão e quando devo escolher cada um?


### Por que literais de ponto flutuante sem sufixo são tratados como double por padrão e como declarar um literal float explicitamente no código (por exemplo, com f ou F)?


## Métodos e Fluxo de Controle

**Declaração de Métodos**: Inclui o **cabeçalho** do método, que **especifica o tipo de retorno**, o **nome** e a lista de **parâmetros**.


### Quais são os componentes obrigatórios do cabeçalho de um método em Java e qual a sintaxe para declarar o tipo de retorno, nome e parâmetros?


### Como se especifica modificadores de acesso e static no cabeçalho de método e qual o efeito deles?


## Retorno void 

Indica que o **método executará uma tarefa**, mas **não retornará nenhuma informação** ao chamador.

**return Statement**: Passa um valor de um **método chamado de volta ao seu chamador**.


### Quando devo usar void como tipo de retorno e como difere de métodos que retornam valores?


### Como e quando usar a instrução return em métodos com tipo de retorno diferente de void e existe alguma restrição sobre return em métodos void?


## Parâmetros e Argumentos

**Parâmetros são variáveis locais** declaradas no **cabeçalho do método** que **recebem valores**. Argumentos são os **valores reais fornecidos** na chamada do método. 
O **número e os tipos dos argumentos** devem ser **consistentes** com o **número e os tipos dos parâmetros**.


Qual é a diferença conceitual entre parâmetros e argumentos e como a correspondência entre número/tipo é verificada pelo compilador?


O que acontece quando se passa tipos incompatíveis como argumentos ou quando se tenta passar menos/más argumentos do que o método declara?


Variáveis Locais: São variáveis declaradas no corpo de um método e só podem ser usadas dentro desse método.


Quais são as regras de escopo e tempo de vida de variáveis locais dentro de um método?


Por que é recomendável limitar a vida útil de variáveis locais e evitar "poluição" do escopo?


this Keyword: Usado para se referir explicitamente a uma variável de instância que está sendo sombreada (shadowed) por uma variável local ou parâmetro com o mesmo nome dentro do método.


Em que situações devemos usar a palavra-chave this e como ela resolve ambiguidade entre variáveis de instância e parâmetros locais?


Além de referir-se a variáveis de instância, que outras utilizações comuns this possui (por exemplo, chamar outro construtor)?


Métodos Estáticos (static): Um método especial (como main ou showMessageDialog do JOptionPane) que pode ser chamado sem primeiro criar um objeto da classe na qual o método foi declarado.


O que caracteriza um método static e quais limitações ele tem em relação ao acesso a variáveis de instância?


Quando é apropriado declarar um método como static (por exemplo, main) e quais são os trade-offs de design?


Redução de Código Duplicado: A prática de substituir código repetido por chamadas a um método que contém uma única cópia desse código, visando reduzir o tamanho do programa e melhorar a manutenção.


Quais práticas e técnicas podemos usar para reduzir código duplicado e quais são os benefícios em termos de manutenção e legibilidade?


Quando a extração de um método para eliminar duplicação pode introduzir complexidade indesejada (por exemplo, parâmetros excessivos) e como balancear isso?


Construtores
Construtores: Cada classe pode opcionalmente fornecer um construtor com parâmetros para inicializar um objeto quando ele é criado. Um construtor deve ter o mesmo nome da classe e não pode especificar um tipo de retorno (nem mesmo void).


O que é um construtor em Java, como se declara e qual é a diferença entre um construtor e um método comum?


Como passar parâmetros para um construtor e qual é a relação entre os parâmetros do construtor e a inicialização das variáveis de instância?


Construtor Padrão: Se uma classe não declarar explicitamente nenhum construtor, o compilador fornece um construtor padrão (que não tem parâmetros). Se um construtor personalizado for declarado, o compilador não fornecerá mais o construtor padrão.


O que é o construtor padrão fornecido pelo compilador e em que situações ele é gerado automaticamente?


Quais problemas podem ocorrer se eu declarar construtores personalizados e esquecer de fornecer um construtor sem parâmetros quando outras partes do código esperam o construtor padrão?


Outros Tópicos e Ferramentas
UML Class Diagrams (Diagramas de Classe UML): Usados para modelar e resumir graficamente os atributos, construtores e operações de uma classe.
◦ Os atributos privados são precedidos por um sinal de menos (–).
◦ As operações públicas são precedidas por um sinal de mais (+).
◦ Construtores são distinguidos pela palavra «constructor» entre guillemets.



O que deve conter um diagrama de classe UML para representar corretamente atributos, operações e construtores de uma classe?


Qual é a convenção de notação UML para atributos privados (sinal de menos), operações públicas (sinal de mais) e como indicar construtores usando «constructor»?


Compilação de Múltiplas Classes: Uso do comando javac para compilar vários arquivos .java simultaneamente, incluindo a opção *.java para compilar todos os arquivos na pasta atual.


Como se usa o comando javac para compilar múltiplos arquivos .java de uma vez e quais opções comuns (por exemplo *.java) facilitam isso?


Quais são práticas recomendadas para organizar e compilar projetos com muitas classes em múltiplos pacotes?


Pacotes e Importações:
◦ import Declarations: Usadas para indicar ao compilador que o programa usa uma classe específica (como Scanner).
◦ Default Package (Pacote Padrão): Classes compiladas no mesmo diretório são consideradas implicitamente importadas umas para as outras.
◦ Nome de Classe Totalmente Qualificado: Refere-se a uma classe usando seu nome completo, incluindo o nome do pacote (ex: java.util.Scanner), tornando a declaração import opcional.



Como e quando usar declarações import para classes externas e qual a sintaxe correta para importar classes específicas ou pacotes inteiros?


O que é o pacote padrão (default package) e quais limitações ele impõe em relação ao reuso e organização do código?


Como usar o nome de classe totalmente qualificado em vez de import e quando isso é útil?


Entrada/Saída:
◦ Scanner Class: Usada para obter entrada de dados do usuário. Métodos como nextLine (lê uma linha de texto) e nextDouble (lê um valor double) são abordados.
◦ Formatação de Saída: Uso do especificador de formato %f em System.out.printf para formatar valores float ou double, incluindo o controle de precisão (ex: %.2f para duas casas decimais).



Como instanciar e usar a classe Scanner para ler entradas do usuário, e quando usar nextLine() versus nextDouble()?


Como formatar saídas numéricas com System.out.printf usando especificadores como %f e como controlar a precisão (por exemplo %.2f)?


Diálogos e GUIs (Estudo de Caso Opcional): Introdução à criação de interfaces gráficas de usuário (GUIs) usando caixas de diálogo.
◦ JOptionPane Class: Fornece caixas de diálogo pré-construídas.
◦ showMessageDialog: Método estático para exibir uma caixa de diálogo de mensagem.
◦ showInputDialog: Método estático para obter texto do usuário em uma caixa de diálogo de entrada.
◦ String.format: Método estático que funciona como printf, mas retorna a string formatada em vez de exibi-la.
◦ Integer.parseInt: Método estático usado para converter uma String (entrada do usuário) em um int para cálculos.



O que é a classe JOptionPane e como usar seus métodos estáticos showMessageDialog e showInputDialog para interagir com o usuário por meio de caixas de diálogo?


Quando é mais apropriado usar String.format em vez de System.out.printf e como String.format retorna a string formatada?


Como converter a entrada de texto obtida via showInputDialog (ou Scanner.nextLine) em um número inteiro usando Integer.parseInt e quais precauções tomar para evitar NumberFormatException?


## Exercícios

#### 3.5 (Palavra-chave new): Qual é o propósito da palavra-chave new? Explique o que acontece quando você a usa.

#### 3.6 (Construtores Padrão): O que é um construtor padrão? Como as variáveis de instância de um objeto são inicializadas se uma classe tem apenas um construtor padrão?.

#### 3.7 (Variáveis de Instância): Explique o propósito de uma variável de instância.

#### 3.8 (Usando Classes sem Importá-las): Por que todos os aplicativos podem usar as classes System e String sem importá-las primeiro?.

#### 3.9 (Usando uma Classe sem Importá-la): Explique como um programa poderia usar a classe Scanner sem importá-la.

#### 3.10 (Métodos set e get): Explique por que uma classe pode fornecer um método set e um método get para uma variável de instância.

#### 3.11 (Classe Account Modificada): Modifique a classe Account (Fig. 3.8) para fornecer um método chamado withdraw (sacar) que retira dinheiro de uma conta. Assegure que o valor da retirada não exceda o saldo da conta. Se exceder, o saldo deve permanecer inalterado, e o método deve imprimir a mensagem "Withdrawal amount exceeded account balance." Modifique a classe AccountTest (Fig. 3.9) para testar o método withdraw.

#### 3.12 (Classe Invoice): Crie uma classe chamada Invoice que uma loja de hardware poderia usar para representar uma fatura de um item vendido. Uma Invoice deve incluir quatro variáveis de instância: número da peça (String), descrição da peça (String), quantidade comprada (int) e preço por item (double). A classe deve ter um construtor que inicialize as quatro variáveis, e métodos set e get para cada uma. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor total da fatura (multiplica a quantidade pelo preço por item), retornando o valor como double. Se a quantidade não for positiva, ela deve ser definida como 0. Se o preço por item não for positivo, deve ser definido como 0.0. Escreva um aplicativo de teste chamado InvoiceTest.

#### 3.13 (Classe Employee): Crie uma classe chamada Employee que inclua três variáveis de instância: um primeiro nome (String), um sobrenome (String) e um salário mensal (double). Forneça um construtor que inicialize as três variáveis, e métodos set e get para cada variável. Se o salário mensal não for positivo, não defina seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe, crie dois objetos Employee, exiba o salário anual de cada um, aplique um aumento de 10% a cada Employee e exiba novamente o salário anual de cada um.

#### 3.14 (Classe Date): Crie uma classe chamada Date que inclua três variáveis de instância: mês (int), dia (int) e ano (int). Forneça um construtor que inicialize as três variáveis (assumindo que os valores fornecidos estão corretos), e métodos set e get para cada variável. Forneça um método displayDate que exiba o mês, dia e ano separados por barras (/). Escreva um aplicativo de teste chamado DateTest.

#### 3.15 (Removendo Código Duplicado no Método main): Modifique a classe AccountTest (Fig. 3.9) para declarar um novo método static chamado displayAccount que recebe um objeto Account como parâmetro e exibe o nome e o saldo desse objeto. Em seguida, substitua as seis instruções duplicadas no método main por chamadas ao método displayAccount, passando account1 ou account2 como argumento.

Fazendo a Diferença (Making a Difference)
#### 3.16 (Calculadora de Frequência Cardíaca Alvo): Crie uma classe chamada HeartRates com atributos para nome, sobrenome e data de nascimento (mês, dia, ano). Forneça um construtor, métodos set e get para cada atributo. A classe deve incluir métodos para calcular e retornar a idade da pessoa (em anos), a frequência cardíaca máxima (220 menos a idade em anos) e a frequência cardíaca alvo (faixa de 50–85% da frequência cardíaca máxima). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto HeartRates e imprima todas as informações e as taxas cardíacas calculadas.

#### 3.17 (Informatização de Registros de Saúde): Projete uma classe HealthProfile (nome, sobrenome, gênero, data de nascimento: mês, dia, ano, altura: polegadas, peso: libras). A classe deve ter um construtor que receba esses dados, e métodos set e get para cada atributo. A classe também deve incluir métodos que calculem e retornem a idade do usuário, a frequência cardíaca máxima e a frequência cardíaca alvo (veja Ex. 3.16), e o Índice de Massa Corporal (IMC, veja Ex. 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto HealthProfile e imprima todas as informações e os valores calculados, além de exibir a tabela de valores de IMC do Exercício 2.33.

Exercício Opcional do Estudo de Caso de GUI e Gráficos
#### 3.1 Modifique o programa de adição da Fig. 2.7 para usar entrada e saída baseadas em diálogo com os métodos da classe JOptionPane. Será necessário converter a String inserida pelo usuário (retornada por showInputDialog) para um int usando o método static parseInt da classe Integer.