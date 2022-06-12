package introducao.bytebank.teste;

import introducao.bytebank.dominio.Conta;
import introducao.bytebank.dominio.Titular;

public class Teste01 {
    public static void main(String[] args) {
        Titular titular = new Titular();
        titular.setNome("Ana Maria");
        titular.setCpf("11111111111");
        titular.setProfissao("Desenvolvedor Java");

        Conta conta = new Conta(001, 002, titular, 1000.0);        
        
        Conta conta2 = new Conta(001, 002, titular, 1000.0);
        
        
        System.out.println("Total de contas: "+Conta.totalContas);
    }
}
