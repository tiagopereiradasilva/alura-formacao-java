package bytebank.teste;

import bytebank.dominio.Funcionario;

public class Teste01 {

	public static void main(String[] args) {
		Funcionario niko = new Funcionario();
		niko.setNome("Niko");
		niko.setCpf("01012020-7");
		niko.setSalario(100000);
		
		System.out.println(niko.getBonificacao());
	}

}
