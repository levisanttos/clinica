package fj11.oop;

public class Conta {
	
	int numero;
	
	Cliente titular;
	
	double saldo;
	
	boolean saca(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean transferePara(Conta destino, double valor) {
		boolean conseguiu = this.saca(valor);
		if (conseguiu) {
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}

}
