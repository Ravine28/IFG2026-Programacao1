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

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}