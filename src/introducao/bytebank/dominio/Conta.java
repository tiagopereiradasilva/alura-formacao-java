package introducao.bytebank.dominio;

public class Conta {
    private int agencia;
    private int numero;
    private Titular titular;
    private double saldo;
    
    public static int totalContas = 0;
    
    
    public Conta(int agencia, int numero, Titular titular, double saldo) {
    	
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		
		totalContas++;
	}

	@Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
