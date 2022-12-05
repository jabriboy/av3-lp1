import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Cliente cliente = new Cliente("gabriel");
        cliente.addPets("milka", "bulldog", 1);
        clientes.add(cliente);

        Funcionario funcionario = new Funcionario("fulano", 1200);
        funcionarios.add(funcionario);

        Servicos banho = new Servicos("banho", 50, 40);

        banho.addAgenda(cliente, funcionario, "01-01-2001");
        banho.addAgenda(cliente, funcionario, "20-01-2001");

        Produto racao = new Produto("racao", 100);
        Estoque estoque = new Estoque();

        estoque.addProduto(racao, 10);

        Venda venda = new Venda(cliente, "01-01-2001", estoque);
        venda.addProduto(racao, 1);
        venda.addProduto(racao, 3);

        System.out.println(venda.valor);

        estoque.showEstoque();


        // usando a classe petshop
        // PetShop petshop = new PetShop();
        // petshop.addCliente("gabriel");
        // petshop.addPet("gabriel", "milka", "bulldog", 1);

        // petshop.addFuncionario("fulano", 1200);

        // petshop.showClientes();
        // petshop.showEstoque();
        // petshop.addProduto();
    }
}
