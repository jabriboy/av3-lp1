import java.util.ArrayList;

public class PetShop {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Servicos> servicos = new ArrayList<>();
    ArrayList<Venda> vendas = new ArrayList<>();
    Estoque estoque;
    
    public PetShop(){
        this.estoque = new Estoque();
    }

    public void addServico(String desc, float valor, int tempo){
        servicos.add(new Servicos(desc, valor, tempo));
    }

    public void agendarServico(String desc, String nomeCliente, String nomeFunc, String data){
        // servicos.forEach(n -> {if(n.desc == desc) ;});
    }

    public void addCliente(String nome){
        clientes.add(new Cliente(nome));
    }

    public void addPet(String nomeCliente, String nome, String raca, int idade){
        clientes.forEach(n -> {if(n.nome == nomeCliente) n.addPets(nome, raca, idade);});
    }

    public void addFuncionario(String nome, float salario){
        funcionarios.add(new Funcionario(nome, salario));
    }

    public void showClientes(){
        clientes.forEach(n -> {System.out.println(n.nome+"\n");});
    }
    
    public void showFuncionarios(){
        funcionarios.forEach(n -> {System.out.println(n.nome+" - "+n.salario+" + "+n.comicao);});
    }

    public void addProduto(){
        
    }

    public void showEstoque(){
        estoque.showEstoque();
    }
}
