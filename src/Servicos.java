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

    public void addAgenda(Cliente cliente, Funcionario func, String data){
        int id = agenda.size();
        agenda.add(new Agenda(id, cliente, func, data));
        func.comicao += (this.valor * .2);
    }

    public void removeAgenda(int id){
        agenda.forEach(n -> { if(n.id == id) {n.func.comicao -= (this.valor * .2); agenda.remove(n);} });
    }

}
