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

<h3 >
    🎯 Desafio 4<br>
</h3>

<p>

a) Com suas palavras conceitue: (máx 5 linhas/cada)<br>

i. O que é JDBC?<br>

R: JDBC significa Java Database Connectivity. Esta é uma tecnologia bem conhecida e
comumente utilizada para a implementação da interação do banco de dados. É um conjunto
de classes e interfaces (API) escritas em Java que fazem o envio de instruções SQL para
qualquer banco de dados relacional; Api de baixo nível e base para api’s de alto nível.<br>

ii. O que é ORM, cite 3 exemplos?<br>

R: É uma técnica de mapeamento objeto relacional que permite fazer uma relação dos
objetos com os dados que os mesmos representam. O ORM é a ponte entre o mundo
relacional e o mundo orientado a objetos, é ele quem vai permitir que você armazene os
seus objetos no banco de dados. Ex: Hibernate, NHibernate, Entity Framework.<br>

iii. O que é JPA e qual é a sua relação com os ORM’s?<br>

R: JPA é uma especificação oficial que descreve como deve ser o comportamento dos
frameworks de persistência Java que desejarem implementá-la. AJPA é uma interface que
possui algumas assinaturas, Apesar de não ter nada executável, a especificação possui
algumas classes, interfaces e anotações que ajudam o desenvolvedor a abstrair o código. É
também um framework para Mapeamento Objeto-Relacional (ORM - Object-Relational
Mapping).<br>

iv. O que é Spring Data?<br>

R: O Spring Data é um framework que nasceu para facilitar a criação dos nossos
repositórios.Ele faz isso nos liberando de ter que implementar as interfaces referentes aos
nossos repositórios (ou DAOs), e também já deixando pré-implementado algumas
funcionalidades como, por exemplo, de ordenação das consultas e de paginação de
registros.<br>

d) O que caracteriza um projeto “CRUD básico”?<br>

R: Um sistema CRUD básico seria aquele que realiza as quatro operações básicas, C
(Create), R (Read), U (Update), D (Delete), sem o uso de outros recursos dos bancos de
dados relacionais. O CRUD por si só representa a forma representar (computacionalmente)
e manipular os dados. Do ponto de vista do desenvolvedor, ele precisará criar as tabelas
(modelos) do banco de dados, funções (controles) que atualizarão o banco de dados e as
interfaces (visões), como página web ou aplicativo mobile, em que os usuários irão interagir
com os dados. Em sistemas mais atuais, os dados do CRUD podem ser manipulados por
outros sistemas via API

</p>

<h3 >
🎯 Desafio 5<br>
</h3>
<p>

a) Defina com suas palavras qual é a responsabilidade das camadas
vistas até agora, entity, controller, repository e service. (máx 10 linhas)<br>

● Entity: É a camada que contém as entidades, as classes contendo um ou mais
construtores, atributos e métodos que encapsulam seu comportamento.<br>

● Controller: É a camada responsável tanto por receber requisições
como por enviar a resposta ao usuário.<br>

● Repository: Anota classes na camada de persistência, que atuará
como um repositório de banco de dados. Através dela, podemos fazer
consultas e inserções no banco de dados.<br>

● Service: Faz anotações de classes na camada de serviço. Se
utiliza uma camada de serviço no meio, entre o controller e o repository, na qual ficam
as regras de negócio da aplicação.

</p>

<h3 >
🎯 Desafio 6<br>
</h3>
<p>

a) O que significa DTO, e qual sua importância? (máx 10 linhas)<br>

R:  DTO é um padrão de projetos bastante usado em Java para o 
transporte de dados entre diferentes componentes de um sistema,
diferentes instâncias ou processos de um sistema distribuído 
ou diferentes sistemas via serialização. São classes que ajudam
a fazer a manipulação dos dados de forma mais segura, 
encapsulando os objetos e tornando a aplicação mais segura.

</p>

