public class TesteAcoes {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new Multiplicador(2));
		builder.adicionaAcao(new Multiplicador(3));
		builder.adicionaAcao(new Multiplicador(5.5));

		NotaFiscal nf = builder.paraEmpresa("caelum")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNota("nome", 100)).comObservacoes("obs")
				.constroi();

		System.out.println(nf.getValorBruto());
	}
}
