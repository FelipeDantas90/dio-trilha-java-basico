package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite sua conta :  ");
        int conta = leitura.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = leitura.next();


        System.out.println("Digite seu nome: ");
        String usuario = leitura.next();

        System.out.println("Digite seu saldo:  ");
        double saldo = leitura.nextDouble();

        System.out.println(" Olá " +    usuario
        +     "  obrigado por criar em nosso banco,sua agência é "   +
           agencia +     " conta "    + conta
        +    " e seu saldo "  + saldo  +    " já está disponivel para saque.");

    }
}