<h3 >
🎯 Desafio 8<br>
</h3>
<p>

a) O que são exceptions? (máx 5 linhas)

R: A exceção é um evento não esperado que acontece no sistema em tempo de execução. 
Quando o sistema acha alguma exceção interrompe o fluxo de código.

b) Qual é o funcionamento do try, catch e finally? (máx 10 linhas)

R: Um bloco try contém comandos que caso ocorra algum erro desviará para os blocos catch correspondentes. 
Uma cláusula catch contém declarações que especificam o que fazer caso uma exceção seja lançada no bloco try. 
Caso a exceção não seja esperada no primeiro bloco catch, a execução pula pro próximo bloco catch, se houver. 
O bloco finally sempre finaliza a sequência de comandos do sistema, independente de ocasionar algum erro no sistema. 
Esse bloco é opcional, não é obrigatório colocá-lo na sequência try/catch.

c) Qual a relação entre “try, catch e finally” e “throws”? (máx 5 linhas)

R: Todos são usados para tratamento de exceções.

d) Para que serve a annotation @ExceptionHandler? (máx 5 linhas)

R: É uma anotação usada para tratar as exceções específicas e enviar as respostas personalizadas ao cliente.

e) Para que serve o comando throw? (máx 5 linhas)

R: É usado em situações em que não é desejado que uma exceção seja tratada na própria classe ou método, mas sim em outro método que venha lhe chamar. Para isso, utilizamos o comando throws na assinatura do método.

f) Para que serve a annotation @ControllerAdvice? (máx 10 linhas)

R: É usado para tratamento global de erros no aplicativo Spring MVC. Ele também tem controle total sobre o corpo da resposta e o código de status.

</p>

<h3 >
🎯 Desafio 9<br>
</h3>

<p>
a) O que é um padrão de projeto e por que nós os utilizamos? (máx 5 linhas) 

R: São padrões usados para solucionar problemas comuns 
encontrados no desenvolvimento ou manutenção de um software. 
São utilizados visando solucionar aqueles problemas comuns
que todo desenvolvedor encontra no dia a dia.

b) Cite e explique com suas palavras:

i. Um dos padrões de criação;

R: Factory Method, define uma interface para criar objetos, 
mas deixa que as subclasses decidam que classe instanciar. 
O Factory Method, permite adiar a criação do objeto a subclasses.

ii. Um dos padrões estruturais;

R: Adapter, converte a interface de uma classe por outra esperada 
pelos clientes . O que possibilita que classes com interfaces 
incompatíveis trabalhem em conjunto. Faz exatamente o que um 
adaptador da vida real faz (pense em um adaptador de tomadas, 
ele permite que um plug de um formato ligue em outro plug com um
formato diferente).

iii. Um dos padrões comportamentais;

R: Template Method, define o esqueleto de um algoritmo em um 
método. O Template Method permite que subclasses redefinam 
certos passos de um algoritmo sem mudar a estrutura dele.

c) Explique o conceito de arquitetura de software e seu propósito.

R: Arquitetura de software, resumidamente, é o modelo no qual o 
sistema deve ser desenvolvido. Ela abrange a forma como suas 
partes devem ser organizadas, incluindo questões como o 
comportamento e quais componentes são responsáveis por realizar 
um conjunto específico de funções. Identifica os principais 
componentes estruturais de um sistema e os relacionamentos entre 
eles. O resultado do processo de projeto de arquitetura é um modelo 
de arquitetura que descreve como o sistema está organizado em um 
conjunto de componentes de comunicação.

i. Qual arquitetura estamos seguindo até o momento? Justifique sua resposta. (máx 10 linhas)

R: Arquitetura de camadas(layers), pois os componentes da aplicação
estão organizados em camadas de funcionalidades, que podem ser 
desconstruídas em diferentes serviços.

e) O que significa a sigla SOLID?

R: O S.O.L.I.D é um acrônimo que representa cinco princípios da 
programação orientada a objetos e design de código.

