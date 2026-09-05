import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<Cliente> listaClientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("Informe o nome do cliente com id: " + i);
            String nome = scanner.nextLine();
            Cliente flavio = new Cliente(i, 123456, nome);

            listaClientes.add(flavio);
        }


        for (Cliente cliente : listaClientes) {
            System.out.println("ID do cliente: " + cliente.getIdCliente());
            System.out.println("Nome do cliente: " + cliente.getNome() + "\n");
        }

        scanner.close();
    }
}