package ContaCorrente;
import conta.Conta;
import java.util.Random;

public class ContaCorrente extends Conta {

    private double taxaJuros = 0.07;
    private double ativos;

    public double getAtivos() {
        return ativos;
    }

    public void setAtivos(double ativos) {
        this.ativos = ativos;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


    public void investirAtivos(double valor) {

        if (valor > this.getSaldo()) {
            System.out.println("Saldo Insuficiente");
            System.out.println("Lembrando que você tem na conta" + getSaldo());
        } else {
            Random random = new Random();
            double taxa = random.nextDouble();
            this.setSaldo(valor * (1 + taxa));
            System.out.println("Parabéns seu dinheiro valorizou " + getSaldo() + "a uma taxa de " + taxa);
        }

    }
}
