

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String nomeTitular, double limite) {
        super(numero, nomeTitular);
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }

    public void setLimite(double novoLimite){
        this.limite = novoLimite;
    }
    @Override
    public boolean sacar(double valor) {
        if (valor <= (this.limite + this.saldo)) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Especial cadastrada");
    }
}