Single Responsibility Principle (Princípio da Responsabilidade Única)

Open/Closed Principle (Princípio do Aberto/Fechado)

Liskov Substitution Principle (Princípio da Substituição de Liskov)

Interface Segregation Principle (Princípio da Segregação de Interfaces)

Dependency Inversion Principle (Princípio da Inversão de Dependências)

f) Quais princípios foram utilizados no projeto até o momento? Explique. (máx 10 linhas)

R: Princípio da Responsabilidade Única, pois cada camada da 
aplicação tem uma funcionalidade, como as classes repositories, 
ela tem a função de trabalhar diretamente com o banco na 
manipulação dos dados, já a camada de exception cuida das 
exceções da aplicação.

</p>

<h3 >
🎯 Desafio 10<br>
</h3>

<p>

a) O que você entende por Spring Framework?

R: É um framework desenvolvido para o Java baseado em padrões
de projeto, inversão de controle e injeção de dependência.
É constituído por diversos módulos capazes de impulsionar e
melhorar muito nossa aplicação Java.

b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades;

R: Spring Data JPA - tem o propósito de fornecer um modelo de programação baseado em Spring para acesso a dados de maneira fácil e sem complicações.

Spring Security - é uma estrutura de autenticação e autorização poderosa e altamente personalizável para proteção de aplicações baseados em Spring Framework.

Spring Web - é utilizado para criar aplicativos Web, incluindo RESTful, utilizando o Spring MVC.

c) Quais ferramentas do Spring foram utilizadas na trilha até o momento?

R: Spring Data JPA e Spring Web.

d) Cite 5 vantagens em utilizar Spring;

Reduz o tempo de desenvolvimento, devido as facilidades de configuração.
Aumenta a produtividade, já que o desenvolvedor gasta menos tempo nas   configurações de projeto
Possui um servidor embutido, o Tomcat.
Arquivo pom.xml bem organizado, pois colocando uma dependência, temos acesso às subdependências. Então, adicionando apenas uma dependência, você tem acesso a várias outras sem ter que colocá-las de fato na sua aplicação.
Não necessitamos começar uma aplicação do zero, o spring dá todas as configurações iniciais.

e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server;

R: Primeiro criamos o projeto no site Spring Initializr. Neste projeto, temos um arquivo muito importante, o pom.xml, que contém as dependências que definimos para o nosso projeto. E o arquivo FinancysApplication que contém o main. Vamos criar um pacote para nossas entidades, que conterá os métodos e atributos do nosso objeto. Em seguida criamos nosso repositório, que estende da interface JpaRepository do Spring Data. Esta interface possui métodos para as operações padrão de um CRUD. Aproveitando que definimos o repositório, vamos configurar o banco de dados SQL Server. Esta configuração deve ser definida no arquivo application.properties. Por fim, vamos definir o controller da nossa aplicação. Assim como antes, ele será definido em um sub-package do package padrão da aplicação. Desta maneira teremos uma aplicação com conexão com o SQL Server.

f) Qual a funcionalidade do pom.xml?

R: O arquivo pom.xml contém todas as configurações que o Maven necessita para interagir corretamente com o projeto, ele possui coordenadas, dependências, repositórios, plugins e estratégias de construção do projeto.

g) Qual a funcionalidades do applications.properties?

R: No arquivo das propriedades de aplicação é possível parametrizar muitos aspectos e comportamentos da aplicação.

h) Qual o propósito das Annotations?

R: É um recurso da plataforma Java que fornece o uso de metadata ao longo do código que podem ser interpretadas por um compilador que irá realizar alguma tarefa pré-definida.

i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização

R: @Entity - Declara uma entidade do tipo relacional, como uma tabela, porém é uma classe java.

@Id - Define o identificador da tabela

@SequenceGenerator - Forma de auto incremento de determinado campo.

@Override - É uma anotação de marcador que pode ser usada apenas em métodos. Um método anotado com @Override deve substituir um método de uma superclasse.

