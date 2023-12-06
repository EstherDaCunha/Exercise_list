import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double posicaoTremA = obterEntradaNumerica("Digite a posição inicial do Trem A (em KM): ");
        double posicaoTremB = obterEntradaNumerica("Digite a posição inicial do Trem B (em KM): ");
        double velocidadeTremA = obterEntradaNumericaPositiva("Digite a velocidade do Trem A (em KM/h): ");
        double velocidadeTremB = obterEntradaNumericaNegativa("Digite a velocidade do Trem B (em KM/h): ");

        double tempoColisao = calcularTempoColisao(posicaoTremA, posicaoTremB, velocidadeTremA, velocidadeTremB);

        double posicaoColisao = calcularPosicaoColisao(posicaoTremA, velocidadeTremA, tempoColisao);

        NumberFormat formatoDecimal = new DecimalFormat("#0.00");

        System.out.println("\nColisão ocorreu em " + formatoDecimal.format(tempoColisao) + " segundos.");
        System.out.println("Posição da colisão: " + formatoDecimal.format(posicaoColisao) + " KM.");

        scanner.close();
    }

    private static double obterEntradaNumerica(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        double entrada = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                entrada = Double.parseDouble(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }

        return entrada;
    }

    private static double obterEntradaNumericaPositiva(String mensagem) {
        double entrada;

        do {
            entrada = obterEntradaNumerica(mensagem);
            if (entrada < 0) {
                System.out.println("A velocidade deve ser um número positivo.");
            }
        } while (entrada < 0);

        return entrada;
    }

    private static double obterEntradaNumericaNegativa(String mensagem) {
        double entrada;

        do {
            entrada = obterEntradaNumerica(mensagem);
            if (entrada >= 0) {
                System.out.println("A velocidade deve ser um número negativo.");
            }
        } while (entrada >= 0);

        return entrada;
    }

    private static double calcularTempoColisao(double posicaoTremA, double posicaoTremB, double velocidadeTremA,
                                               double velocidadeTremB) {
        double velocidadeRelativa = velocidadeTremA + Math.abs(velocidadeTremB);
        double distanciaRelativa = Math.abs(posicaoTremA - posicaoTremB);

        return distanciaRelativa / velocidadeRelativa;
    }

    private static double calcularPosicaoColisao(double posicaoTremA, double velocidadeTremA, double tempoColisao) {
        return posicaoTremA + velocidadeTremA * tempoColisao;
    }
}
