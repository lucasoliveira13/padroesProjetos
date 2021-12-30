package State_Projec;

public class isAcessivel extends StatusLivro {
	private static isAcessivel instance;

	protected isAcessivel() {
	}

	public static isAcessivel instance() {
		if (instance == null)
			instance = new isAcessivel();

		return instance;
	}

	public boolean solicitar(Livro livro) {
		System.out.println(livro + " Está sendo solicitado.");
		livro.estabelecerEstado(isAcessivel.instance());
		return true;
	}

	public boolean entregar(Livro livro) {
		System.out.println("Transação não pode ser realizada.");
		livro.estabelecerEstado(isAcessivel.instance());
		return false; 
	}

	public boolean comprar(Livro livro) {
		System.out.println(livro + " foi comprado.");
		livro.estabelecerEstado(isVendido.instance());
		return true;
	}

	public String toString() {
		return "Disponivel";
	}

	@Override
	public boolean doar(Livro livro) {
		System.out.println(livro + " foi doado.");
		livro.estabelecerEstado(isDoado.instance());
		return false;
	}

}
