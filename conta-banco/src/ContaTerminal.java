import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int agencia;
        String numeroConta, nome;
        double saldo;

        System.out.println("Olá, seja bem vindo! Para criar uma conta informe os seguintes dados:");
        System.out.println("Usuario: 1021 (Pressione Enter para seguir os próximos campo):");
        sc.nextLine();
        System.out.println("Por favor, informe o numero da Agência:");
        agencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, informe o numero da conta com o digito:");
        numeroConta = sc.nextLine();
        System.out.println("Agora, informe Seu nome completo:");
        nome = sc.nextLine();
        System.out.println("Informe o saldo que gostaria de depositar");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por cria uma conta em nosso banco, sua agencia é " + agencia
                + ", conta " + numeroConta);

        System.out.printf(" com saldo no valor de R$ %.2f%n já disponivel para saque.", saldo);

        sc.close();

    }
}
