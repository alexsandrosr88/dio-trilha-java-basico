import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("\nPor favor, digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("\nPor favor, digite o número: ");
        int numero = sc.nextInt();

        sc.nextLine();
        System.out.print("\nPor favor, digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("\nPor favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("\nOlá ".concat(nome)+",obrigado por criar uma conta em nosso banco, sua agência \n" +
                "é ".concat(agencia)+", conta ".concat(String.valueOf(numero))+" e seu saldo "
                .concat(String.format("%.2f",saldo))+" já está disponível para saque.");
    }
}
