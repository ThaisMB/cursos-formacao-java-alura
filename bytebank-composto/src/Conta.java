

public class Conta {
	private double saldo;
	int numero;
	int agencia;
	Cliente titular;
	
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

}
