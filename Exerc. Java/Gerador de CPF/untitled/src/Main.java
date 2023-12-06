public class Main {
    public static void main(String[] args) {
        Gerar gerador = new Gerar();

        try {
            String cpfGerado = gerador.geraCPF();

            System.out.println("CPF Gerado: " + cpfGerado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
