public class TesteConta {
    public static void main(String[] args) throws Exception {

        ContaCorrente cC = new ContaCorrente(123, 0123, "Banco ABC", 100.00, 1000.00);
        System.out.println(cC);
        System.out.println("O saldo corrente é R$: " + cC.getSaldo());

        ContaPoupanca cP = new ContaPoupanca(123, 123, "Banco XYZ", 550.00, 30, 0.05);
        System.out.println(cP);
        System.out.println("O saldo Poupança é R$: " + cP.getSaldo());

    }
}
