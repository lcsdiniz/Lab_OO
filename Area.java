package biblioteca;

public class Area extends DomainObject {
	private String nome;
	
	Area (long id, String nome) {
		super(id);
		this.setNome(nome);	
	}
	
	public final String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) //.trim() -> tira espaços fora do padrão
			   //isEmpty() -> string vazia não é null
			throw new IllegalArgumentException("Nome e obrigatorio.");
		this.nome = nome;
	}
}
