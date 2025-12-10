import java.util.Scanner;

public class CrescimentoPopulacional{

    public long populacao_inicial;
    public float taxa_crescimento;
    public int ano;
    public int ano_inserido;

    //construtor
    public CrescimentoPopulacional(long populacao_inicial, float taxa_crescimento, int ano, int ano_inserido)
    {
        this.populacao_inicial = populacao_inicial;
        this.taxa_crescimento = taxa_crescimento;
        this.ano = ano;
        this.ano_inserido = ano_inserido;
    }

    //getters e setters

    //getters das variáveis
    public long getPopulacaoInicial()
    {
        return populacao_inicial;
    }

    public float getTaxaCrescimento()
    {
        return taxa_crescimento;
    }

    public int getAno()
    {
        return ano;
    }

    //setters das variáveis 
    public void setPopulacaoInicial(long populacao_inicial)
    {
        if(populacao_inicial <= 0){
            System.out.println("Valor Inválido!\n");
        }
        else{
            this.populacao_inicial = populacao_inicial;
        }
    }

    public void setTaxaCrescimento(float taxa_crescimento)
    {
        this.taxa_crescimento = taxa_crescimento;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    //agr os getters e setters do ano inserido pelo usuario
    public void setAnoInserido(int ano_inserido)
    {
        if(ano_inserido <= 2025)
        {
            System.out.println("Insira um ano após 2025!\n");
            System.exit(0);
        }
        else{
            this.ano_inserido = ano_inserido;
        }
    }

    public int getAnoInserido()
    {
        return ano_inserido;
    }

    //métodos para calcular a população futura

    //obtendo ciclos
    public int obterCiclos(int ano, int ano_inserido)
    {
        int ciclos = ano_inserido - ano;

        return ciclos;
    }


    public long calculaPopulacao(long populacao_inicial, float taxa_crescimento, int ciclos)
    {
        //variavel da populacao final q sera retornada
        long populacao_final = 0; 

        for(int i = 0; i <= ciclos; i++) {
            populacao_final = (long) (populacao_inicial + (populacao_inicial * taxa_crescimento));
            
            populacao_inicial = populacao_final; //para trocar os valores e continuarmos aumentando a popularcao
        }

        return populacao_final;
    }

    public static void main(String[] args)
    {
        //inicializa o scanner
        Scanner scanner = new Scanner(System.in); 

        //cabeçalho
        System.out.println("CALCULADORA DE CRESCIMENTO POPULACIONAL\n");

        //inicializando o objeto
        CrescimentoPopulacional calc_crescimento = new CrescimentoPopulacional(8260000000L, 0.0085f, 2025, 0);

        //setters
        calc_crescimento.setPopulacaoInicial(8260000000L);
        calc_crescimento.setTaxaCrescimento(0.0085f);
        calc_crescimento.setAno(2025);

        //solicita o ano
        System.out.println("Ano: ");
        
        //lê o ano
        int ano_digitado = scanner.nextInt();
        
        //seta o ano
        calc_crescimento.setAnoInserido(ano_digitado);

        //calculando os ciclos
        int ciclos = calc_crescimento.obterCiclos(calc_crescimento.getAno(), ano_digitado);

        //calculando a populacao
        long populacao_calculada = calc_crescimento.calculaPopulacao(
            calc_crescimento.getPopulacaoInicial(), 
            calc_crescimento.getTaxaCrescimento(), 
            ciclos
        );

        String mensagem = "População Estimada: ";

        System.out.println(mensagem + populacao_calculada); //impressao valida

        scanner.close();
    }    
}