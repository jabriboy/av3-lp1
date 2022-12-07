import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos = new ArrayList<>();

    public Estoque(){}

    public void addProduto(Produto produto, int qntd){
        if(produtos.contains(produto)){
            produtos.get(produtos.indexOf(produto)).qntd += qntd;
        }
        else{
            produto.qntd = qntd;
            produtos.add(produto);
        }
    }

    public void showEstoque(){
        try{
            produtos.forEach(n -> {System.out.println(n.desc+" - "+n.qntd+"\n");});
        }
        catch (Exception e) {
            System.err.println("Erro: "+e.getMessage());
        }
    }
}
