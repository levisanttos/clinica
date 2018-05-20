package fj11.oop;

public class TestaMetodoTransfere {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Levi Santos";
		
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Vitor dos Santos";
		Conta c1 = new Conta();
		c1.numero = 123;
		c1.saldo = 1000;
		c1.titular = cliente1;
		
		Conta c2 = new Conta();
		c2.numero = 124;
		c2.saldo = 1;
		c2.titular = cliente2;
		
		c1.transferePara(c2, 200);
		
		System.out.println("Saldo da conta c1: " + c1.saldo);
		System.out.println("Saldo da conta c2: " + c2.saldo);
	}

}
