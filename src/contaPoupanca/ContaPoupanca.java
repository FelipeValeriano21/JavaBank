package contaPoupanca;

import conta.Conta;

public class ContaPoupanca extends Conta {  //Herança

    private double taxaJuros = 0.05;

    public void renderJuros () {

       this.setSaldo(this.getSaldo()* (1 + taxaJuros));

       if(this.getSaldo()>=0){
           System.out.println("Seu saldo esta em " + this.getSaldo());
       }else{
           System.out.println("VocÊ esta devendo " + this.getSaldo());
       }

    }

}
