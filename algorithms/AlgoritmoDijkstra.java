public class AlgoritmoDijkstra {

    //qtadade de vertices
    private int quantidadeVertices;
    
    //matriz c os vertices do grafo
    public int[][] grafo;

    //construtor
    public AlgoritmoDijkstra(int quantidadeVertices) {
        this.quantidadeVertices = quantidadeVertices;
        this.grafo = new int[quantidadeVertices][quantidadeVertices];
    }

    //calcula dist minmima com um for verificando os vizinhos smp
    private int distanciaMinima(int[] distancias, boolean[] visitados) {
        int distanciaMinima = Integer.MAX_VALUE;
        int indiceMinimo = -1;

        for (int vizinho = 0; vizinho < quantidadeVertices; vizinho++) {
            if (!visitados[vizinho] && distancias[vizinho] <= distanciaMinima) {
                distanciaMinima = distancias[vizinho];
                indiceMinimo = vizinho;
            }
        }

        return indiceMinimo;
    }

    //mostra o menor caminho
    private void imprimirCaminho(int[] distancias, int[] pai, int origem, int destino) {
        System.out.print("Caminho mínimo entre " + origem + " e " + destino + ": ");

        int caminho = destino;
        System.out.print(caminho);

        //loop while pra imprimir todos os vértices anteriores
        while (pai[caminho] != -1) {
            System.out.print(" <- " + pai[caminho]);
            caminho = pai[caminho];
        }

        System.out.println("\nCusto total: " + distancias[destino]);
    }

    public void dijkstra(int origem, int destino) {

        int[] distancias = new int[quantidadeVertices];
        boolean[] visitados = new boolean[quantidadeVertices];
        int[] pai = new int[quantidadeVertices];

        // Inicialização
        for (int i = 0; i < quantidadeVertices; i++) {
            distancias[i] = Integer.MAX_VALUE;
            visitados[i] = false;
            pai[i] = -1;
        }

        distancias[origem] = 0;

        // Loop principal
        for (int contagem = 0; contagem < quantidadeVertices - 1; contagem++) {

            int atual = distanciaMinima(distancias, visitados);
            visitados[atual] = true;

            for (int vizinho = 0; vizinho < quantidadeVertices; vizinho++) {

                if (!visitados[vizinho]
                        && grafo[atual][vizinho] != 0
                        && distancias[atual] != Integer.MAX_VALUE
                        && distancias[atual] + grafo[atual][vizinho] < distancias[vizinho]) {

                    distancias[vizinho] = distancias[atual] + grafo[atual][vizinho];
                    pai[vizinho] = atual;
                }
            }
        }

        imprimirCaminho(distancias, pai, origem, destino);
    }

    //metodo main q testa o algoritmo
    public static void main(String[] args) {

        int quantidadeVertices = 5;

        int[][] grafo = {
            {0, 3, 2, 0, 0},
            {3, 0, 1, 5, 0},
            {2, 1, 0, 3, 6},
            {0, 5, 3, 0, 4},
            {0, 0, 6, 4, 0}
        };

        int origem = 0;
        int destino = 4;

        AlgoritmoDijkstra algoritmo = new AlgoritmoDijkstra(quantidadeVertices);
        algoritmo.grafo = grafo;

        algoritmo.dijkstra(origem, destino);
    }
}