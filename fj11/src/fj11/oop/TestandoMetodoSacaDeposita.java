package fj11.oop;

public class TestandoMetodoSacaDeposita {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Levi Santos";
		
		Conta minhaConta = new Conta();
		minhaConta.numero = 123;
		minhaConta.titular = cliente;
		minhaConta.saldo = 1000;
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		System.out.println("Saldo Atual: " + minhaConta.saldo);
	}

}
