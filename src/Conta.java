import java.util.Calendar;

class Conta {
	private String titular;
	protected double saldo;
	private String numero;
	private String agencia;
	private Calendar dataAbertura;
    protected EstadoDaConta estado;

    public Conta(){
        estado = new Positivo();
    }

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