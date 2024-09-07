public class ContaPoupanca extends Conta {

    private int diaAniversario;
    private double tavaJuros;

    public ContaPoupanca(int conta, int agencia, String banco, double saldo, int diaAniversario, double tavaJuros) {
        super(conta, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.tavaJuros = tavaJuros;
    }

    public double getSaldo() {
        return this.saldo + this.tavaJuros * this.saldo;
    }

}
