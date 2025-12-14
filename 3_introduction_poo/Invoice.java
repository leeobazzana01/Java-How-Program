// Crie uma classe chamada Invoice que uma loja de hardware poderia usar para representar uma fatura de um item vendido. 
// Uma Invoice deve incluir: número da peça (String), descrição da peça (String), quantidade comprada (int) e preço por item (double)
// A classe deve ter um construtor que inicialize as quatro variáveis, e métodos set e get para cada uma. 
// Além disso, forneça um método chamado getInvoiceAmount que calcula o valor total da fatura (multiplica a quantidade pelo preço por item), retornando o valor como double. 
// Se a quantidade não for positiva, ela deve ser definida como 0. Se o preço por item não for positivo, deve ser definido como 0.0. 
// Escreva um aplicativo de teste chamado InvoiceTest.

import java.util.Scanner;

public class Invoice{
    private String numero_peca;
    private String descricao_peca;
    public int quantidade_comprada;
    public float preco_item;

    public Invoice(String numero_peca, String descricao_peca, int quantidade_comprada, float preco_item){
        this.numero_peca = numero_peca;
        this.descricao_peca = descricao_peca;
        this.quantidade_comprada = quantidade_comprada;
        this.preco_item = preco_item;
    }    

    //getters
    public String getNumero(){
        return numero_peca;
    }

    public String getDescricao(){
        return descricao_peca;
    }

    public int getQuantidade(){
        return quantidade_comprada;
    }

    public float getPreco(){
        return preco_item;
    }

    //setters
    public void setNumero(String numero_peca)
    {
        this.numero_peca = numero_peca;
    }

    public void setDescricao(String descricao_peca)
    {
        this.descricao_peca = descricao_peca;
    }

    public void setQuantidade(int quantidade_comprada)
    {
        this.quantidade_comprada = quantidade_comprada;
    }

    public void setPreco(float preco_item)
    {
        this.preco_item = preco_item;
    }

   //método pra calcular preço
    public float getInvoiceAmount(int quantidade_comprada, float preco_item){
        float invoice_amount = quantidade_comprada*preco_item;

        return invoice_amount; 
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        scan.close();
    }
}