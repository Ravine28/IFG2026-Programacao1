public class Categoria{
    //atributos do objeto
    private int id;
    private String nome;

    //construtor do objeto
    public Categoria(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    //métodos específicos do objeto
    public void salvar(){
        //System = classe nativa do Java que acessa dados inputados
        //out = orienta pra onde o System deve enviar os dados coletados
        //println = imprime na tela o dado coletado e pula para a linha seguinte
        System.out.println("Categoria veicular " + this.nome + " salva com sucesso!");
    }

    public void alterar(){
        System.out.println("Categoria veicular " + this.nome + "atualizada com suceso!");
    }

    public void excluir (){
        System.out.println("Categoria veicular " + this.nome + "removida do sistema!");
    }

    public void pesquisar (){
        System.out.println("Categoria " + this.nome + "encontrada.");
        //e caso o sistema não encontre a categoria, não deveria ter uma estrutura de verificação?
    }

    //método get & set
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}