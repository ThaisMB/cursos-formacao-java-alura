

public class Conta {
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta");
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.saldo += valor; 
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}

	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
