import java.util.ArrayList;

public class Estoque {
    ArrayList<int[]> produtos = new ArrayList<>(2);
    ArrayList<Produto> prod = new ArrayList<>();

    public Estoque(){}

    public void addProduto(Produto produto, int qntd){
        int vetor[] = new int[2];
        vetor[0] = produto.id;
        vetor[1] = qntd;
        produtos.forEach(n -> {if (n[0] == produto.id) n[1] += qntd; else produtos.add(vetor); });
        if(!prod.contains(produto)){
            prod.add(produto);
        }
    }
}
