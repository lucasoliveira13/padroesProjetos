
import { bancoInstanciado } from "./adicionando";

const data = bancoInstanciado;

data.adicionar({ nome: 'João Paulo', idade: 30 });

data.adicionar({ nome: 'Lucas Oliveira', idade: 50 });

data.mostrar();
