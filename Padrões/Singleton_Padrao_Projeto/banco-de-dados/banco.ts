import { Usuario } from '../interfaces/usuario';

export class Banco {
  private static instance: Banco | null = null;
  private usuarios: Usuario[] = [];

  private constructor() {}

  static getInstance(): Banco {
    if (Banco.instance === null) {
      Banco.instance = new Banco();
    }

    return Banco.instance;
  }

  adicionar(usuario: Usuario): void {
    this.usuarios.push(usuario);
  }

  remover(index: number): void {
    this.usuarios.splice(index, 1);
  }

  mostrar(): void {
    for (const usuario of this.usuarios) {
      console.log(usuario);
    }
  }
}