@Documented - É uma interface de marcador que informa a uma ferramenta que uma anotação deve ser documentada.

@Mapping - permite definirmos qual atributo da classe será mapeado para outro com nome diferente.

@Autowired - permite fazer uma injeção de dependência em uma classe.

@Controller - é uma anotação comum usada para marcar uma classe como Spring MVC Controller.

@Service faz anotações de classes na camada de serviço.

@Repository anota classes na camada de persistência, que atuará como um repositório de banco de dados.

j) O que é um advice em Spring? Quais os tipos de advice para o Spring?

R: Advice é uma ação realizada por um aspecto em um ponto de junção específico; existem alguns tipos como, before, after, after-returning, after-throwing e around.


k) O que é Spring IoC Container?

R: O Spring IoC container busca informações em XML, annotations ou código java sobre como os beans devem ser instanciados, configurados e montados, e como se relacionam com outros beans.

l) Como adicionamos segurança à nossa aplicação Spring?

R: Utilizando o Spring Security, que é um framework do projeto Spring que possui um sistema de autenticação e autorização de alto nível e altamente customizável para aplicações Java.

m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?

R: JPA.

n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade

R: Frequentemente temos especificações de aplicações que necessitam realizar tarefas de 
forma agendada, sejam para geração de relatórios, backups, ou simplesmente para tirar 
proveito de momentos com menor tráfego de rede para a execução de tarefas que demandem 
maior necessidade computacional. O Spring Framework fornece abstrações para a execução 
assíncrona e agendamento de tarefas com as interfaces TaskExecutore TaskScheduler, 
respectivamente.

</p>

<h3 >
🎯 Desafio 11<br>
</h3>

<p>

a) O que são libs quando se trata de código? (máx 3 linhas)

R: São bibliotecas, que é uma coleção de subprogramas usados no desenvolvimento de um software, elas contém código e dados auxiliares, que provém serviços a programas independentes, o que permite o compartilhamento e a alteração de código e dados.

b) Cite 2 libs populares no Java e seu objetivo; (máx 3 linhas)

R: JUnit - Com o Junit podemos criar testes para verificar funcionalidades de classes e seus métodos.

Mockito Core - Usado durante o teste de unidade, isso permitirá que você não gire um ambiente inteiro para o seu teste.

c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml? (máx 5 linhas)

R: Maven é uma ferramenta de automação de compilação. O principal objetivo do Maven é facilitar e uniformizar todas as fases de construção de um projeto. auxilia na configuração do projeto, na construção, versionamento e na manutenção. O pom.xml é a unidade fundamental de trabalho no Maven. É um arquivo XML que contém informações sobre o projeto e detalhes de configuração usados ​​pelo Maven para compilar o projeto.

d) Qual é a diferença do Maven para o Gradle? (máx 3 linhas)

R: O Gradle é uma ferramenta mais robusta que o Maven. Os scripts do Gradle são declarativos, de fácil leitura, e expressivo. Escrever o código em Groovy ao invés de XML como fazemos no maven, o tamanho de um script é bem menor e muito mais legível.

e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de dados.

I. Qual a relação entre os termos lib, driver e JDBC?

R: Podemos dizer que o JDBC é a API que reúne conjuntos de classes e interfaces escritas na linguagem Java na qual possibilita se conectar através de um driver específico do banco de dados desejado. E as libs são as dependências do banco desejado colocadas no arquivo pom.xml. Os Drivers, além de atuar como uma interface entre os SGBDs e as aplicações, também pode ser considerado como um tradutor que ajuda na definição das mensagens binárias trocadas com um protocolo de um SGBD.

II. Como é adicionado uma lib no projeto?

R: Fazendo a importação de pacotes pra dentro do projeto, mas é necessário que a implementação desse pacote esteja em um lugar conhecido. Com o Maven, você não precisa se preocupar em procurar os arquivos jars das bibliotecas para adicioná-los ao classpath do seu projeto. Isso é feito pelo Maven, você só precisa se preocupar em informar o identificador daquela dependência para que ele saiba quem baixar.

