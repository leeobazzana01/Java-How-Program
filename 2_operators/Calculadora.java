public class Calculadora
{
    public float numero1, numero2;
    public char operador;

    public Calculadora(float numero1, char operador, float numero2)
    {
        this.numero1 = numero1;
        this.operador = operador;
        this.numero2 = numero2;
    }

    //getters e setters
    //numero 1
    public float getNumeroUm()
    {
        return numero1;
    }

    public void setNumeroUm(float numero1)
    {
        this.numero1 = numero1;
    }


    //numero 2
    public float getNumeroDois()
    {
        return numero2;
    }

    public void setNumeroDois(float numero2)
    {
        this.numero2 = numero2;
    }

    //operador
    public char getOperador()
    {
        return operador;
    }

    public void setOperador(char operador)
    {
        if (operador != '+' && operador != '-' && operador != '*' && operador != '/')
        {
            System.out.println("Operação Inválida!");
        }
        else{
            this.operador = operador;
        }
        
    }

    //operadores da calculadora

    //soma
    public float somaNumeros(float numero1, float numero2)
    {
        return numero1 + numero2;
    }

    // subtração
    public float subtraiNumeros(float numero1, float numero2)
    {
        return numero1 - numero2;
    }

    // multiplica
    public float multiplicaNumeros(float numero1, float numero2)
    {
        return numero1 * numero2;
    }

    //divide
    public float divideNumeros(float numero1, float numero2)
    {
        if (numero2 != 0)
        {
            return numero1/numero2;
        }
        else
        {
            System.out.println("Divisão por Zero Inválida!!!");
            return 0;
        }
        
    }

    // método para verificar o operador e realizar a operação
    public float realizaOperacao(float numero1, char operador, float numero2)
    {
        // fazendo a lógica de verificação e operação
        switch (operador)
        {
            case '+':
                float resultadoSoma = somaNumeros(numero1, numero2);
                System.out.println("Resultado da Soma: " + resultadoSoma);
                return resultadoSoma;

            case '-':
                float resultadoSub = subtraiNumeros(numero1, numero2);
                System.out.println("Resultado da Subtração: " + resultadoSub);
                return resultadoSub;

            case '*':
                float resultadoMul = multiplicaNumeros(numero1, numero2);
                System.out.println("Resultado da Multiplicação: " + resultadoMul);
                return resultadoMul;

            case '/':
                float resultadoDiv = divideNumeros(numero1, numero2);
                System.out.println("Resultado da Divisão: " + resultadoDiv);
                return resultadoDiv;

            default:
                System.out.println("Opção Inválida!!");
                return 0;
        }
    }   

    // main
    public static void main(String[] args)
    { 
        // criando um objeto calculadora
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //mensagem do cabeçalho
        System.out.println("CALCULADORA");

        //mostrando as opções
        System.out.println("Operações Disponíveis: \nSoma: +\nSubtração: (-)\nMultiplicação: (*)\nDivisão: (/)");

        //solicitando numero 1
        System.out.println("Numero = ");
        float n1 = scanner.nextFloat();

        //criando um objeto calculadora
        Calculadora calc = new Calculadora(0,'c', 0);

        // settando o valor
        calc.setNumeroUm(n1);

        // solicitando operacao
        System.out.println("Operacao = ");
        char op = scanner.next().charAt(0); //USANDO O MÉTODO CHART PARA LER APENAS UM CARACTERE

        //setando a operacao
        calc.setOperador(op);

        // solicitando e setando n2
        System.out.println("Numero = ");
        float n2 = scanner.nextFloat(); 

        calc.setNumeroDois(n2);

        float resultado = calc.realizaOperacao(n1, op, n2);

        scanner.close();
    }
}