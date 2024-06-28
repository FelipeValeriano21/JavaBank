package cliente;

import conta.Conta;

public class TestaBanco {
    public static void main(String[] args) {

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe Reis");
        felipe.setCPF("111.111.111-11");
        felipe.setProfissao("Programador");

        Conta contaDoFelipe = new Conta();
        contaDoFelipe.deposito(100);
        contaDoFelipe.titular = felipe;

        System.out.println(contaDoFelipe.titular.getCPF());
    }
}
