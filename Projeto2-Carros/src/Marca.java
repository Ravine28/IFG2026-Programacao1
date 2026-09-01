public class Marca {
    //atributos do objeto
    private int id;
    private String nome;

    //construtores do objeto
    public Marca(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    //métodos específicos do objeto
    public void salvar(){
        System.out.println("Marca " + this.nome + " inclusa com sucesso.");
    }

    public void alterar(){
        System.out.println("Marca " + this.nome + " atualizada.");
    }

    public void excluir(){
        System.out.println()
    }


    //métodos get & set
}
