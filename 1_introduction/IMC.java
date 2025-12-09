import java.util.Scanner;

public class IMC {
    //variáveis de atributo
    public float peso;
    public float altura;
    public float imc;


    //construtor
    public IMC(float peso, float altura)
    {
        this.peso = peso;
        this.altura = altura;
    }

    //getters e setters

    //getter do peso
    public float getPeso()
    {
        return peso;
    }    

    //setter do peso
    public void setPeso(float peso)
    {
        if (peso <= 0 || peso >= 500)
        {
            System.out.println("Peso Fora do Intervalo Permitido!");
        }
        else
        {
            this.peso = peso;
        }
    }

    //getter da altura
    public float getAltura()
    {
        return altura;
    }    

    //setter do peso
    public void setAltura(float altura)
    {
        if (altura <= 0 || altura > 3.0)
        {
            System.out.println("Altura Fora do Intervalo Permitido!");
        }
        else
        {
            this.altura = altura;
        }
    }


    //método para calcular imc
    public float calculaImc(float peso, float altura)
    {

        imc = peso/(altura*altura);

        return imc;
    }
    
    //classifica imc
    public void classificaImc(float imc){
        if(imc < 18.5)
        {
            System.out.println("Restulado do IMC: " + imc +"\nClassificação: Abaixo do Peso!");
        }

        else if(imc >= 18.5 && imc < 25)
        {
            System.out.println("Restulado do IMC: " + imc +"\nClassificação: Abaixo Peso Normal!");
        }

        else if(imc >= 25 && imc < 30)
        {
            System.out.println("Restulado do IMC: " + imc +"\nClassificação: Sobrepreso!");
        }

        else if(imc >= 30 && imc < 35)
        {
            System.out.println("Restulado do IMC: " + imc +"\nClassificação: Obesidade Grau I!");
        }

        else if(imc >= 35 && imc < 40)
        {
            System.out.println("Restulado do IMC: " + imc +"\nClassificação: Obesidade Grau II!");
        }

        else
        {
            System.out.println("Restulado do IMC: " + imc +"\nClassificação: Obesidade Grau III!");
        }

    }

    public static void main(String[] args)
    {
        //declarando um objeto scanner para leitura
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULANDO E CLASSIFICANDO IMC\n");
    
        //lendo o peso
        System.out.println("Peso = ");
        float peso_inserido = scanner.nextFloat(); 

        //criando um objeto da classe imc
        IMC imcObj = new IMC(0, 0);

        //setando
        imcObj.setPeso(peso_inserido);

        //lendo altura
        System.out.println("\nAltura = ");
        float altura_inserida = scanner.nextFloat();

        //setando
        imcObj.setAltura(altura_inserida);

        //\n
        System.out.println("\n");

        //calculado o imc
        float imc_calculado = imcObj.calculaImc(peso_inserido, altura_inserida);

        //classificando esse imc
        imcObj.classificaImc(imc_calculado);

        //fechando o scanner
        scanner.close();
    }

}