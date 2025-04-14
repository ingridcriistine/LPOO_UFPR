public class Teste() {

    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(100);
        System.out.println("Saldo apos deposito: " + conta.getSaldo());
    }

    @Test
    public void testeCriarConta() {
        ContaBancaria conta = new ContaBancaria();

        double valorEsperado = 0.0;
        double valorObtido = conta.getSaldo();
        assertEquals(valorEsperado, valorObtido, 0.001);
    }

    @Test
    public void testeDepositar50() {
        ContaBancaria conta = new ContaBancaria();
        boolean depositoEsperado = conta.depositar(50.0);
        assertEquals(depositoEsperado, true);
        double saldoObtido = conta.getSaldo();
        assertEquals(saldoObtido, 50.0, 0.0);
    }

    @Test
    public void testeDepositar30e50() {
        ContaBancaria conta = new ContaBancaria();
        boolean depositoEsperado = conta.depositar(30.0);
        assertEquals(depositoEsperado, true);
        depositoEsperado = conta.depositar(50.0);
        assertEquals(depositoEsperado, true);
        double saldoObtido = conta.getSaldo();
        assertEquals(80.0, saldoObtido, 0.0);
    }
}
