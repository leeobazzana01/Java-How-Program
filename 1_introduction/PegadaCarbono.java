import java.util.Scanner;

public class PegadaCarbono {
    
    //atributos
    public float gasolina;
    public float eletricidade;
    public float distancia_transporte;
    public float gas_cozinha = 19;
    public float residuos_gerados;
    public float consumo;
    public float alimentacao;
    public float pegada_total;


    public PegadaCarbono(float gasolina, float eletricidade, float distancia_transporte, float gas_cozinha, float residuos_gerados, float consumo, float alimentacao)
    {
        this.gasolina = gasolina;
        this.eletricidade = eletricidade;
        this.distancia_transporte = distancia_transporte;
        this.gas_cozinha = gas_cozinha;
        this.residuos_gerados = residuos_gerados;
        this.consumo = consumo;
        this.alimentacao = alimentacao;
    }

    //GETTERS E SETTERS
    

    //getters e setters da gasolina
    public float getGasolina()
    {
        return gasolina;
    }   

    public void setGasolina(float gasolina)
    {
        if (gasolina < 0)
        {
            System.out.println("Consumo de Combustível Inválido!\n");
        }
        else
        {
            this.gasolina = gasolina;
        }
    }

    //getters e setters da eletricidade
    public float getEletricidade()
    {
        return eletricidade;
    }   

    public void setEletricidade(float eletricidade)
    {
        if (eletricidade < 0)
        {
            System.out.println("Consumo de Eletricidade Inválido!\n");
        }
        else
        {
            this.eletricidade = eletricidade;
        }
    }

    //getters e setters da distancia_transporte
    public float getDistanciatransporte()
    {
        return distancia_transporte;
    }   

    public void setDistanciatransporte(float distancia_transporte)
    {
        if (distancia_transporte < 0)
        {
            System.out.println("Distância Inválido!\n");
        }
        else
        {
            this.distancia_transporte = distancia_transporte;
        }
    }

    //getters e setters de consumo
    public float getGascozinha()
    {
        return gas_cozinha;
    }   

    public void setGascozinha(float gas_cozinha)
    {
        if (gas_cozinha < 0)
        {
            System.out.println("Consumo Inválido!\n");
        }
        else
        {
            this.gas_cozinha = gas_cozinha;
        }
    }


    //getters e setters da gaz cozinha
    public float getResiduos()
    {
        return residuos_gerados;
    }   

    public void setResiduos(float residuos_gerados)
    {
        if (residuos_gerados < 0)
        {
            System.out.println("Quantidade de Resíduos Inválida!\n");
        }
        else
        {
            this.residuos_gerados = residuos_gerados;
        }
    }

    //getters e setters de consumo
    public float getConsumo()
    {
        return consumo;
    }   

    public void setConsumo(float consumo)
    {
        if (consumo < 0)
        {
            System.out.println("Valor de Consumo Inválido!\n");
        }
        else
        {
            this.consumo = consumo;
        }
    }


    //getters e setters de consumo
    public float getAlimentacao()
    {
        return alimentacao;
    }   

    public void setAlimentacao(float alimentacao)
    {
        if (alimentacao < 0)
        {
            System.out.println("Valor de Consumo Inválido!\n");
        }
        else
        {
            this.alimentacao = alimentacao;
        }
    }

    public float calculaTotal(float gasolina, float eletricidade, float distancia_transporte,  float residuos_gerados, float consumo, float alimentacao)
    {
        double pegada_totalD = (gasolina * 2.3) + (eletricidade * 0.6) + (distancia_transporte * 0.02) + 19 + (0.1*residuos_gerados) + (0.0007 * consumo) + (0.150*alimentacao);

        float pegadatotal = (float) pegada_totalD; 

        return pegadatotal;
    }
    
    public static void main(String[] args)
    {
        //inicializando um objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULO DA PEGADA DE CARBONO\n");

        //criando um objeto
        PegadaCarbono pegada = new PegadaCarbono(0, 0, 0, 0, 0, 0, 0);

        //lendo variáveis
        System.out.println("Consumo de Gasolina (L): ");
    
        //leio a qtdade de gasolina
        double gasolinaD = scanner.nextFloat();

        //convertendo pra float
        float gasolina = (float) gasolinaD;

        //setar
        pegada.setGasolina(gasolina);

        System.out.println("Consumo de Eletricidade (Kw): ");
    
        //leio a qtdade de eletricidade
        double eletricidadeD = scanner.nextFloat();

        //convertando 
        float eletricidade = (float) eletricidadeD;
        
        //setar
        pegada.setEletricidade(eletricidade);        

        System.out.println("Distância Transporte (Km): ");
    
        //leio a qtdade de distancia de transportte
        double distanciaD = scanner.nextFloat();

        //convertando 
        float distancia = (float) distanciaD;

        //setar
        pegada.setDistanciatransporte(distancia);

        System.out.println("Resíduos Gerados (Kg): ");
    
        //leio a qtdade de residuos
        double residuos_geradosD = scanner.nextFloat();

        //convertando 
        float residuos_gerados = (float) residuos_geradosD;

        //setar
        pegada.setResiduos(residuos_gerados);

        System.out.println("Consumo (R$): ");
    
        //leio a qtdade de grana gaste em consumo
        double consumoD = scanner.nextFloat();

        //convertando 
        float consumo = (float) consumoD;
        
        //setar
        pegada.setConsumo(consumo);
        
        System.out.println("Alimentação (R$): ");
    
        //leio a qtdade de grana gasto c alimento
        double alimentacaoD = scanner.nextFloat();

        //convertando 
        float alimentacao = (float) alimentacaoD;

        //setar
        pegada.setAlimentacao(alimentacao);

        //calculando o total
        float total = pegada.calculaTotal(gasolina, eletricidade, distancia, residuos_gerados, consumo, alimentacao);

        String mensagem = "Pegada Mensal de C02 (em Kg/Mês): "; 

        System.out.printf("%s%.2f\n", mensagem, total);

        //fechando o scanner 
        scanner.close();
    }
}