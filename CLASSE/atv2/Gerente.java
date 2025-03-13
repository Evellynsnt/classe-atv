package atv2;

public class Gerente extends Funcionario{
    private double salarioFixoGerente;
    public Gerente(String nome, double salarioFixoGerente){
        super(nome);
        this.salarioFixoGerente = salarioFixoGerente;
    }

    public double getsalarioFixoGerente() {
        return salarioFixoGerente;
    }

    public void setSalarioBase(double salarioFixoGerente) {
        this.salarioFixoGerente = salarioFixoGerente;
    }

   
    public void calcularSalario(){
        System.out.println("Sálario do Gerente: "+getNome()+" R$:"+salarioFixoGerente);
    }
    
}
