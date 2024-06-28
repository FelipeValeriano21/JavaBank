package conta;

// saldo, agenda, numero e titular

import cliente.Cliente;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;


    public Cliente titular;

    public void deposito(double valor) {
       this.saldo += valor; // O saldo é desta conta aqui (Class Conta)
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso no valor de R$ " + valor);
            return true;
        }else{
            System.out.println("Ops saldo insulficiente");
            return false;
        }
    }

   public boolean transfere (double valor, Conta destino) {
        if(this.saca(valor)){
            destino.deposito(valor);
            System.out.println("Transferencia realzizada com sucesso no valor de " + valor + "para " + destino);
            return true;
        }else{
            System.out.println("Erro ao transferir");
            return false;
        }
    }

    public double getSaldo () {   //Encapsulamento
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
