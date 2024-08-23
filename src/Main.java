//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import classes.Banco;
import classes.ContaBancaria;
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Breno Guimarães", 1);
        ContaBancaria conta2 = new ContaBancaria("Guilherme Bernard" , 2 );
        Banco banco = new Banco();

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(conta2, 200);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        System.out.println("Saldo da conta 1 "+conta1.verificarSaldo());
        System.out.println("Saldo da conta 2 "+conta2.verificarSaldo());

        banco.listarContas();

      banco.buscarConta(2);



    }
}