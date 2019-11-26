package biblioteca;

public class Aluno extends Pessoa {
	private String matricula;
	
	Aluno (long id, String nome, String matricula) {
		super(id, nome);
		this.setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
