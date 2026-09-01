
import java.time.LocalDate;

public class Veiculo {
    private int id;
    private String nome;
    private String cor;
    private String anoModelo;
    private String nChassi;
    private String placa;
    private LocalDate dataCompra;

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

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getAnoModelo(){
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo){
        this.anoModelo = anoModelo;
    }

    public String getNChassi(){
        return nChassi;
    }

    public void setNChassi(String nChassi){
        this.nChassi = nChassi;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public LocalDate getDataCompra(){
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra){
        this.dataCompra = dataCompra;
    }

    



}
