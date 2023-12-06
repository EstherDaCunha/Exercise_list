import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos na sequência de Fibonacci: ");
        int numeroDeTermos = scanner.nextInt();

        System.out.println("Sequência de Fibonacci com " + numeroDeTermos + " termos:");

        for (int i = 0; i < numeroDeTermos; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close(); 
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
