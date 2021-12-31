# State
Para a disciplina padrões de projeto. 
Grupo: Jean Felipe Coelho Ferreira
João Paulo Queiroz Pires
Lucas Matheus da Silva Oliveira

## Finalidade

Basicamente, o State ele tem a capacidade de mudar o jeito que cada objeto se comporta, através da mudança de estado.
---

## Motivação

O padrão State é motivado por objetos variam o seu comportamento devido as diferentes mensagens que possa receber dependendo do seu estado. Como exemplo, tomamos uma classe Livro, um objeto desta classe terá respostas diferentes, dependendo do seu staus.


---

## Estrutura

![](../imagens/State.jpeg)

## Aplicação

Para a aplicação do Padrão de Projeto State, decidimos criar uma representação dos estados de um livro (Voltado pro nosso projeto de Análise de Sistemas) onde o mesmo poderia estar vendido, doado ou disponível(acessível). Desta forma, nossa projeto seria importante para checagem de status de um livro numa livraria, facilitando transações desde a compra, até doações.



## Implementação

Separamos o projeto em 4 classes principais, Livro, isDoado, isVendido, isAcessivel, as demais classes se comportam como interface e teste. Na classe Livro, possuímos os métodos doar, comprar, entregar e solicitar. Os métodos foram pensados desta maneira para representação de transações de livros numa livraria qualquer. 
  Doar -> O livro será recebido como doação. 
  Comprar -> O livro será vendido.
  Entregar -> O livro será devolvido.
  Solicitar -> Deverá verificar se o livro está acessível.



## Vantagens

- É fácil de localizar as funções de estados definido, porque se encontram nas classes que correspondem a cada estado. Esta facilidade é fornecida pelo fato de que diferentes estados são representados por um único atributo e não envolvidos em diferentes variáveis.
- Faz as mudanças de estado explícitas, posto que em outro tipo de implantação os estados são alterados, modificando os valores em variáveis, enquanto aqui fazer-se representar cada estado.
- Os objetos Estado podem ser compartilhados quando não contêm variáveis de instância, isto pode ser alcançado se o estado está totalmente codificado cada tipo.
- Facilita a expansão de estados.
- Permite a um objeto alterar de classe dado que ao modificar suas responsabilidades pela de outro objeto de outra classe, a herança e responsabilidades do primeiro mudaram pelas do segundo.


## Desvantagens

- Aumenta o número de subclasses.
