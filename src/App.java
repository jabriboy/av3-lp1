import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String nome_cliente, nome_pet, raca, nome_func, desc_serv, data, desc_prod, lixo, cpf, data_nasc;
        int idade_pet, tempo_serv, qntd;
        float salario, valor_serv, valor_prod;
        
        System.out.println("Digite o nome do cliente");
        nome_cliente = sc.nextLine();
        System.out.println("Digite o cpf do cliente");
        cpf = sc.nextLine();
        System.out.println("Digite a data de nascimento do cliente");
        data_nasc = sc.nextLine();

        System.out.println("Digite o nome do pet");
        nome_pet = sc.nextLine();
        System.out.println("Digite a raça do pet");
        raca = sc.nextLine();
        System.out.println("Digite a idade o pet");
        idade_pet = sc.nextInt();

        Cliente cliente = new Cliente(nome_cliente, cpf, data_nasc);
        cliente.addPets(nome_pet, raca, idade_pet);
        clientes.add(cliente);

        System.out.println("Digite o nome do funcionario");
        nome_func = sc.nextLine();
        lixo = sc.nextLine();
        System.out.println("Digite o salario do funcionario");
        salario = sc.nextFloat();
        lixo = sc.nextLine();
        System.out.println("Digite o cpf do funcionario");
        cpf = sc.nextLine();
        System.out.println("Digite a data de nascimento do funcionario");
        data_nasc = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome_func, cpf, data_nasc, salario);
        funcionarios.add(funcionario);

        funcionario.addPets("6543", "876543", 2);

        System.out.println("Digite a desc do servico");
        desc_serv = sc.nextLine();
        System.out.println("Digite o valor do servico");
        valor_serv = sc.nextFloat();
        System.out.println("Digite o tempo do servico");
        tempo_serv = sc.nextInt();

        Servicos banho = new Servicos(desc_serv, valor_serv, tempo_serv);

        lixo = sc.nextLine();
        System.out.println("Digite a data para agendar o servico");
        data = sc.nextLine();

        banho.addAgenda(cliente, funcionario, data);

        System.out.println("Digite a descricao do produto");
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

        System.out.println("\n");
        venda.addProduto(racao, qntd);
        
        System.out.println("Valor da venda: "+venda.valor);

        System.out.println("Estoque:\n");
        estoque.showEstoque();

        System.out.println("Valor da Agenda de banho -> id = 0");
        banho.showPreco(0);

    }
}
