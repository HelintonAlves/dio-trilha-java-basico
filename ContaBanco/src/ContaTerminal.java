
import java.util.Scanner;

/**
 * Desafio de código do Boot Camp da DIO - Criação de um terminal de conta bancária
 * @author Helinton Alves Coelho
 * @version 1.0.0
 * @since 26/04/2024
 * 
 * Na implementação observei que o campo saldo utiliza o padrão brasileiro,
 * ou seja, utilização de vírgula nas casas décimais e não ponto. 
 * 
 */




public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela classe Scanner o valores digitados no terminal
        //Exibir a mensagem conta criada

        int numeroConta;
        String agencia;
        String cliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número de sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Agora digite a Agência: ");
        agencia = scanner.next();

        cliente = scanner.next();

        System.out.println("Digite o valor de seu depósito: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
