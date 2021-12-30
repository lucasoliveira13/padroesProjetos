
import { estanteInstanciada } from "./adicionando";

const estante = estanteInstanciada;

estante.adicionar({ titulo: 'Orgulho e Percepção', autor: 'Jane Austen' });

estante.adicionar({ titulo: '1984', autor: 'George Orwell' });

estante.mostrar();
