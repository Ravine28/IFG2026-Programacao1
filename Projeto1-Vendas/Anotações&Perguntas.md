Em um fluxo de desenvolvimento, qual a melhor prática, criar a classe APP primeiro ou as outras? Qual o melhor fluxo a se seguir no desenvolvimento de uma aplicação?
    --> 1: modelos (pessoa)
    --> 2: regras (verificador de cpf)
    --> 3: ponto de entrada (app)

Porque *String* começa com letra maiúscula?
    Porque em Java temos dois grandes grupos de *tipos de dados*: *Primitivos* e *Referência*
    Tipagem Primitiva são iniciadas com letras minúsculas: int, float, double, boolean, char, byte, short, long... Estes guardam o valor bruto diretamente em memória. Não possuem métodos, comportamentos e nem são instanciáveis
    Tipagem Referenciada são iniciadas com letras maiúsculas: String (nativeClass --> java.lang.String). Uma variável deste tipo é guardada em memória

Get e Set são MÉTODOS PÚBLICOS. Tais métodos agem como interruptoes e conectores de um circuito elétrico.

*this* nada mais é do que um ponteiro para alocação em memória

Stack é onde a operação (partes isoladas) acontece, Heap e onde ficam os objetos grandes o bastante pra não caberem na Stack

Set vs Construtor: Construtor é como se fosse a certidão de nascimento do objeto (que roda uma única vez), já o Set serve para que alterações ao longo da vida do objeto sejam feitas sem a necessidade de se criar um novo objeto do zero. Ex:com Set é possível atualizar a data do objeto a cada ano, sem o Set, somente com o construtor, a cada ano eu precisaria criar um novo objeto com a data atualizada.

Caso um atributo seja fixo, não há necessidade do SET

Encapsulamento --> presença de private na declaração dos atributos e de public seguidos de get e set

Herança --> extends (palavra chave que cria linha evolutiva entre as classes)

Polimorfismo --> @Override (palavra que ativa o polimorfismo): objetos iguais de comportamentos diferentes. Cliente e Funcionário herdam de SerHumano mas possuem métodos com comportamentos diferentes - APENAS MÉTODOS.
    No Java ATRIBUTOS NÃO SÃO POLIMÓRFICOS, caso exista o SHADOWING acontece gerando confusão na RAM.

Pegada na RAM (RSS) = Heap + Metaspace + Thread Space (Stack) + Outras áreas nativas

GET and SET nada mais são do que FUNÇÕES!!

