public class Service {
    private static Eleicao eleicao;

    // Construtor da classe
    public Service() {}

    // Função para executar o algoritmo Bubble Sort
    public void getBubbleSort(int[] array) {
        int n = array.length; // Tamanho do array

        //ordenação n-1 vezes
        for (int i = 0; i < n - 1; i++) {
            // Percorrer o array inteiro até a posição (n-i-1)
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar elementos adjacentes
                if (array[j] > array[j + 1]) {
                    // Se o elemento atual for maior que o próximo, fazer uma troca
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //Print dos array
        printArray(array);
    }

    // Função para imprimir o array
    private void printArray(int[] array) {
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Função para pegar resultados das Eleições
    public void getEleicao (int totalEleitores, int votosValidos, int votosBrancos, int votosNulos){
        //Instancio o objeto com tos paramentros da eleicao.
        eleicao = new Eleicao(totalEleitores, votosValidos, votosBrancos, votosNulos);

        // Calcular e exibir os percentuais
        System.out.printf("\nPercentual de votos válidos: %.2f%%\n", eleicao.calcularPercentualValidos());
        System.out.printf("Percentual de votos brancos: %.2f%%\n", eleicao.calcularPercentualBrancos());
        System.out.printf("Percentual de votos nulos: %.2f%%\n", eleicao.calcularPercentualNulos());
    }

    // Função para pegar resultado Fatorial
    public long getFatorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser um inteiro não-negativo.");
        }

        long fatorial = 1; // Inicia o fatorial com 1 (caso especial para 0! e 1!)

        // Calcula o fatorial multiplicando os números de 1 até n
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public int getMultiplos(int x){
        int soma = 0;

        for (int i = 1; i < x; i++) {
            // Verifica se o número é múltiplo de 3 ou 5
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        return soma;
    }

}
