//Crie uma classe chamada Employee que inclua três variáveis de instância
//um primeiro nome (String)
//um sobrenome (String) 
//salário mensal (double)
//Forneça um construtor que inicialize as três variáveis, e métodos set e get para cada variável. 
//Se o salário mensal não for positivo, não defina seu valor. 
//Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe
//Crie dois objetos Employee, exiba o salário anual de cada um, aplique um aumento de 10% a cada Employee
//Exiba novamente o salário anual de cada um.

import java.util.Scanner; 

public class Employee {

    //variáveis estáticas
    private static String name;
    private static String last_name;
    private static double income;

    //construtor
    public Employee {
        this.name = name;
        this.last_name = last_name;
        this.income = income;
    }

    //getters 
    public String getName():
    {
        return name;
    }

    public String getLastName():
    {
        return last_name;
    }

    public double getincome():
    {
        return income;
    }

    //setters
    public void setName(String name)
    {

        if (name != " "){
            this.name = name;
            System.out.println("Nome cadastrado com sucesso!!!\n");
        }

        else --
        {
            System.out.println("Nome vazio Inválido!!!\n");
        }
    }

    public void setLastName(String last_name)
    {

        if (last_name != " "){
            this.name = last_name;
            System.out.println("Nome cadastrado com sucesso!!!\n");
        }

        else 
        {
            System.out.println("Nome vazio Inválido!!!\n");
        }
    }

    public void setIncome(double income)
    {

        if (income < 0){
            System.out.println("Salário Inválido: Valor Negativo\n!!!");
        }

        else 
        {
            this.income=income;
        }
    }

    public statipublicc void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        scan.close();
    }   
}