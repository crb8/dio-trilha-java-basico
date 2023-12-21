import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração dos atributos
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha restante após ler um inteiro

        System.out.println("Por favor, digite o nome da agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        scanner.useLocale(Locale.US);
        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextDouble();

        // Exibição da mensagem com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}