III. Escolha um banco de dados (menos o H2) e explique como utilizar o driver de comunicação.

R: No arquivo pom.xml adicionamos as dependências e o driver de comunicação do SQL Server. Precisamos substituir em application.properties as propriedades do banco de dados H2 definidas, pelas propriedades do SQL Server. Configurar o SQL Server na sua máquina.

</p>

<h3 >
🎯 Desafio 12<br>
</h3>

<p>
a) Explique o conceito de teste unitário? 

R: É a fase de testes onde cada unidade do sistema é testada individualmente, valida apenas aquilo que está sendo construído ou alterado, normalmente feito pelo desenvolvedor ou de maneira automática.

b) Descreva como fazer um código de teste.

R: O teste deve ser feito em um pacote a parte, mais especificamente no pacote test, no caminho src/test/java; criamos uma classe dentro desse pacote e anotamos o @SpringBootTest para dizer que essa é uma classe de teste do Spring, anotamos também o @Test no método para garantir que aquele é um método de teste. Este novo teste criado inicialmente falha, já que ainda não temos a implementação da funcionalidade em questão e, em seguida, implementamos a funcionalidade para fazer o teste passar

c) Qual o intuito do teste unitário?

R: Isolar cada parte do sistema para garantir que elas estejam funcionando conforme especificado.

d) Quais são as ferramentas que utilizamos para realizar testes unitários(2 pelo menos).

R: JUnit e Selenium.

Desenvolva  o  teste  unitário  para  o  método  acima,  digitando  abaixo  todos  stack traces de erros e explique em uma só frase qual o erro

Stack traces


org.mockito.exceptions.misusing.UnfinishedStubbingException:
Unfinished stubbing detected here:
-> at testes.TrilhaBackTestes.filterTest(TrilhaBackTestes.java:37)

E.g. thenReturn() may be missing.
Examples of correct stubbing:
when(mock.isOk()).thenReturn(true);
when(mock.isOk()).thenThrow(exception);
doThrow(exception).when(mock).someVoidMethod();
Hints:
1. missing thenReturn()
2. you are trying to stub a final method, which is not supported
3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed


	at trilha.back.financys.service.impl.LancamentoServiceImpl.filter(LancamentoServiceImpl.java:75)


R: Faltou o retorno do mockito, thenReturn após o when.



org.opentest4j.AssertionFailedError: Expected java.lang.ArithmeticException to be thrown, but nothing was thrown.

	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:71)
	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:37)
	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3007)
	at testes.TrilhaBackTestes.filterTestErro(TrilhaBackTestes.java:48)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)


R: O tipo de exceção estava errado, ao invés de usar ArithmeticException eu precisava mudar o tipo para RuntimeException.




org.opentest4j.AssertionFailedError: expected: <Parâmetros com valores errados> but was: <Parametros com valores errados>
Expected :Parâmetros com valores errados
Actual   :Parametros com valores errados
<Click to see difference>


	at org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)
	at org.junit.jupiter.api.AssertionUtils.failNotEqual(AssertionUtils.java:62)
	at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
	at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:177)


R: A mensagem de exceção do teste tinha um acento, enquanto a do service não tinha, então deu erro ao comparar as duas.



java.lang.NullPointerException
at trilha.back.financys.testes.TestesController.filterLancamentoController(TestesController.java:62)
at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)


R: Era preciso “startar” o MockMvc, por isso estava dando erro de NullPointer.



</p>

<h3 >
🎯 Desafio 13<br>
</h3>

<p>

<img src="https://ik.imagekit.io/j5g11jplqm5/Captura_de_Tela__53__lsdD-6Fhk.png?updatedAt=1641232733037">

