package State_Projec;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro("Padrões de Projeto");
		Livro livro1 = new Livro("Análise e desenvolvimento de projetos");

		/*livro.solicitar();
		livro.comprar();
		livro.entregar();
		livro.solicitar();
		livro.entregar();
		livro.doar();*/
		
		livro1.entregar();
		livro1.doar();
		livro1.comprar();
		livro1.solicitar();
		livro1.comprar();
		livro1.solicitar();
	}

}
