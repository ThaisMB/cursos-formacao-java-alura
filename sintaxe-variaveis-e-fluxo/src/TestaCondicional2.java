
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		boolean acompanhado = true;
		
		if (idade>=18 || acompanhado ) {
			System.out.println("Seja bem vindo!");
		}
		else {
			System.out.println("Infelizmente voc� n�o pode entrar!");
		}
	}
}