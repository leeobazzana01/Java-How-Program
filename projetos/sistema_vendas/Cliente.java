import java.util.Scanner;

public class Cliente{
    private String nome_completo;
    private String cpf;

    //construtor
    public Cliente(String nome_completo, String cpf){
        this.nome_completo = nome_completo;
        this.cpf = cpf;
    }

    //getters 
    public String getNome(){
        return nome_completo;
    }

    public String getCpf(){
        return cpf;
    }

    public String getValor(){
        return cpf;
    }

    //setters
    public void setNome(){
        Scanner scan = new Scanner(System.in);

        String nome_completo = scan.nextLine();

        if (nome_completo != " " && nome_completo != "_"){
            this.nome_completo = nome_completo;
        }

        else{
            System.out.println("Insira um nome válido!");
        }
        scan.close();
    }

    public void setCpf(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastro de Pessoa Física (CPF):");

        String cpf_inserido = scanner.nextLine();

        int comprimento_string = cpf_inserido.lenght();

        if (comprimento_string == 11){
            this.cpf = cpf;
        }

        else{
            System.out.println("Quantidade de Caracteres Inválida do CPF!");
        }

        scan.close();
    }
}