public abstract class Imposto {
	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
	}

	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
        return (outroImposto == null? 0 : outroImposto.calcula(orcamento));
	}
}
