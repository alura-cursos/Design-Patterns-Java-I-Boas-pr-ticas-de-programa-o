
public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
