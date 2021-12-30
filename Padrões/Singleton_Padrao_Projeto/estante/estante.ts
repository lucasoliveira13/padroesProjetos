import { Livro } from '../interfaces/livro';

export class Estante {
  private static instance: Estante | null = null;
  private livros: Livro[] = [];

  private constructor() {}

  static getInstance(): Estante {
    if (Estante.instance === null) {
      Estante.instance = new Estante();
    }

    return Estante.instance;
  }

  adicionar(livro: Livro): void {
    this.livros.push(livro);
  }

  remover(index: number): void {
    this.livros.splice(index, 1);
  }

  mostrar(): void {
    var contador = 0;
    this.livros.forEach(element => {
      contador++;
      console.log('Livro '+ contador + '>>>  ' + 'nome: '+element.titulo + ' - idade: ' + element.autor);
    });
  }
}
