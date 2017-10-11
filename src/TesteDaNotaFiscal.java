import java.util.GregorianCalendar;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		 NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Caelum")
                 .comCnpj("123.456.789/0001-10")
                 .com(new ItemDaNota("item 1", 200.0))
                 .com(new ItemDaNota("item 2", 300.0))
                 .com(new ItemDaNota("item 3", 400.0))
                 .comObservacoes("entregar nf pessoalmente")
                 /* Opcional
                 .naData(new GregorianCalendar())
                 */
                 .constroi();
		 
		 System.out.println(nf.getValorBruto());
	}
}
