public class SerHumano {
    private String corOlho;     //atributo do objeto
    private String sexo;        //porque o nome deste tipo de dado "String" se escreve em maiúsculo?
    private float altura;
    private float peso;
    private int idade;

    public String getCorOlho(){ //chamando o valor do atributo e o retornando
        return corOlho;
    }

    public void setCorOlho(String corOlho) { //apontando o valor do atributo
        this.corOlho = corOlho;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    
}