<img src="https://ik.imagekit.io/j5g11jplqm5/Captura_de_Tela__54__PlQn50sMu.png?updatedAt=1641232845661">

<img src="https://ik.imagekit.io/j5g11jplqm5/Captura_de_Tela__55__En1NzMmNq.png?updatedAt=1641232873783">

<img src="https://ik.imagekit.io/j5g11jplqm5/Captura_de_Tela__56__CqeKusUtdiW.png?updatedAt=1641232874073">
</p>

<h3 >
    🎯 Desafio 14<br>
</h3>

<p>

a) Desafio 1 - Git:

I. Dê 2 exemplos de situações onde é necessário utilizar merge:

R: No trabalho em equipe, para fazer a comparação e evitar conflitos.

II. Com qual objetivo realizamos o commit?

R:  Um commit serve como um ponto de retorno no projeto. O Git possui ferramentas que possibilitam acessar o projeto exatamente como ele estava quando cada commit foi feito. Isso traz várias vantagens, como dar mais segurança para fazer modificações no sistema (afinal, se a mudança estiver incorreta, é possível reverter o commit e voltar o código do projeto para como ele estava antes do commit ser feito) ou facilitar na correção de bugs, pois é possível executar o projeto localmente em um commit anterior à introdução de algum bug específico no código.

III. Qual a diferença entre: git add -all git add -u git add -A git add .

R: git add -all -> Coloca todos arquivos (novos, modificados e removidos) no index/stage
git add -u -> Coloca no Stage apenas arquivos modificados e removidos
git add . -A -> Coloca todos arquivos (novos, modificados e removidos) no index/stage.
git add . -> Coloca todos arquivos (novos, modificados e removidos) no index/stage.

IV. Qual é a ordem dos comandos para subir novas atualizações, verificando se existem alterações a serem recebidas?

R: git diff, git add ., git commit -m “”, git push -u origin nomeDaBranch.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 1? Se não, justifique;

R: Sim

b) Desafio 2 - POO e Entity:

I. Qual é a finalidade da camada Entity?

R: Definir propriedades, métodos e atributos dos nossos objetos.

II. Para você, por que acha que seguimos a programação orientada a objetos?

R: Pois é um tipo de programação muito eficiente, robusto, facilitador, nos permite trazer mais segurança ao código.

III. Qual é o ideal por trás de utilizar os métodos getters e setters?

R: Para encapsular os objetos.

IV. Qual o propósito de um construtor em uma classe? Podemos criar uma classe sem construtor?

R: O construtor determina quais ações devem ser executadas quando vai ocorrer a criação de um objeto. Toda classe tem pelo menos um construtor definido, se nenhum construtor foi definido pelo desenvolvedor da classe, o compilador Java inclui um construtor padrão, que não recebe argumentos.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 2? Se não, justifique;

R: Sim

c) Desafio 3 - HTTP, REST e Controller:

I. Qual é o objetivo da camada Controller?

R: Intermediar requisições enviadas pelo View com as respostas fornecidas pelo Model.

II. No que os padrões REST nos auxiliam?

R:

III. Quais métodos HTTP utilizamos para montar um CRUD?

R: Create, Read, Update, Delete.

IV. Qual a diferença entre as annotations @PathVariable, @RequestParam, @RequestBody? E com quais métodos HTTP elas podem ser utilizadas respectivamente?

R: O @PathVariable é utilizado quando o valor da variável é passada diretamente na URL, mas não como um parâmetro, por outro lado, podemos ter vários parâmetros passados por url mas que não são parte da url em si, eles não são parte integrante da URL, por este motivo devem ser capturadas no controller utilizando @RequestParam. @RequestBody é para indicar ao Spring que um recurso não será enviado ou recebido por meio de uma página da Web.

V. Para que serve ResponseEntity?

R: ResponseEntity deve representar a resposta HTTP inteira. Você pode controlar tudo o que for necessário: código de status, cabeçalhos e corpo.

VI. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 3? Se não, justifique;

