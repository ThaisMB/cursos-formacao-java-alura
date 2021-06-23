
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(129, 547677);
		//conta.numerp = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		Conta contaDoPaulo = new Conta(123, 456789);
		contaDoPaulo.setTitular(paulo);
		paulo.setProfissao("programador");
		
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular().getProfissao());
		
	}
}
