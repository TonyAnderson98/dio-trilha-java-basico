import java.util.Scanner;

public class ContaTermianal {
    public static void main(String[] args) throws Exception {
        String nome;
        Integer agencia;
        Integer conta;
        Float saldo;

        Scanner scanner = new Scanner(System.in);

        // Mensagem inicial
        System.out.println("---------------------------------------");
        System.out.println("  Bem vindo ao nosso sistema bancário  ");
        System.out.println("---------------------------------------\n");

        // Nome
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();

        // Agência
        System.out.print("Agência: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número de agência válido");
            scanner.next(); // Consome a entrada inválida
        }
        agencia = scanner.nextInt();

        // Conta
        System.out.print("Conta: ");
        while(!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número de conta válido");
            scanner.next(); // Consome a entrada inválida
        }
        conta = scanner.nextInt();
        
        // Saldo
        System.out.print("Insira o seu saldo dos sonhos: ");
        while(!scanner.hasNextFloat()) {
            System.out.println("Insira um saldo válido");
            scanner.next(); // Consome a entrada inválida
        }
        saldo = scanner.nextFloat();


        // Mensagem final ao usuário
        System.out.println("\nOlá, " + nome + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + agencia + ", sua conta é " + conta);
        System.out.println("O seu saldo é: " + saldo + "\n");
        }
}
