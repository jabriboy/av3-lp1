import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Pet> pets = new ArrayList<>();

    public Cliente(){}

    public Cliente(String nome){
        this.nome = nome;
    }

    public void addPets(String nome, String raca, int idade){
        pets.add(new Pet(nome, raca, idade));
    }

    public void removePet(String nome, String raca){
        try{
            pets.forEach(n -> { if(n.nome == nome && n.raca == raca) pets.remove(n); });
        }
        catch (Exception e){
            System.err.println("Erro: "+e.getMessage());
        }
    }

    
}
