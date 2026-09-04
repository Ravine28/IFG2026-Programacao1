public class Cliente{
    private int idCliente;
    private int cpf;
    private String nome;

    public Cliente(int idCliente, int cpf, String nome){ //construtor
        this.idCliente = idCliente;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente(int idCliente){ //construtor
        this.idCliente = idCliente;
    }
    
    public Cliente(){ //construtor

    }
    
    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public int getCpf(int cpf){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}