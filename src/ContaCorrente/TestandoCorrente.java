package ContaCorrente;

import cliente.Cliente;

public class TestandoCorrente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Felipe");

        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(200);
        conta.setTitular(cliente);
        conta.investirAtivos(200);
        conta.investirAtivos(200);
    }

}
