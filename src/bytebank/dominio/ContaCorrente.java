package bytebank.dominio;

public class ContaCorrente extends Conta{
	private final double VALOR_TAXA_SAQUE = 0.10; 
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		return super.saca(valor+VALOR_TAXA_SAQUE);
	}

	@Override
	public void deposita(double valor) {
		super.saldo+=valor;
		
	}
	
	
	

}
