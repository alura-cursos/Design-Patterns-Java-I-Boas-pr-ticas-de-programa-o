public class Teste {
	public static void main(String[] args) {
		testeOrcamento();
		
		testeInvestimento();
	}
	
	public static void testeOrcamento(){
		Orcamento reforma = new Orcamento(500.0);

		Imposto novoImposto = new ICCC();
		System.out.println(novoImposto.calcula(reforma));

	}
	
	public static void testeInvestimento(){
		Conta conta = new Conta();
		conta.deposita(100);
		
		Investimento investimento = new Conservador();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realiza(conta, investimento);
	}
}