import java.util.ArrayList;

public class Servicos {
    String desc;
    float valor;
    int tempo;
    ArrayList<Agenda> agenda = new ArrayList<>();

    public Servicos(){}

    public Servicos(String desc, float valor, int tempo){
        this.desc = desc;
        this.valor = valor;
        this.tempo = tempo;
    }

    public void addAgenda(Cliente pessoa, Funcionario func, String data){
        float preco = this.valor;
        int id = agenda.size();
        String classe = pessoa.getClass().getSimpleName();
        if(classe == "Funcionario") preco *= .9;

        try{
            agenda.add(new Agenda(id, pessoa, func, data, preco));
            func.comicao += (this.valor * .2);
            System.out.println();
        }
        catch (Exception e){
            System.err.println("Erro: "+e.getMessage());
        }
    }

    public void removeAgenda(int id){

        agenda.forEach(n -> { if(n.id == id) {n.func.comicao -= (n.valor * .2); agenda.remove(n);} });
    }
    
    public void showPreco(int id){
        
        agenda.forEach(n -> { if(n.id == id) System.out.println(n.valor); });
    }

}
