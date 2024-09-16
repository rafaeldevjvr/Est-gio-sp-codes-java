// Questão 5

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.println("Digite a string que deseja inverter:");
        String input = scanner.nextLine();

        // Fecha o Scanner
        scanner.close();

        // Inverte a string
        String invertedString = inverterString(input);

        // Exibe a string invertida
        System.out.println("String invertida: " + invertedString);
    }

    // Método para inverter uma string
    public static String inverterString(String str) {
        // Converte a string em um array de caracteres
        char[] caracteres = str.toCharArray();

        // Inicializa uma variável para armazenar a string invertida
        String inverted = "";

        // Percorre o array de caracteres de trás para frente
        for (int i = caracteres.length - 1; i >= 0; i--) {
            inverted += caracteres[i];
        }

        return inverted;
    }
}
