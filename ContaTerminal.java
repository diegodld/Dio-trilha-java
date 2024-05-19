import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Digital");
        System.out.println("Para comecar, digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite sua Agencia:");
        String agencia = scan.nextLine();
        System.out.println("Digite o numero da conta:");
        int numeroConta = scan.nextInt();
        System.out.println("Digite o Saldo para saque:");
        Double saldo = scan.nextDouble();

        String mensagem = "Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia +" conta "+ numeroConta +" e seu saldo "+ saldo + " já está disponível para saque.";
        System.out.println(mensagem);
        scan.close();
    }   
}
