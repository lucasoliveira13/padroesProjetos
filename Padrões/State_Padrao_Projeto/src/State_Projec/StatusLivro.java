package State_Projec;

public abstract class StatusLivro {
	  public abstract boolean entregar(Livro livro);
	  public abstract boolean solicitar(Livro livro);
	  public abstract boolean comprar(Livro livro);
	  public abstract boolean doar(Livro livro);
	  public String toString() {
	    return "?";
	  }
}
