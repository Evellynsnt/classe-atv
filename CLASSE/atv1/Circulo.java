package atv1;

public class Circulo {
    private double pi;
    private double raio;

    public Circulo(double pi, double raio){
        this.pi = pi;
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calcularArea(){
        System.out.println("Área Círculo: "+(pi*(Math.pow(raio,2))));
    }
}
