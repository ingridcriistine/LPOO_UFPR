public class ContaBancaria {
    private double saldo = 0;

    public double getSaldo() {
        return this.saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;  
        }
        return false;  
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            this.saldo -= valor;
            return true;  
        }
        return false;  
    }
}
