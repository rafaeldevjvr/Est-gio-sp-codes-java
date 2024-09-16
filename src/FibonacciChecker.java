// Questão 2

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber o número do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();  // Lendo o número informado
        
        // Fechando o scanner
        scanner.close();
        
        // Variáveis para armazenar os dois primeiros valores da sequência de Fibonacci
        int fibAnterior = 0;
        int fibAtual = 1;
        
        // Verificar se o número é 0 ou 1, que já pertencem à sequência de Fibonacci
        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

        // Calculando a sequência de Fibonacci até encontrar um número igual ou maior que o informado
        while (fibAtual < numero) {
            int proximoFib = fibAnterior + fibAtual;  // Calcula o próximo número da sequência
            fibAnterior = fibAtual;                   // Atualiza o valor anterior
            fibAtual = proximoFib;                    // Atualiza o valor atual
        }

        // Verificar se o número informado pertence à sequência de Fibonacci
        if (fibAtual == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

