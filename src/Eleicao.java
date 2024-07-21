public class Eleicao implements EleicaoDefault {
    private final int totalEleitores;
    private final int votosValidos;
    private final int votosBrancos;
    private final int votosNulos;

    // Construtor da classe
    public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    // Método para calcular o percentual de votos válidos em relação ao total de eleitores
    public double calcularPercentualValidos() {
        return (double) votosValidos / totalEleitores * 100;
    }

    // Método para calcular o percentual de votos brancos em relação ao total de eleitores
    public double calcularPercentualBrancos() {
        return (double) votosBrancos / totalEleitores * 100;
    }

    // Método para calcular o percentual de votos nulos em relação ao total de eleitores
    public double calcularPercentualNulos() {
        return (double) votosNulos / totalEleitores * 100;
    }
}
