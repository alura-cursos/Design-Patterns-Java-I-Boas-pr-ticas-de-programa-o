public class ICCC implements Imposto {

	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.08 + 30;
		}
	}
}
