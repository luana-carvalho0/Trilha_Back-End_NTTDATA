<h1 align="center">
    <img src="https://ik.imagekit.io/j5g11jplqm5/NTT-Data-Logo_4rrWLwgl_.png?updatedAt=1636466995979">
</h1>

- [Sobre](#📄-sobre)
- [Desafios](#🚀-desafios)

## 📄 Sobre

O projeto <b>Financys</b> é um projeto de controle financeiro criado dentro do programa <b>Cybertron</b> com a finalidade de estudarmos e colocarmos em prática o Spring Boot diante de desafios teóricos e práticos.

## 🚀 Desafios 

<h3 >
    🎯 Desafio 1<br>
</h3>

<p>

a) Com suas palavras defina o que é um sistema de controle de versões (VCS)? (máx 10
linhas)<br>

R: O controle de versão tem como objetivo rastrear e gerenciar as alterações em códigos de
projetos de software, ajudando as equipes a trabalhar de forma mais rápida. Mantém o
registro de todas as modificações feitas ao longo do tempo, assim, se um erro for cometido,
os desenvolvedores podem voltar e comparar o código com versões anteriores para poder
corrigir o erro. Trabalhando em equipe, pode acontecer de dois desenvolvedores alterarem
uma mesma parte do código, o controle de versão ajuda a equipe rastreando essas
mudanças e ajudando a evitar conflito em trabalhos simultâneos.<br>

b) Cite 5 vantagens em utilizar um VCS:<br>

R: Preserva a eficiência e agilidade da equipe; ajuda na análise da causa raíz dos bugs; ser
capaz de rastrear cada alteração feita no código e ainda deixar uma mensagem
descrevendo a mudança; criar uma ramificação para nos beneficiar da capacidade de
trabalhar em fluxos independentes de mudança e segurança, cada software de controle de
versão usa mecanismos para evitar qualquer tipo de invasão de agentes infecciosos nos
arquivos. Além do mais, somente usuários com permissão poderão mexer no código.<br>

c) Cite 3 exemplos de VCS:<br>

R: Git, TFS, SVN (Subversion)

</p>

<h3 >
    🎯 Desafio 2<br>
</h3>

<p>
a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus
pilares? (máx 10 linhas) <br>

R: A orientação a objetos é um paradigma usado na programação e diz respeito a um
padrão de desenvolvimento seguido por muitas linguagens, como C# e Java. O intuito da
sua criação foi o de aproximar o manuseio das estruturas de um programas ao manuseio de
coisas no mundo real. Esse paradigma se baseia principalmente em dois conceitos, classes
e objetos, podemos dizer que um objeto está dentro de uma classe e o mesmo possui
características que são seus atributos e seus comportamentos são os métodos. Além disso,
a POO possui 4 pilares, abstração, encapsulamento, herança e polimorfismo.<br>

b) Exemplifique e explique um cenário de abstração;<br>

R: A abstração é a captura das principais características do objeto, de forma que elas
possam ser descritas dentro de uma classe, por exemplo o objeto carro, ele tem suas
propriedades, exemplificando, cor, quantidade de portas, modelo, marca, etc. E não só as
propriedades, ele tem também seus métodos como, frear, acelerar, buzinar, acender os
faróis, etc. <br>

c) Exemplifique e explique um cenário de encapsulamento;<br>

R: O encapsulamento é um técnica que adiciona segurança à aplicação, pelo fato de
esconder as propriedades. Para isso, é criada uma estrutura que contém métodos que
podem ser utilizados por qualquer outra classe, sem causar inconsistências no
desenvolvimento de um código. E isso é feito através dos métodos getters e setters. Tendo
como exemplo uma classe de conta bancária, nela temos os atributos nome e saldo e
usaremos os métodos depositar e sacar, se os atributos puderem ser acessados
diretamente em qualquer parte do código, corre o risco de o saldo ser alterado sem passar
pelo método depositar. Para evitar isso, usamos os métodos get e set.<br>

d) Exemplifique e explique um cenário de herança;<br>

R: A herança é um pilar que faz uso de um dos recursos mais vantajosos da POO, o reuso
de código, uma classe filha herda todas as características da sua classe pai, ou seja ela
possui todos os métodos e atributos da classe a qual deriva. Por exemplo, a classe Fiat,
deriva da classe Carro, então a classe Fiat terá todas as características da classe Carro
mais as características dadas a ela.<br>

e) Exemplifique e explique um cenário de polimorfismo;<br>

R: O polimorfismo é a alteração de um método herdado de um objeto pai. Por exemplo,
temos um objeto pai chamado Eletrodoméstico e outros dois objetos filhos chamados
Televisão e Geladeira, eles não são ligados da mesma forma, portanto teríamos que
reescrever o método Ligar().<br>

f) Cite 5 vantagens da POO;<br>

R: - Reuso de código
- Permite que você represente melhor o mundo real em seu programa
- Os programas são mais fáceis de modificar
- Otimização do tempo, com o recurso da herança por exemplo, fica mais fácil criar
vários objetos, então economiza bastante o tempo.
- Todo software orientado a objeto é confiável (ao alterar uma parte nenhuma outra é
afetada)

</p>

<h3 >
    🎯 Desafio 3<br>
</h3>

<p>

a) Com suas palavras defina: (máx 5 linhas)<br>

i. O que é o protocolo de comunicação HTTP e como ele funciona;<br>

R: HTTP é um protocolo de transferência que possibilita que as pessoas que inserem a URL
do seu site na Web possam ver os conteúdos e dados que nele existem. As pessoas que
acessam o site enviam solicitações a servidores. Depois que a solicitação é atendida por
um servidor, a conexão entre o usuário e o servidor é desconectada. Uma nova conexão
deve ser feita para cada solicitação, isto é, cada vez que alguém acessa o seu site.<br>

ii. O que é REST, e qual é a sua relação com o protocolo HTTP;<br>

R: REST é um conjunto de restrições de arquitetura. A arquitetura REST é composta de um
conjunto de diretrizes que podem ser implementadas conforme necessário. Quando um
cliente faz uma solicitação usando uma API RESTful, essa API transfere uma representação
do estado do recurso ao solicitante ou endpoint. Essa informação (ou representação) é
entregue via HTTP.<br>

iii. O que é Web API, e qual é a sua relação com REST;<br>

As APIs são construções disponíveis nas linguagens de programação que permitem a
desenvolvedores criar funcionalidades complexas mais facilmente.Uma Web API fornece
toda infraestrutura para o desenvolvimento dos serviços, faz a escolha do método a ser
executado, converte as mensagens em parâmetros e os tipos adequados, aplica filtros, etc.<br>

b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas
respectivas finalidades;<br>

R: GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS e CONNECT.<br>

i) O que é Swagger? (máx 5 linhas)<br>

R: O swagger é um documento que especifica a lista de recursos que estão
disponíveis na API REST e as operações que podem ser chamadas nesses
recursos. O documento Swagger também especifica a lista de parâmetros para uma
operação, incluindo o nome e o tipo dos parâmetros, se os parâmetros são
necessários ou opcionais e informações sobre valores aceitáveis para esses
parâmetros

</p>
