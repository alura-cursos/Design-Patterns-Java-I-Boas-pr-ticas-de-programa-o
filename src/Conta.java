import java.util.Calendar;

class Conta {
	private String titular;
	private double saldo;
	private String numero;
	private String agencia;
	private Calendar dataAbertura;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}
}