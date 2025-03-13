package atv2;

public class MainFuncionario {
    public static void main(String[] args) {
         
        Gerente g = new Gerente("Evellyn", 7000);
        Programador p = new Programador("Lucas", 3000, 200, 3);

       g.calcularSalario();
       p.calcularSalario();
        

        
    }
}
