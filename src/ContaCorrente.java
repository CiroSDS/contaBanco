public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(int conta, int agencia, String banco, double saldo, double chequeEspecial) {
        super(conta, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente [chequeEspecial=" + chequeEspecial + "]";
    }

    public double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

}
