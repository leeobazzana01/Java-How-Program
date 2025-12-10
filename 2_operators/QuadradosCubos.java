//usando uma lista pra armazenar os valores
import java.util.Arrays;
import java.util.List;


public class QuadradosCubos{
    
    //construtor vazio
    public void QuadradosCubos(){
    }

    //metodo p calcular quadrado

    public int calculaQuadrado(int x){
        return x*x;
    }  

    public int calculaCubo(int x){
        return x*x*x;
    }  


    public static void main(String[] args){
        //declarando a lista
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //mensagem do header
        System.out.println("Calculando Quadrados e Cubos da Tabuada\n");

        //criando um objeto p usar os métodos
        QuadradosCubos quadrados_cubos = new QuadradosCubos();

        //mostrando msg na tela
        System.out.println("Valor\t\tQuadrado\tCubo");

        //percorrendo com foreach p imprimir a coluna dos valores
        numeros.forEach(numero -> System.out.print(numero));
        System.out.println("\t\t");
        numeros.forEach(quadrado -> quadrados_cubos.calculaQuadrado(numero));
        numeros.forEach(numero -> System.out.print(quadrado));
        System.out.println("\t\t");
        numeros.forEach(cubo -> quadrados_cubos.calculaCubo(numero));
        numeros.forEach(numero -> System.out.println(cubo));



        //percorrendo com foreach p imprimir a coluna dos quadrados
        numeros.forEach(numero -> System.out.println(numero));
    }
}
