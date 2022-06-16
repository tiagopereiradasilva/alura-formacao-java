package bytebank.teste;

import bytebank.dominio.ContaCorrente;
import bytebank.dominio.ContaPoupanca;

public class Teste01 {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(11, 100);
		contaCorrente.deposita(100.0);
		System.out.println("Saldo da conta corrente após criação: "+contaCorrente.getSaldo());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(22, 200);
		contaPoupanca.deposita(200.0);
		System.out.println("Saldo da conta poupança após criação: "+contaPoupanca.getSaldo());
		
		contaCorrente.transfere(50.0, contaPoupanca);
		System.out.println("Saldo da conta corrente após transferencia: "+contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupança após transferencia: "+contaPoupanca.getSaldo());
		
		System.out.println("---------------------------------------------------------------------");
		if(contaCorrente.saca(25.0)) {
			System.out.println("Saldo conta corrente após saque: "+contaCorrente.getSaldo());
		}else {
			System.err.println("ERRO! Saldo insuficiente! Saldo atual: "+contaCorrente.getSaldo());
		}
	}
}
