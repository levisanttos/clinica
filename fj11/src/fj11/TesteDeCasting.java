package fj11;

public class TesteDeCasting {

	public static void main(String[] args) {
		
		double media01 = 7.89;
		
		int mediaArredondada = (int) media01;
		
		System.out.println("Media Normal= " + media01);
		System.out.println("Media arredondada = " + mediaArredondada);
		
		int nota01 = 7;
		int nota02 = 6;
		int nota03 = 9;
		int nota04 = 8;
		
		double media = (double) (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.println("Media do Aluno Levi: " + media);
	}
}
