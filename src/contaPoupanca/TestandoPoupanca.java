package contaPoupanca;

import cliente.Cliente;

public class TestandoPoupanca {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Felipe");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        contaPoupanca1.setSaldo(100);
        contaPoupanca1.setNumero(150);
        contaPoupanca1.saca(150);
        contaPoupanca1.renderJuros();
        contaPoupanca1.setTitular(cliente);

        System.out.println(contaPoupanca1);

    }

}
