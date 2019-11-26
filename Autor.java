package biblioteca;

public class Autor extends Pessoa {
	private String biografia;
	
	Autor (long id, String nome, String biografia) {
		super(id, nome);
		this.setBiografia(biografia);
	}
	
	public String getBiografia() {
		return biografia;
	}
	
	public final void setBiografia(String biografia) {
		this.biografia = biografia;
	}
}
