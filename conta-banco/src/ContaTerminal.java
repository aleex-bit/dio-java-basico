import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agencia, nome;
        double saldo;

        System.out.println("Olá, seja bem vindo! Para criar uma conta informe os seguintes dados:");
        System.out.println("Por favor, informe o numero da conta:");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, informe o numero da Agência com o digito:");
        agencia = sc.nextLine();
        System.out.println("Agora, informe Seu nome completo:");
        nome = sc.nextLine();
        System.out.println("Informe o saldo que gostaria de depositar");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por cria uma conta em nosso banco, sua agencia é " + agencia
                + " com saldo no valor de R$ " + saldo + " já disponivel para saque.");

        sc.close();

    }
}
