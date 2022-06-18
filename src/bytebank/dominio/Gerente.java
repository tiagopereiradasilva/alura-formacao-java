package bytebank.dominio;

public class Gerente extends Funcionario {
	private String senha;
	
	public boolean autenticar(String senha) {
		return this.senha.equals(senha);
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
