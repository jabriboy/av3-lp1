import java.util.ArrayList;

public class Venda {
    Cliente cliente;
    Estoque estoque;
    ArrayList<int[]> produtos = new ArrayList<>(2);
    String data;
    float valor;
    
    public Venda(){}

    public Venda(Cliente cliente, ArrayList<int[]> produtos, String data){
        this.cliente = cliente;
        this.produtos = produtos;
        this.data = data;
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i));
        }
    }

}
