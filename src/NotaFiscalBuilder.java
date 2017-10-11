import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}

	public NotaFiscalBuilder(List<AcaoAposGerarNota> lista) {
		// chama o construtor sem parametros para garantir que os atributos estarão devidamente populados
		this();
		this.todasAcoesASeremExecutadas = lista;
	} 

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;

		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;

		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;

		return this;
	}

	public NotaFiscalBuilder naData(Calendar novaData) {
		this.data = novaData;

		return this;
	}

	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}

	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data,
				valorBruto, impostos, todosItens, observacoes);

		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(notaFiscal);
		}

		return notaFiscal;
	}
}