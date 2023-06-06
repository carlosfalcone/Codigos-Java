import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da sua agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário:
        System.out.println("Ola, " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + ", e seu saldo de " + saldo + " já está disponível para saque.");
    
    }
}
