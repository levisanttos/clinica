package fj11;

public class BalancoTrimestral {
	
	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		double mediMensal = gastoTrimestre / 3;
		
		System.out.println("O Gasto trimestral foi: " + gastoTrimestre);
		
		System.out.println("Valor da média mensal = " + mediMensal);
	}

}
