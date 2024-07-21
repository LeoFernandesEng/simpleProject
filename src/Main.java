public class Main {

    private static final Service service = new Service();
    // Função principal para executar o programa
    public static void main(String[] args) {

        // Votos
        int totalEleitores = 1000, votosValidos = 800, votosBrancos = 50,votosNulos = 150;
        System.out.println("\nResultados Eleição: ");
        service.getEleicao(totalEleitores, votosValidos, votosBrancos,votosNulos);

        // Bubble Sort
        int[] array = {5, 3, 2, 4, 7, 1, 0, 6};
        System.out.print("\n Bouble Sort: ");
        service.getBubbleSort(array);

        //Fatorial
        int n = 5;
        System.out.println("\n Fatorial: \n" + service.getFatorial(n));

        // Soma Multiplos
        int x = 10;
        System.out.println("\n Soma Multiplos de " + x + ": \n" + service.getMultiplos(x));

    }
}
