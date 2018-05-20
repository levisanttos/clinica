package fj11;

public class ExemploBreak {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um numero divisivel por 19");
				break;
			}
			
			System.out.println("Não vai executar");
		}
	}

}
