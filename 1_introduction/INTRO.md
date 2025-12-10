# Introdução a Java, Computadores e Internet

## Fundamentos da Programação Orientada a Objetos (OOP)

Estes exercícios exigem que você utilize a terminologia correta de OOP (Seção 1.5) para descrever como objetos de software são estruturados e como interagem.

**1. Analogia de Classes e Objetos: Usando a analogia do automóvel, explique a diferença fundamental entre uma Classe (como o projeto de engenharia de um carro) e um Objeto (como um carro construído e pronto para uso).**
    
O conceito de classe diz respeito a uma **entidade** que trabalha como um **molde para criamos objetos**. É como uma forma de gelo, por exemplo. Nós não conseguimos resfriar a bebida com ela, porém, podemos utilizar o molde e um método (colocar água e aguardar um tempo) para então o gelo se formar e usarmos na bebida.

Outro exemplo seria o de um carro. A **classe** pode ser interpretada como o **projeto que contém as características (atributos)** do carro. Após o processo de fabricação, a equipe de engenharia obtém o objeto carro.

Exemplo: bastae olhar o código **Carro.java** 
    
◦ Defina o processo de instanciação.
Diz respeito ao **processo de criar/instanciar** uma classe. 

◦ Como a reutilização de classes existentes contribui para economizar tempo, esforço e construir sistemas mais confiáveis?
Em equipes extensas de Engenharia de software, é adequado e recomendado usar Lingaugens e Frameworks orientados a objetos. Isso porque reduzimos consideravelmente a quantidade de operações necessárias para criar um objetos parecidos, que mudam pouco, aumentando a escalabilidade. 


2. Estrutura Interna de um Objeto:

◦ Defina Atributos e Variáveis de Instância (Instance Variables). Se você modelasse um objeto "Conta Bancária", qual seria o atributo chave, e por que cada objeto de conta bancária só conhece o seu próprio saldo?

Os **Atributos são as características das Classes**, no caso do carro nós temos o modelo, marca, ano, kilometragem, entre outros. As **instance variables** são variáveis que **instanciam os Atributos**, ou seja, **criam os atributos específicos para os objetos desejados.**

Exemplo:

```java
public class Carro {

    // Atributos
    private String modelo;
    private String marca;
    private int ano;
    private boolean ligado;
    private float kilometragem;

 .
 .
 .
```
Os atributos são as características e as variáveis de instância, por sua vez, são os atributos declarados acima.
Ao criar uma classe conta bancária, o atributo chave é o CPF ou ID do usuário diferencia o objeto dos demais. O saldo seria um atributo privado para evitar qualquer tipo de vazamento de dado ou até inconsistência.

◦ Defina Comportamentos e Métodos. Como um programa faz com que um objeto execute uma tarefa (como depositar dinheiro), utilizando o conceito de mensagens?
**Métodos** são as **ações que podem ser executadas pelas classes**. Os **métodos principais** são: **Construtor** (que 'constroi' o objeto e as características de fato), os métodos **getters e setters** para obter (retornar um atributo ao usuário) ou setar um atributo, e também os métodos principais da classe. O programa **altera o saldo da conta** através de um método que **passa como parâmetro o saldo** e então altera esse valor.


3. Princípios de Engenharia de Software:

◦ Explique a importância do Encapsulamento e da Ocultação da Informação (Information Hiding) na OOP. Por que os objetos não devem saber como outros objetos são implementados?
A **ocultação** é fundamental para **evitar o vazamento de dados sensíveis** entre objetos e, consequentemente, usuários de sistema. Ocultar informações faz parte da estratégia para o desenvolvimento ideal de padrões de projeto e projeto profissionais de fato.


◦ Descreva a Herança (Inheritance). Como uma subclasse como "conversível" se relaciona com sua superclasse "automóvel", e qual é o benefício dessa relação para o desenvolvimento de novas classes?
A herança, como sugerigo pelo nome, é quando uma classe **herda atributos e métodos de uma classe pai**. Os benefícios envolvem:  **Extensibilidade**, **manutenabilidade do código**, **modularização**, **eficiência no desenvolvimento**, entre outros aspectos.
Uma classe conversível iria herdar as característiacas, como rodas, bancos, acessórios, e muito mais, da superclasse. Os benefícios envolvem extensibilidade, pois ficaria mais fácil e menos repetitivo criar essa classe conversível, além de modularização, facilidade de implementação, entre outros. 

◦ Defina Interfaces. Qual é o seu papel em permitir que o desenvolvedor diga aos objetos "o que fazer, mas não como fazê-lo," usando a analogia das capacidades básicas de direção de um carro?
Interfaces são **coleções de métodos** que dizem ao objeto **o que fazer mas não como fazer**. 
Por exemplo, na classe carro que depois se tornou a base para várias outras, temos um método acelerar. Se declaramos uma belina, por exemplo, ela irá herdar as características da classe carro, sabendo acelerar, porém sem como exatamente está acelerando. 

4. Projeto de Sistemas (OOAD e UML):

