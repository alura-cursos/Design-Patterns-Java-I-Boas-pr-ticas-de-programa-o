class RespostaEmXml implements Resposta {
	private Resposta outraResposta;
	
	 /* Exercicio passando a proxima resposta pelo construtor
	  * public RespostaEmXml(Resposta outraResposta) {
	        this.outraResposta = outraResposta;
      }
      */
	
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular()
					+ "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}
	}

	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}
}