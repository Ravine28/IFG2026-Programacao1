public class App {
    public static void main(String[] args) throws Exception {
        SerHumano humano = new SerHumano(); //criação de novo objeto para a lista de objetos

        humano.setIdade(); //atributo
        humano.setAltura();
        humano.setCorOlho();
        humano.setPeso();
        humano.setSexo();

        System.out.println("Idade: " + humano.getIdade());

        humano.correr(); //método
    }
}
