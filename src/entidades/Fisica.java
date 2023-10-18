package entidades;

public class Fisica extends Contribuinte {

	private Double gastoSaude;

	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		double imp = 0.0;
		if (getRendaAnual() < 20000) {
			imp = (getRendaAnual() / 100) * 15;
		} else if (getRendaAnual() >= 20000) {
			imp = (getRendaAnual() / 100) * 25;
		}

		imp -= (gastoSaude / 100) * 0.5;
		if (imp < 0.0) {
			imp = 0.0;
		}
		return imp;
	}

}
