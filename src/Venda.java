public class Venda {
    Cliente pessoa;
    Estoque estoque;
    String data;
    float valor;
    
    public Venda(){}

    public Venda(Cliente pessoa, String data, Estoque estoque){
        this.pessoa = pessoa;
        this.estoque = estoque;
        this.data = data;
        this.valor = 0;
    }

    public void addProduto(Produto produto, int qntd){
        if(estoque.produtos.get(estoque.produtos.indexOf(produto)).qntd >= qntd){
            estoque.produtos.get(estoque.produtos.indexOf(produto)).qntd -= qntd;
            this.valor += estoque.produtos.get(estoque.produtos.indexOf(produto)).valor * qntd;
        }
        else{
            System.out.println("Sem estoque suficiente do produto: "+produto.desc);
        }
    }

}
