class RespostaEmPorcento implements Resposta {
	private Resposta outraResposta;

	/*
	 * Exercicio passando a proxima resposta pelo construtor public
	 * RespostaEmPorcento(Resposta outraResposta) { this.outraResposta =
	 * outraResposta; }
	 */

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + '%' + conta.getSaldo());
		} else if (outraResposta != null) {
			outraResposta.responde(req, conta);
		} else {
			// não existe próxima na corrente, e ninguém atendeu a requisição!
			// poderíamos não ter feito nada aqui, caso não fosse necessário!
			throw new RuntimeException("Formato de resposta não encontrado");
		}
	}

	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}
}