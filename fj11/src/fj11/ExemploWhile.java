package fj11;

public class ExemploWhile {

	public static void main(String[] args) {
		
		System.out.println("Exemplo de while");
		int idade = 15;
		
		while (idade < 18) {
			System.out.println("Fazendo aniversario " + idade);
			idade = idade + 1;
		}
	}
}
