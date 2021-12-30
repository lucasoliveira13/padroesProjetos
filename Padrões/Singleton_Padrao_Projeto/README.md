# Singleton

## Finalidade

_Garantir que uma classe tenha somente uma instância no programa e fornecer um ponto de acesso global para a mesma._

---

## Objetivos

O Singleton é um padrão de projeto que tem como objetivo a solução de dois problemas de uma aplicação:

- **Garantir que uma classe tenha somente uma instância no programa** - Mais comum em programas que acessam recursos compartilhados, como bases de dados, sistemas de arquivos, interfaces gráficas, spoolers de impressão, módulos de um programa e entre outos.
- **Fornecer um ponto de acesso global para a mesma** - Assemelha o singleton com variáveis globais, porque possuimos um único objeto, com acesso global, que pode ser usado em várias partes da aplicação.

Mesmo sendo um dos padrões com maior uso atualmente, requer muito conhecimento e cuidado quando for utilizar. Um programador facilmente cria um Singleton que pode acabar gerando problemas de concorrência dentro do programa.

O singleton por possuir duas responsabilidades acaba quebrando a regra SRP (Single Responsibility Principle).

---

## Estrutura

<img src="/singleton/diagramas/Singleton.png">

## Aplicação

Devemos usar o Singleton quando:

- Use o singleton quando uma classe precisa ter somente uma instância disponível em todo o seu programa;
- Use o singleton quando perceber que está usando variáveis globais para manter partes importantes do programa, como variáveis de configuração que são usadas por toda a aplicação.

## Implementação

Implementação deve mudar de linguagem para linguagem, em Python seria de uma maneira, em Java de outra e em linguagens com tipagem estática, como TypeScript, outra. Mas padrão sobre singletons é o seguinte:

- Declarar um campo privado na classe para armazenar a instância do Singleton.
- Declarar um método público getters para obter a instância do Singleton;
- Na chamada do método público, adicione _lazy instantiation_, que verifica se uma instância do Singleton já foi criada; se foi, retorne-a, se não crie uma nova instância e retorne-a.
- Não permita que novas instâncias da classe. Você pode atingir facilmente este objetivo fazendo o construtor da classe privado.

## Vantagens

- Acesso controlado por encapsulamento à instância única;
- Permite um número variável de instâncias;
- É possível usar thead lock para assegurar que duas partes do código não alterem o singleton na mesma hora;
- Usa _lazy instantiation_, possibilitando o Singleton ser instanciado no momento do uso;

## Desvantagens

- É mais difícil de testar;
- Não corresponde o princípio da responsabilidade única;
- Necessita de um tratamento especial em casos de concorrência;

Fizemos o seguinte criamos uma Estante para armazenar livros em memória no caso, usamos módulos para importar essa estante e usar ela.
No código começamos exportando a nossa Estante e ai a gente cria o singleton.
Criamos o atributo que vai sustentar a nossa instância
Essa instância vai ser do tipo estante que a própria
classe ou ele pode ser nulo também,
Outra coisa que fizemos foi colocar um construtor privado para não poder utilizar a funcionalidade new() dentro dessa dessa classe.
Criamos o getter para instância da forma que se já estivesse criada utilizaria a mesma e não criaria uma nova, e dessa forma a própria classe vai gerenciar a instância, e isso já configura um singleton.
A partir disso começamos a implementar a nossa insstância de estante,
Criamos um atributo privado livros que é um array do tipo Livro (que é uma interface que traz a estrutura de um livro, título e autor), e lá
ficarão armazenados em memória os livros inseridos.
A partir desse cenário começamos a fazer os métodos que uma estante executaria.
Primeiramente o adicionar que iria receber um atributo do tipo Livro, e seria inserido no atributo livros.
Depois o remover que retiraria o livro do atributo livros de acordo com o indice informado por parametro.
E também o mostrar que exibiria no console os livros que estão atualmente na estante.
Após isso foi instanciada a estante no arquivo adicionando.ts e logo após isso adicionado um livro e exportado essa instância.
Logo em seguida importamos a instância do arquivo adicionando.ts e no arquivo index.ts, jogamos dentro de uma constante, adicionamos mais dois livros e utilizamos o método mostrar para exibi-los no console.
