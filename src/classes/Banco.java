package classes;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

    public void adicionarConta(ContaBancaria conta){
        this.contas.add(conta);
        System.out.println("Conta adicionada!");
    }

    public ContaBancaria buscarConta(int numeroConta){
        AtomicBoolean verdadeiro = new AtomicBoolean(false);
        contas.forEach(conta -> {
            if(numeroConta == conta.getNumeroConta()){
                System.out.println("Conta encontrada: ");
                System.out.println("Titular da conta " + conta.getTitular());
                verdadeiro.set(true);
            }
        });
        if(!verdadeiro.get()){
            System.out.println("CONTA "+ numeroConta +" NÃO ENCONTRADA");
        }
        return null;
    }

    public void listarContas(){

        contas.forEach(conta -> {
            System.out.println("Titular: "+ conta.getTitular());
            System.out.println("Numero da conta: "+conta.getNumeroConta());
            System.out.println("===============");
        });
    }


}
