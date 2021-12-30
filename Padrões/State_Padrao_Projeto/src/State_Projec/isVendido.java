package State_Projec;

public class isVendido extends StatusLivro{

	  private static isVendido instance;  

	  protected isVendido() {}

	  public static isVendido instance() {
	    if (instance == null)
	      instance = new isVendido();

	    return instance;
	  }

	  public boolean solicitar(Livro livro) {
	    System.out.println(livro + " n�o est� dispon�vel.");
	    livro.estabelecerEstado(isVendido.instance());
	    return false;
	  }

	  public boolean entregar(Livro livro) {
	    System.out.println("Estamos organizando a devolu��o." + livro + ". Devolu��o conclu�da.");
	    livro.estabelecerEstado(isAcessivel.instance());
	    return true;
	  }


	  public String toString() {
	    return "Vendido.";
	  }

	@Override
	public boolean comprar(Livro livro) {
		System.out.println(livro + " n�o est� mais dispon�vel.");
		livro.estabelecerEstado(isVendido.instance());
	    return false;
	}

	@Override
	public boolean doar(Livro livro) {
		System.out.println("Estamos processando a doa��o, " + livro + ". Obrigado.");
	    livro.estabelecerEstado(isAcessivel.instance());
	    return true;
	}

}
