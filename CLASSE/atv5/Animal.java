package atv12;

public abstract class Animal {
    private String nome;
    private String tipo;
    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

interface interAnimal{
    abstract void fazerSom();
}
