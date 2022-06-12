package bytebank.teste;

import bytebank.dominio.Gerente;

public class Teste01 {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Fallen");
		gerente.setCpf("01012020-7");
		gerente.setSalario(100000);
		gerente.setSenha("pass");
		System.out.println("Gerente autenticado: "+gerente.autenticar("pass"));
		System.out.println("Bonificação: "+gerente.getBonificacao());
	}

}
