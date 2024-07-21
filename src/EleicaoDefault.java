public interface EleicaoDefault {

    default double calcularPercentualValidos() {
        return 0;
    };

    default double calcularPercentualBrancos() {
        return 0;
    };

    default double calcularPercentualNulos() {
        return 0;
    };
}
