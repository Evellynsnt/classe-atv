package atv1;

class Retangulo extends Forma{
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void calcularArea(){
        System.out.println("Área Retangulo: "+(largura*altura));
    }
}