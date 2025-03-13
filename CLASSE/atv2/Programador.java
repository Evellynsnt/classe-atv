package atv2;

public class Programador extends Funcionario{
    private double salarioBaseProgramador = 5.000;
    private double bonusProgramador = 200;
    private int projetos;

    public Programador(String nome, double salarioBaseProgramador, double bonusProgramador, int projetos){
        super(nome);
        this.salarioBaseProgramador = salarioBaseProgramador;
        this.bonusProgramador = bonusProgramador;
        this.projetos = projetos;
    }

    
    public double getSalarioBaseProgramador() {
        return salarioBaseProgramador;
    }
    public void setSalarioBaseProgramador(double salarioBaseProgramador) {
        this.salarioBaseProgramador = salarioBaseProgramador;
    }
    public double getBonusProgramador() {
        return bonusProgramador;
    }
    public void setBonusProgramador(double bonusProgramador) {
        this.bonusProgramador = bonusProgramador;
    }
    public int getProjetos() {
        return projetos;
    }
    public void setProjetos(int projetos) {
        this.projetos = projetos;
    }


    public void calcularSalario(){
        System.out.println("Sálario do Programador: "+getNome()+ " Projetos:"+getProjetos()+" R$:"+salarioBaseProgramador+bonusProgramador);
    }
}