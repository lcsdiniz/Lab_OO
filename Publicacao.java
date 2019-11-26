package biblioteca;

public abstract class Publicacao extends DomainObject {
	private String titulo;
	private int numExemplares, numExemplaresEmprestados;
	private Area area;
	
	Publicacao (long id, String titulo, int numExemplares, Area area) {
		super(id);
		this.setTitulo(titulo);
		this.numExemplaresEmprestados = 0;
		this.setNumExemplares(numExemplares);
		this.setArea(area);
	}
	
	public int getNumExemplaresDisponiveis() {
		return this.numExemplares - this.numExemplaresEmprestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getNumExemplaresEmprestados() {
		return numExemplaresEmprestados;
	}
	
	public final void setNumExemplaresEmprestados() {
		if (this.numExemplaresEmprestados >= this.numExemplares)
			throw new RuntimeException("Não há mais exemplares disponpiveis");
		this.numExemplaresEmprestados++;
	}	
	
	void emprestar() {
		if (this.getNumExemplaresDisponiveis() == 0)
			throw new RuntimeException("Só pode emprestar quando há exemplares "
					+ "disponíveis");
		this.numExemplaresEmprestados++;
	}
	
	void entregar() {
		if (this.getNumExemplaresEmprestados() == 0)
			throw new RuntimeException("Só pode entregar quando há exemplares "
					+ "emprestados");
		this.numExemplaresEmprestados--;
	}
	public int getNumExemplares() {
		return numExemplares;
	}

	public final void setNumExemplares(int numExemplares) {
		if (numExemplares < 0)
			throw new IllegalArgumentException(
					"Num. Exemplares tem que ser não negativo");
		if (numExemplares < this.getNumExemplaresEmprestados())
			throw new IllegalArgumentException(
					"Num. Exemplares tem que ser maior ou igual ao numero de "
					+ "exemplares emprestados.");
		this.numExemplares = numExemplares;
	}

	public Area getArea() {
		return area;
	}

	public final void setArea(Area area) {
		this.area = area;
	}
}
