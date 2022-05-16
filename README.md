# padroes-de-projeto-em-java
Repositório do curso de padrões de projeto da cod3r 

### Padrões de Projeto Criacionais

#### Factory Method
##### Resolve o problema de criar objetos de produto sem especificar suas classes concretas
Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe 
instanciar. O Factory Method permite a uma classe deferir a instanciação para subclasses.

#### Abstract Factory
##### Um padrão que permite produzir famílias de objetos relacionados sem especificar suas classes concretas
O Abstract Factory tem como objetivo prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

#### Singleton
##### Garante que uma classe tenha apenas uma instância e que essa única instância possa ser acessada globalmente
Imagine que você criou um objeto, mas depois de um tempo decidiu criar um novo. Em vez de receber um novo objeto, você receberá o que já criou.

#### Monostate
##### O padrão monostate é geralmente referido como um syntatic sugar sobre o Singleton
O Monostate evita as complicações de ter uma única instância de uma classe, mas todas as instâncias usam os mesmos dados, isso é feito utilizando membros estáticos.

#### Builder
##### Delega a criação de objetos para um builder ao invés de instanciar o objeto concreto diretamente
Separa a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes.

#### Prototype
##### Define um prototype que retorna uma cópia de si mesmo
Especifica os tipos de objetos a serem criados usando uma instância como protótipo e cria novos objetos ao copiar este protótipo.