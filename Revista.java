package biblioteca;

public class Revista extends Publicacao {
	private int periodicidadeEmDias;
	
	Revista (long id, String titulo, int numExemplares, Area area, int periodicidadeEmDias) {
		super(id, titulo, numExemplares, area);
		this.setPeriodicidadeEmDias(periodicidadeEmDias);
	}
	
	public int getPeriodicidadeEmDias() {
		return periodicidadeEmDias;
	}
	
	public final void setPeriodicidadeEmDias(int periodicidadeEmDias) {
		if (periodicidadeEmDias <= 0)
			throw new IllegalArgumentException(
					"Periodicidade em dias tem que ser positivo.");
		this.periodicidadeEmDias = periodicidadeEmDias;
	}
}
