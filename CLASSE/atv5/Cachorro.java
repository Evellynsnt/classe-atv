package atv12;

public class Cachorro extends Animal implements interAnimal{
    private String raca;

    public Cachorro(String nome, String tipo, String raca) {
        super(nome, tipo);
        this.raca = raca;
    }

    public void fazerSom(){
        System.out.println(this.getNome()+" Está latindo");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}