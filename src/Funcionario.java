public class Funcionario extends Cliente{
    float salario;
    float comicao = 0;
    
    public Funcionario(String nome, String cpf, String data_nasc, float salario){
        super(nome, cpf, data_nasc);
        this.salario = salario;
    }

}