R: Sim.

d) Desafio 4 - JPA e Repository:

I. Qual é o propósito da camada Repository?

R: Prover uma interface para tratar o armazenamento e recuperação de dados das entidades.

II. De maneira prática como funciona a injeção do Repository? E qual a sua relação com @Autowired?

R: Injetamos a classe de persistência em outra classes para termos acesso aos dados da API, a injeção ocorre de maneira simples usando a anotação @Autowired, que serve para marcar pontos de injeção dentro da classe.

III. Quais são as facilidades em utilizar JPA?

R: JPA além de ser um framework leve, também oferece diversas funcionalidades essenciais em qualquer aplicação corporativa, como capacidade de mapeamento, consultas dinâmicas, integração, testes, entre outras.

IV. Quais são os passos para configurar um banco de dados em um projeto Spring?

R: Depois de criado o projeto com uma classe repository que estende o JPA, vamos em um arquivo chamado application.properties e configuramos um banco escolhido anteriormente dentro desse arquivo, configuramos um username, password, url e o driver.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 4? Se não, justifique;

R: Sim.

e) Desafio 5 - Service:

I. Qual é a finalidade da camada Service?

R: A camada Service serve para inserirmos toda a lógica da nossa aplicação.

II. Qual o sentido de um método ter apenas um propósito?

R: Manter a clareza, melhorar escopo e organização do código.

III. Qual a diferença entre um método void e métodos tipados?

R: Um método void não tem nenhum tipo de retorno, enquanto os métodos tipados tem que necessariamente retornar algo.

IV. É normal um serviço chamar outro?

R: Sim.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 5? Se não, justifique;

R: Sim.

f) Desafio 6 - DTO:

I. Quais problemas conseguimos resolver utilizando a camada DTO?

R: Encapsulamento de dados, esconder de clientes informações sigilosas.

II. Qual a diferença de realizarmos o “de para” utilizando constructor ou getters e setters?

R:

III. No que a utilização do Mapper nos auxilia? Achou fácil a implementação?

R: Nos ajuda a mapear os dados das entidades para o DTO; sim.

IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 6? Se não, justifique;

R: Sim.

g) Desafio 7 - Manipulação de dados:

I. Qual é a forma de validar os dados de uma requisição sem utilizar @Valid?

R: Implementando métodos de validação.

II. Para que serve um ENUM? Cite exemplos;

R: São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores pré-definidos. Se você usar enumerações em vez de números inteiros (ou códigos de Cadeia de Caracteres), aumentará a verificação em tempo de compilação e evitará erros de transmitir constantes inválidas e documentará quais valores são legais para usar. Por exemplo, escolher cartas em um baralho, definindo as contantes das cartas previamente, evitará de o programa me retornar uma constante inválida.

III. Como criamos um custom validator? E qual o objetivo de criar um?

R: O primeiro passo é criar uma anotação para marcar o atributo para validação e configurar algumas propriedades.Após criado a anotação para invocar a validação, é preciso implementar regra de validação, que é feita em uma classe concreta que foi referenciada na anotação @Constraint. A classe de validação implementa ConstraintValidator e precisa sobrescrever o método isValid, que o método que vai considerar se o valor recebido através do parâmetro value é valido ou não. Finalizado as implementações, agora é apenas utilizar a anotação no atributo desejado. Usamos o CustomValidator controle para fornecer uma função de validação definida pelo usuário para um controle de entrada. O CustomValidator controle é um controle separado do controle de entrada que ele valida, o que permite que você controle onde a mensagem de validação é exibida.

IV. Qual foi a diferença entre utilizar for e streams no desafio 6?

R: Stream facilita muito a implementação, desde que você esteja com os conceitos bem fixados e entendidos na mente. Mas depois de entendido o stream deixa o código menor e facilita muito a implementação.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 7? Se não, justifique;

R: Sim.

h) Desafio 8 - Tratamento de exceptions:

