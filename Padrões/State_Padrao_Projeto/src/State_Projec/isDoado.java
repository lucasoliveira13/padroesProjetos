package State_Projec;

public class isDoado extends StatusLivro{
	private static isDoado instance;  

	  protected isDoado() {}

	  public static isDoado instance() {
	    if (instance == null)
	      instance = new isDoado();

	    return instance;
	  }

	  public boolean solicitar(Livro livro) {
	    System.out.println(livro + " está disponível.");
	    livro.estabelecerEstado(isDoado.instance());
	    return true;
	  }
	  
	  public boolean doar(Livro livro) {
		    System.out.println(livro + " foi doado.");
		    livro.estabelecerEstado(isDoado.instance());
		    return true; 
		  }


	  public String toString() {
	    return "Disponível, pós-doação.";
	  }

	public boolean comprar(Livro livro) {
		System.out.println(livro + " foi comprado.");
		livro.estabelecerEstado(isVendido.instance());
		return true;
	}

	public boolean entregar(Livro livro) {
		System.out.println(livro + " Entregue.");
		return true;
	}
}
