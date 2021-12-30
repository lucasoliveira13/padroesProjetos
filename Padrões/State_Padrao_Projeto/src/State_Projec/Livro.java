package State_Projec;

public class Livro {
	private StatusLivro estado;
	private String titulo;

	public Livro(String titulo) {
		this.titulo = titulo;
		this.estado = isAcessivel.instance();
	}

	public String toString() {
		return ("Este livro: "+ this.titulo + " está " + this.estado + ".");
	}

	void estabelecerEstado(StatusLivro estado) {
		System.out.println("O livro estava: " + this.estado + ", após a transação ele está: " + estado);
		this.estado = estado;
	}

	public void entregar() {
		this.estado.entregar(this);
	}

	public boolean solicitar() {
		return this.estado.solicitar(this);
	}
	
	public boolean comprar() {
		return this.estado.comprar(this);
	}
	
	public boolean doar() {
		return this.estado.doar(this);
	}
}
