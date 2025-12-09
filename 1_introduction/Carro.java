public class Carro {

    //atributos
    private String modelo;
    private String marca;
    private int ano;
    private boolean ligado;
    private float kilometragem;

    //construtor
    public Carro(String modelo, String marca, int ano, boolean ligado, float kilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligado = ligado;
        this.kilometragem = kilometragem;
    }

    //getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    
    //metodos da classe

    //p apresentar
    public void apresentarCarro() {
        System.out.println("Esse é o " + modelo + " da marca " + marca + ", ano " + ano + ".");
    }

    //p dirigir o carro
    public void dirigirCarro() {

        if (!ligado) {
            System.out.println("O carro está desligado. Ligando o carro...");
            ligado = true;
        }

        System.out.println("Dirigindo...");

        System.out.println("Desligando o carro...");
        ligado = false;
    }
}