◦ Qual é a diferença entre Análise e Projeto Orientados a Objetos (OOAD) — determinar os requisitos (o que) e desenvolver o design (como) — e a Programação Orientada a Objetos (OOP)?
Desenvolver projetos de sistemas orientados a objetos envolve muito mais do que apenas orientar objetos do mundo real a objetos em formato de código. Isso irá envolver a estruturação (modularização) do projeto, pensar em arquiteturas, tendo em vista quantos usuários queremos atingir, e vários outros fatores. Por isso, para desenvolver sistemas, precisamos determinar muito bem os requisitos, a fim de evitar erros que comprometem a aplicação.

◦ O que é a **UML (Unified Modeling Language)**, e qual é a sua função em um processo de design de software?
É a **Linguagem gráfica** mais popular para projetos voltados a sistemas orientados a objetos. O objetivo é **comunicar os resultados de qualquer Design** que será orientado a objetos.

## II. Compilação e Execução em Bytecode Java

Estes exercícios cobrem o ambiente de desenvolvimento Java e o processo de portabilidade por meio do bytecode.

5. O Ciclo de Desenvolvimento Java: Liste e descreva brevemente as cinco fases típicas que um programa Java passa, desde a criação do código até a execução,.

As **principais fases do Desenvolvimento são**:

>1. Edição: o programador estrutura o código em um editor
>2. Compilação: esse código será compilado e transformado em uma linguagem intermediária, a linguagem que será executada pela máquina conhecida como **bytecode**. 
>3. Carregamento: o código bytecode é carregado para a memória
>4. Verificação: o código é verificado para garantir segurança
>5. Execução: A **Máquina Virtual Java** lê os bytecodes e executa o programa.


6. Compilação em Bytecode (Fases 1 e 2):

◦ Na Fase 1, qual é a extensão de arquivo utilizada para salvar o código fonte?
Por padrão, os **códigos desenvolvidos em Linguagem Java terminam em .java no final**.

◦ Na Fase 2, qual é o nome do comando do JDK que invoca o compilador Java?
**javac 'codigo.java'**

◦ O que são bytecodes, e qual é a extensão de arquivo que o compilador produz e que os contém?
São os códigos **.class**

7. A Máquina Virtual e a Portabilidade (Fases 3, 4 e 5):

◦ Defina o que é uma Máquina Virtual (VM), especificamente a JVM (Java Virtual Machine),. Por que os bytecodes são considerados independentes de plataforma (platform independent) e, portanto, portáteis?
Máquina Virtual é um mecanismo de virtualização, ou seja, ela destina um espaço em memória para o armazenamento e execução de um determinado código. Quando convertemos o código, originalmente na linguagem de programação, para **bytecode**, esse código ficará salvo em um formato binário de bytes, em uma linguagem quase que universal para todos os dispositivos. Porém, quem 'fala' essa Linguagem é justamente a JVM, convertendo os bytecodes para vários tipos de dispositivos diferentes.

◦ Qual é a função do Carregador de Classes **(Class Loader)** na Fase 3 (Carregamento)?
Ele irá carregar as classes para a memória.

◦ Na Fase 4 (Verificação), qual é o papel do Verificador de Bytecode (Bytecode Verifier) em relação à segurança do Java,?
O Verificador Bytecode confere, antes de executar, se não há nenhum código malicioso ou algo do tipo nesses bytes.

8. A Dupla Compilação e Desempenho: Explique em detalhes o conceito das duas fases de compilação que os programas Java sofrem: a compilação inicial para bytecodes e a compilação final durante a execução,. Qual é a função do Compilador Just-In-Time (JIT), como o Java HotSpot™, e como ele melhora o desempenho ao procurar por hot spots?

## III. Exercícios de Aplicação e Pesquisa (Making a Difference)

Estes exercícios incentivam a pesquisa de problemas do mundo real, aplicando o pensamento algorítmico e a estrutura de classes, preparando você para a codificação em capítulos futuros.

9. (Teste de Condução: Calculadora de Pegada de Carbono) Websites como TerraPass e Carbon Footprint fornecem calculadoras de pegada de carbono. Faça um teste de condução com essas calculadoras (use as URLs fornecidas no material de origem) para determinar sua pegada de carbono. Para se preparar para exercícios futuros, pesquise na web as fórmulas para calcular as pegadas de carbono.

10. (Teste de Condução: Calculadora de Índice de Massa Corporal (IMC)) O Departamento de Saúde e Serviços Humanos dos Estados Unidos fornece uma calculadora de IMC. Use-a para calcular seu próprio IMC. Para se preparar para um exercício futuro, pesquise na web as fórmulas para calcular o IMC.
**Resposta: IMC.java**

11. (Atributos de Veículos Híbridos) Pensando em termos de classes, pesquise quatro ou cinco carros híbridos populares e liste o máximo de atributos relacionados a híbridos que você conseguir (por exemplo, milhas por galão na cidade/estrada e atributos específicos da bateria).

12. (Neutralidade de Gênero) Se você fosse criar um programa para substituir palavras de gênero específico por palavras neutras, explique o procedimento (o algoritmo) que você usaria para percorrer manualmente um parágrafo de texto e realizar essas substituições. Discuta como esse procedimento poderia gerar um termo estranho como "woperchild".