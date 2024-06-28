package conta;

import java.sql.SQLOutput;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contafelipe = new Conta();

        contafelipe.deposito(50);
        System.out.println("Saldo atual do felipe: " + contafelipe.getSaldo());

        System.out.println("----------------------------------------");

        contafelipe.saca(40);
        System.out.println("Saldo atual do felipe: " + contafelipe.getSaldo());

        System.out.println("----------------------------------------");

        Conta contamateus = new Conta();
        System.out.println("Saldo atual matheus " + contamateus.getSaldo());

        System.out.println("----------------------------------------");

        contafelipe.transfere(12.5, contamateus);
        System.out.println("Saldo atual do felipe: " + contafelipe.getSaldo());
        System.out.println("Saldo atual matheus " + contamateus.getSaldo());

        System.out.println("----------------------------------------");

        Conta contaDoLucas = new Conta();
        System.out.println(contaDoLucas.titular);

    }

}
