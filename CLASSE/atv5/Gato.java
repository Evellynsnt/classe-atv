package atv12;

public class Gato extends Animal implements interAnimal{
    private String cor;

    public Gato(String nome, String tipo, String cor) {
        super(nome, tipo);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void fazerSom(){
        System.out.println(this.getNome()+" está miando");
    }
}
