import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        double saldo = 0.0;

        // Criando um objeto da classe Conta
        Conta conta1 = new Conta(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia + ", número da conta: " + numero + " e seu saldo é: " + saldo);

            
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");

       System.out.println("Digite o valor a ser depositado");
       double depositar = scanner.nextDouble();
            conta1.depositar(depositar);
           
    

    System.out.println(".");
    System.out.println(".");

    System.out.println("Digite o valor a ser sacado");
    double sacar = scanner.nextDouble();
         conta1.sacar(sacar);
}
}

