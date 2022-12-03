import java.util.ArrayList;

public class Cliente {
    String nome;
    int id;
    ArrayList<Pet> pets = new ArrayList<>();

    public Cliente(){}

    public Cliente(String nome){
        this.nome = nome;
    }

    public void addPets(String nome, String raca, int idade){
        pets.add(new Pet(nome, raca, idade));
    }

    public void removePet(String nome, String raca){
        pets.forEach(n -> { if(n.nome == nome && n.raca == raca) pets.remove(n); });
    }

    
}
