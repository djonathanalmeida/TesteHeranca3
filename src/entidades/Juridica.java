package entidades;

public class Juridica extends Contribuinte {

	private int numeroColaboradores;

	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual, int numeroColaboradores) {
		super(nome, rendaAnual);
		this.numeroColaboradores = numeroColaboradores;
	}
	
	

	public int getNumeroColaboradores() {
		return numeroColaboradores;
	}

	public void setNumeroColaboradores(int numeroColaboradores) {
		this.numeroColaboradores = numeroColaboradores;
	}

	@Override
	public Double imposto() {
		if (numeroColaboradores > 10) {
			return (getRendaAnual() / 100) * 14;
		} else {
			return (getRendaAnual() / 100) * 16;
		}
	}

}
