# Singleton

## Finalidade

*Garantir que uma classe tenha somente uma instância no programa e fornecer um ponto de acesso global para a mesma.*

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
- Na chamada do método público, adicione *lazy instantiation*, que verifica se uma instância do Singleton já foi criada; se foi, retorne-a, se não crie uma nova instância e retorne-a.
- Não permita que novas instâncias da classe. Você pode atingir facilmente este objetivo fazendo o construtor da classe privado.

## Vantagens

- Acesso controlado por encapsulamento à instância única;
- Permite um número variável de instâncias;
- É possível usar thead lock para assegurar que duas partes do código não alterem o singleton na mesma hora;
- Usa *lazy instantiation*, possibilitando o Singleton ser instanciado no momento do uso;

## Desvantagens

- É mais difícil de testar;
- Não corresponde o princípio da responsabilidade única;
- Necessita de um tratamento especial em casos de concorrência;