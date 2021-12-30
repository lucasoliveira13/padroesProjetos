import { Banco } from './banco-de-dados/banco';

const bancoInstanciado = Banco.getInstance();

bancoInstanciado.adicionar({ nome: 'Jean', idade: 30 });

export { bancoInstanciado };
