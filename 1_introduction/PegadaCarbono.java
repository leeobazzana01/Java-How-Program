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
    public float pegada_total = 0;


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

    public void setGasolina(float gas_cozinha)
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
            this.distancia_transporte = distancia_transporte;
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
        pegada_total = gasolina * 2,3 + eletricidade * 0,6 + distancia_transporte * 0,02 + gas_cozinha + 0,1 * residuos_gerados + 0,0007 * consumo + 150*alimentacao;

        return pegada_total;
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
        float gasolina = scanner.nextFloat();

        //setar
        pegada.setGasolina(gasolina);

        System.out.println("Consumo de Eletricidade (Kw): ");
    
        //leio a qtdade de eletricidade
        float eletricidade = scanner.nextFloat();

        //setar
        pagada.setEletricidade(eletricidade);

        System.out.println("Distância Transporte (Km): ");
    
        //leio a qtdade de distancia de transportte
        float distancia = scanner.nextFloat();

        //setar
        pagada.setDistanciatransporte(distancia);

        System.out.println("Resíduos Gerados (Kg): ");
    
        //leio a qtdade de residuos
        float residuos_gerados = scanner.nextFloat();

        //setar
        pagada.setResiduos(residuos_gerados);


        System.out.println("Consumo (R$): ");
    
        //leio a qtdade de grana gaste em consumo
        float consumo = scanner.nextFloat();

        //setar
        pagada.setConsumo(consumo);
        

        System.out.println("Alimentação (R$): ");
    
        //leio a qtdade de grana gasto c alimento
        float alimentacao = scanner.nextFloat();

        //setar
        pagada.setAlimentacao(alimentacao);

        //calculando o total
        float total = pegada.calculaTotal();

        System.out.println("Pegada Mensal de C02 (em Kg/Mês): ", + total);
    }
}