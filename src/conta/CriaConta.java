package conta;

import cliente.Cliente;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposito(200);


        Cliente primeiroCliente = new Cliente();
        primeiraConta.setTitular(primeiroCliente);



    }

}
