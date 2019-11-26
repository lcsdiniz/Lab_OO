package biblioteca;
import java.time.LocalDate;

public class Emprestimo {
	private LocalDate inicio, previsaoEntrega, entrega;
	private Publicacao publicacao;
	private Aluno aluno;
	
	Emprestimo (Publicacao publicacao, Aluno aluno, LocalDate inicio, LocalDate previsaoEntrega, LocalDate entrega) {
		setPublicacao(publicacao);
		setAluno(aluno);
		setInicio(inicio);
		setPrevisaoEntrega(previsaoEntrega);
		setEntrega(entrega);
	}
		
	public LocalDate getInicio() {
		return inicio;
	}

	public final void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public final void setPrevisaoEntrega(LocalDate previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public LocalDate getEntrega() {
		return entrega;
	}

	public final void setEntrega(LocalDate entrega) {
		if (this.entrega != null)
			throw new RuntimeException("Emprestimo já entregue.");
		this.entrega = LocalDate.now();
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public final void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
