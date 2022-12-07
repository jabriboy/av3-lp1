public class Agenda {
    int id = 0;
    Cliente pessoa;
    float valor;
    Funcionario func;
    String data;

    public Agenda(){}

    public Agenda(int id, Cliente pessoa, Funcionario func, String data, float valor){
        this.id = id;
        this.pessoa = pessoa;
        this.func = func;
        this.data = data;
        this.valor = valor;
    }
}
