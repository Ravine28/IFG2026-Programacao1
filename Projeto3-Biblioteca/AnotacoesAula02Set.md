Qual a necessidade e justificativa da existência de um construtor cheio e um construtor vazio?

No banco de dados a tabela é correspondente a uma classe em Java;
No banco de dados a coluna correnponde ao atributo em Java;
No banco de dados uma linha completa corresponde a um objeto já instanciado;

Na prática quando sobrescrevo um objeto, o objeto anterior é perdido?

Quando busco um dado pelo System.out.println que está hierarquizado, estou lidando com encapsulamento ou herança? Já que herança deve ter @extends, então seria encapsulamento? Como, ao bater o olho no código, eu defino se é encapsulamento, herança ou polimorfismo?

Como diferenciar uma redundância de uma Sobrecarga (Overloading)?

É correto pensar que Encapsulamento acontece nos Métodos e Herança/Polimorfismo acontece nos Atributos?

Sobrecarga de Construtores --> Polimorfismo Estático
    É a capacidade do Java de criar objetos de diferentes maneiras
    ex.: public Cliente(int idCliente, int cpf, String nome){}
         public Cliente(int idCliente){}
         public Cliente(){} --> Construtor Padrão/Vazio
            "A grande regra do Java: Se você não escrever nenhum construtor no seu código, a JVM cria um construtor vazio invisível para você por padrão. Porém, a partir do momento em que você escreve qualquer construtor personalizado (como o de 3 parâmetros), o Java desativa esse comportamento automático."
                O CONSTRUTOR PADRÃO existe para instanciar o objeto de forma "neutra" na Heap, para que então depois os objetos sejam preenchidos via set.

Pensando no código quando vira uma tela, as Superclasses são apenas modelos que as classes irão usar.

TODA HERANÇA tem uma Superclasse;

o SET permite alterações dos valores do objeto, já o CONSTRUTOR não permite;

Polimorfismo de Sobrescrita vs Polimorfismo de Sobrecarga