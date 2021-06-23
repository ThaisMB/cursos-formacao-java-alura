
public class TestaValores {

		public static void main(String[] args) {
			Conta conta = new Conta(122, 345678);
			System.out.println(conta.getNumero());
			System.out.println(conta.getAgencia());
			System.out.println(Conta.getTotal());
			
			Conta conta2 = new Conta(123, 345678);
			System.out.println(conta2.getNumero());
			System.out.println(conta2.getAgencia());
			System.out.println(Conta.getTotal());
		}
}
