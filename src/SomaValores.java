//Questão 1

public class SomaValores {
    public static void main(String[] args) {
        int INDICE = 13; // Valor inicial do índice
        int SOMA = 0;    // Variável que acumulará a soma
        int K = 0;       // Variável contadora

        // Loop que será executado enquanto K < INDICE
        while (K < INDICE) {
            K = K + 1;        // Incrementa K em 1
            SOMA = SOMA + K;  // Adiciona o valor de K à soma
        }

        // Exibe o valor final da variável SOMA
        System.out.println("O valor final da SOMA é: " + SOMA);
    }
}

