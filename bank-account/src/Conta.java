// Arquivo: Conta.java
public class Conta {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    // Construtor da classe
    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito){
        saldo = deposito + saldo;
        System.out.println("O valor depositado na sua conta foi de " + deposito);
        System.out.println("Seu saldo atual é: " + saldo);

    }

    public void sacar(double saque){
        if (saque < saldo) {
    
        saldo = saldo - saque;
        System.out.println("O valor sacado na sua conta foi de " + saque);
        System.out.printf("Seu saldo atual é: %.2f\n", saldo);
    }   else{
            System.out.println("Saldo insuficiente.");
    }

    }

}
