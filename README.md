# padroesProjetos
Para a disciplina padrões de projeto. 
Grupo: Jean Felipe Coelho Ferreira
João Paulo Queiroz Pires
Lucas Matheus da Silva Oliveira

1- State
  Basicamente, o State ele tem a capacidade de mudar o jeito que cada objeto se comporta, através da mudança de estado. Ao executar o código notamos que o processo se assemelha
  muito à uma "mudança" de classe, já que uma hora o objeto pode ser X e através de uma transação ele passa a se comportar como Y. Além disso, sentimos que o padrão em si ajuda
  muito na compressão de condicionais. 
  Para a implementação do Padrão de Projeto State, decidimos criar uma representação dos estados de um livro (Voltado pro nosso projeto de Análise de Sistemas)
  onde o mesmo poderia estar vendido, doado ou disponível(acessível). Desta forma, nossa projeto seria importante para checagem de status de um livro numa livraria,
  facilitando transações desde a compra, até doações. 
  Separamos o projeto em 4 classes principais, Livro, isDoado, isVendido, isAcessivel, as demais classes se comportam como interface e teste. Na classe Livro, possuímos os métodos
  doar, comprar, entregar e solicitar. Os métodos foram pensados desta maneira para representação de transações de livros numa livraria qualquer. 
  Doar -> O livro será recebido como doação. 
  Comprar -> O livro será vendido.
  Entregar -> O livro será devolvido.
  Solicitar -> Deverá verificar se o livro está acessível.
  
  Algumas regras: 
  1- Um livro não pode ser entregue uma vez que já estiver acessível. Entregar funciona como uma devolução. 
  2- Não se pode comprar um livro que não está acessível.
  3- Livros acessíveis podem receber doação. 
  4- Solicitar não deve alterar o estado do livro.
  5- Em caso de devolução de um livro antes vendido, o mesmo voltará a estar acessível. 
  
  Pensamos dessa maneira para trazer um pouco mais a realidade do projeto que já estávamos desenvolvendo. 
  
