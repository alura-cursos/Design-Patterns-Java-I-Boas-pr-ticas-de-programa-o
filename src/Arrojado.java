import java.util.Random;

class Arrojado implements Investimento {
	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	public double calcula(Conta conta) {
		int chute = random.nextInt(10);
		if (chute >= 0 && chute <= 1)
			return conta.getSaldo() * 0.05;
		else if (chute >= 2 && chute <= 4)
			return conta.getSaldo() * 0.03;
		else
			return conta.getSaldo() * 0.006;
	}
}
