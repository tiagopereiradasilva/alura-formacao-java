package bytebank.servico;

import bytebank.dominio.Funcionario;

public class ControleBonificacaoServico {
	
	private double somabonificacoes;
	
	public void registrarBonificacao(Funcionario funcionario) {
		this.somabonificacoes += funcionario.getBonificacao();
	}	
	
	public double getSomabonificacoes() {
		return somabonificacoes;
	}
}
