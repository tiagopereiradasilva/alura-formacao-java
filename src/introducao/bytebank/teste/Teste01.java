package introducao.bytebank.teste;

import introducao.bytebank.dominio.Conta;

public class Teste01 {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 10000;
        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 1000;
        System.out.println(primeiraConta.saldo);
    }
}
