import java.util.Scanner;

public class ImparPar{
    //atributos
    public int numero;

    public ImparPar(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    //método pra verificar se é par ou impar
    public void verificaParidade(int numero){
        if (numero % 2 == 0){
            System.out.println("Par");
            return;
        }
        else{
            System.out.println("Ímpar");
            return;
        }
    }


    //main
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("TESTE DE PARIDADE\n");

        System.out.print("Número: ");

        //verificando se a entrada é inteiro
        if (scan.hasNextInt()){
            int numero1 = scan.nextInt();

            ImparPar verificaparidade = new ImparPar(numero1);

            //setando
            verificaparidade.setNumero(numero1);

            //testando
            verificaparidade.verificaParidade(numero1);

        }
        else{
            System.out.println("Entrada Inválida!!!\n");
        }
        
        scan.close();
    }
} 