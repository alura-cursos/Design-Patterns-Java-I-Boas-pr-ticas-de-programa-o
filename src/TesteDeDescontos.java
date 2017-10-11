public class TesteDeDescontos {
	public static void main(String[] args) {
		testeMenorIgual500();

		testeMaior500();
	}

	private static void testeMaior500() {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPISs", 250.0));

		double descontoFinal = descontos.calcula(orcamento);

		System.out.println(descontoFinal);

	}

	private static void testeMenorIgual500() {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPISs", 250.0));

		double descontoFinal = descontos.calcula(orcamento);

		System.out.println(descontoFinal);
	}
}
