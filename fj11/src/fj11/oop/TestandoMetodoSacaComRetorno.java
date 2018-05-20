package fj11.oop;

public class TestandoMetodoSacaComRetorno {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Levi Santos";
		
		Conta minhaConta = new Conta();
		minhaConta.numero = 123;
		minhaConta.saldo = 1000;
		minhaConta.titular = cliente;
		
		if (minhaConta.saca(200)) {
			System.out.println("Consegui sacar\nseu saldo atual é: " + minhaConta.saldo);
		} else {
			System.out.println("Não consegui sacar\n seu saldo atual é: " + minhaConta.saldo);
		}
	}

}
