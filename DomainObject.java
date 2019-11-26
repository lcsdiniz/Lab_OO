package biblioteca;

public abstract class DomainObject {
	private long id;
	
	DomainObject (long id) {
		setId(id);
	}
	
	public long getId () {
		return id;
	}

	public final void setId (long id) {
		this.id = id;
	}
	
}
