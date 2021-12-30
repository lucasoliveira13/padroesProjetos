import { Estante } from './estante/estante';

const estanteInstanciada = Estante.getInstance();

estanteInstanciada.adicionar({ titulo: 'Cinquenta tons de cinza', autor: 'E L James' });

export { estanteInstanciada };
