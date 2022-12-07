import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String nome_cliente, nome_pet, raca, nome_func, desc_serv, data, desc_prod;
        int idade_pet, tempo_serv, qntd;
        float salario, valor_serv, valor_prod;
        
        
        System.out.println("Digite o nome do cliente");
        nome_cliente = sc.nextLine();

        System.out.println("Digite o nome do pet");
        nome_pet = sc.nextLine();
        System.out.println("Digite a raça do pet");
        raca = sc.nextLine();
        System.out.println("Digite a idade o pet");
        idade_pet = sc.nextInt();

        Cliente cliente = new Cliente(nome_cliente);
        cliente.addPets(nome_pet, raca, idade_pet);
        clientes.add(cliente);

        System.out.println("Digite o nome do funcionario");
        nome_func = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        salario = sc.nextFloat();

        Funcionario funcionario = new Funcionario(nome_func, salario);
        funcionarios.add(funcionario);

        System.out.println("Digite a desc do servico");
        desc_serv = sc.nextLine();
        System.out.println("Digite o valor do servico");
        valor_serv = sc.nextFloat();
        System.out.println("Digite o tempo do servico");
        tempo_serv = sc.nextInt();

        Servicos banho = new Servicos(desc_serv, valor_serv, tempo_serv);

        System.out.println("Digite a data para agendar o servico");
        data = sc.nextLine();

        banho.addAgenda(cliente, funcionario, data);
        banho.addAgenda(cliente, funcionario, data);

        System.out.println("Digite a descricao da racao");
        desc_prod = sc.nextLine();
        System.out.println("Digite o valor do produto");
        valor_prod = sc.nextFloat();

        Produto racao = new Produto(desc_prod, valor_prod);
        Estoque estoque = new Estoque();

        System.out.println("Digite a quantidade de produtos");
        qntd = sc.nextInt();

        estoque.addProduto(racao, qntd);

        Venda venda = new Venda(cliente, data, estoque);

        System.out.println("Digite a quantidade de produtos");
        qntd = sc.nextInt();

        venda.addProduto(racao, qntd);
        venda.addProduto(racao, qntd);

        System.out.println(venda.valor);

        estoque.showEstoque();

    }
}
