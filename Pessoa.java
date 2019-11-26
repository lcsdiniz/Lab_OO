package biblioteca;

public abstract class Pessoa extends DomainObject {
	private String nome;
	
	Pessoa (long id, String nome) {
		super(id);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public final void setNome(String nome) {
		if (nome == null || nome.isEmpty())
			throw new IllegalArgumentException("Nome e obrigatorio.");
		this.nome = nome;
	}
}
