package biblioteca;

import java.util.HashSet; 
import java.util.Iterator;
import java.util.Set;

public class Livro extends Publicacao {
	private String ISBN;
	private Set<Autor> autores;
	
	Livro (long id, String titulo, int numExemplares, Area area, String ISBN) {
		super(id, titulo, numExemplares, area);
		this.setISBN(ISBN);
		this.autores = new HashSet<Autor>();
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public final void setISBN(String ISBN) {
		if (ISBN == null || ISBN.trim().isEmpty())
			throw new IllegalArgumentException("ISBN e obrigatorio.");
		this.ISBN = ISBN;
	}

	public Iterator<Autor> getAutores() {
		return this.autores.iterator();
	}
	
	public void adicionarAutor(Autor autor) {
		if (autor == null)
			throw new NullPointerException("Autor é obrigatorio.");
		this.autores.add(autor);
	}
	
	public void removerAutor(Autor autor) {
		if (autor == null)
			throw new NullPointerException("Autor é obrigatorio.");
		this.autores.remove(autor);
	}
}
