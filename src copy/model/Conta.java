
public class Conta {
    
    private int numero;
    private String nomeTitular;
    protected double saldo;


    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        saldo = 0;
    }
    public void depositar(double valor){
        this.saldo = getSaldo() + valor;
    }

    public boolean sacar(double valor){
        if (this.getSaldo() >= valor){
            this.saldo = getSaldo() - valor;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirTipoConta(){
        System.out.println("Conta comum cadastrada");
    }

    public void reajustar(double percentual){
        saldo += saldo * percentual;
    }
}
