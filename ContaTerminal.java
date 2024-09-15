import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu nome:");
    String nomeCliente = scanner.next();

    System.out.println("Informe a Agência:");
    String agencia = scanner.next();

    System.out.println("Informe o número da conta:");
    int numeroDaConta = scanner.nextInt();

    System.out.println("Informe o saldo:");
    double saldo = scanner.nextDouble();

    System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta "+numeroDaConta+", e seu saldo: R$"+saldo+", está disponível para saque");

}
}
