import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a Agencia: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("\nOlá "+ cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.\n");
        
        scanner.close();
    
    }
}
