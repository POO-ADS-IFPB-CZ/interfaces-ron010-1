
public class ContaPoupanca extends Conta implements Investimento {
    
    public ContaPoupanca(int numero, String nomeTitular){
        super(numero, nomeTitular);
    }
    @Override
    public void reajustar(double percentual) {
        saldo = saldo + saldo * percentual;
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança cadastrada");
    }
}
