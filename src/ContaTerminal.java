import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta ");
        int numeroConta = Integer.parseInt(scanner.next());

        System.out.println("Por favor, digite o nome do cliente ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo ");
        double saldo = Double.parseDouble(scanner.next());

        System.out.printf("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu saldo " + saldo +
                " já está disponível para saque.");

    }
}