I. Qual a finalidade de trata-las?

R: Tratar a ocorrência de condições que alteram o fluxo normal da execução de programas.

II. Como as descobrimos?

R: Através de erros.

III. Como fazemos para estourar um exception em uma determinada linha?

R: Fazendo testes que dão erro, por exemplo em uma ArithmeticException tentar dividir um número por zero, vai extourar a exception.

IV. Qual é a melhor forma de implementarmos nosso controle de exceções?

R: Criando classes para tratamento de exceções.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 8? Se não, justifique;

R: Sim.

i) Desafio 9 - Patterns, SOLID e Arquitetura:

I. O que é Singleton Pattern?

R: Singleton especifica que apenas uma instância da classe pode existir, e esta será utilizada por toda a aplicação. Dessa forma temos apenas um ponto de acesso central a esta instância da classe.

II. O que significa a letra D de SOLID e como se aplica na camada de Repository?

R:  Dependency Inversion Principle: Princípio da Inversão de Dependência — Dependa de abstrações e não de implementações.

III. Qual o objetivo das camadas?

R: Atribuir responsabilidades únicas para cada camada, assim fica mais fácil dar manutenção ao código.

IV. Qual arquitetura é melhor DDD, Hexagonal ou Clean?

R: DDD

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 9? Se não, justifique;

R: Sim

j) Desafio 10 - Spring:

I. Qual a diferença entre Java e Spring?

R: Java é a linguagem de programação, Spring é o framework para a plataforma Java.

II. É possível utilizar Spring Data sozinho?

R: Não.

III. É possível utilizar Spring Boot, Spring Data e Spring Security em apenas um projeto? Se sim, como é feito a integração?

R: Sim, basta inserir as dependências do Spring Data e Spring Security no pom.xml do projeto Spring Boot.

IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 10? Se não, justifique;

R: Sim

k) Desafio 11 - Libs:

I. Cite 5 libs que utilizou durante a trilha e suas respectivas funcionalidades;

R: springfox-swagger-ui - para fazer a documentação do projeto
h2 - para utilizar o banco de dados.
mapstruct - para mapear os dtos
jakarta.validation-api - para fazer a validação dos dados
junit - para fazer testes unitários no projeto.


II. Qual a diferença entre uma lib e um driver?

R: Driver: É basicamente um arquivo jar que contêm os meios para fazer a comunicação com o banco de dados.
Biblioteca: É um conjunto de classes e interfaces que facilitam e agilizam o desenvolvimento de sistema utilizando códigos prontos de terceiros.

III. Existe limite de libs por projeto?

R: Não

IV. Por que utilizar um gerenciador de dependências?

R: Pois eles gerenciam todas as ações com relação as dependências do projeto: listagem, adição, remoção e atualização. Além de analisar o grafo de dependência e garantir que as dependências dos pacotes utilizados no projeto também sejam obtidas, assim, facilitando demais a vida do desenvolvedor.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 11? Se não, justifique;

R: Sim

l) Desafio 12 - Testes unitários:

I. Por que DEVOPS exige uma porcentagem de cobertura mínima nos projetos?

II. Qual o objetivo de utilizar Mockito? Dê um exemplo;

III. O que é o Sonar? E qual é o seu papel?

IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 12? Se não, justifique;

R: Sim

m) Desafio 13 - Integração:

I. Como foi o processo de integração?
R: Simples, porém teve alguns erros no front-end que tiveram que ser ajustados.

II. Quais foram as principais dificuldades?

R: Fazer alterações no front.

III. Obteve algum erro de CORS?

R: Sim, tive que configurar o CORS no config do projeto.

IV. O que é CORS?

R: É um mecanismo utilizado pelos navegadores para compartilhar recursos entre diferentes origens. O CORS é uma especificação do W3C e faz uso de headers do HTTP para informar aos navegadores se determinado recurso pode ser ou não acessado.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 13? Se não, justifique;

R: Sim




</p>

