package classes;
import classes.Banco;
public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo = 0.0;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;

    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor){
        this.saldo =  this.saldo + valor;
        System.out.println("Depósito de R$ " +valor + " realizado com sucesso!"  );
    }

    public void sacar(double valor){
        if(this.saldo == 0.0 || this.saldo < valor){
            System.out.println("Conta com saldo zerado, impossível saque" );
        }else{
            this.saldo =  this.saldo - valor;
            System.out.println("Saque de R$ " +valor + " realizado com sucesso!"  );
        }

    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        contaDestino.depositar(valor);
        this.saldo = this.saldo - valor;
        System.out.println("VALOR TRANSFERIDO COM SUCESSO");
    }

}
