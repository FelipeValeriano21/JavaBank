package conta;

public class TesteSacaNegativo {


    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposito(100);
        conta.saca(1000);
        System.out.println(conta.getSaldo());

    }
}
