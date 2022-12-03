public class Agenda {
    int id = 0;
    Cliente cliente;
    Pet pet;
    Funcionario func;
    String data;

    public Agenda(){}

    public Agenda(int id, Cliente cliente, Pet pet, Funcionario func, String data){
        this.id = id;
        this.cliente = cliente;
        this.pet = pet;
        this.func = func;
        this.data = data;
    }
}
