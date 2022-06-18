package bytebank.teste;

import bytebank.dominio.Funcionario;
import bytebank.dominio.Gerente;
import bytebank.dominio.Programador;
import bytebank.servico.ControleBonificacaoServico;

public class Teste02 {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(10000); // 1100 - bonificacao
		
		//Funcionario funcionario = new Funcionario();
		//funcionario.setSalario(1000); // 100 - bonificacao
		
		Programador programador = new Programador();
		programador.setSalario(1000); // 200 - bonificacao
		
		ControleBonificacaoServico cb = new ControleBonificacaoServico();
		
		cb.registrarBonificacao(gerente);
		cb.registrarBonificacao(programador);
		
		System.out.println(cb.getSomabonificacoes());
	}

}
